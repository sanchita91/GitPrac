package bit.com;




	
	import java.util.List;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Array {
		WebDriver driver;

		void openBrowser() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://www.target.com");
			// driver.manage().window().maximize();
			Thread.sleep(3000);

			/*
			 * Requires Java Library You need to import the library
			 * org.openqa.selenium.Dimension into your Java project before implementing the
			 * resize action in your script.
			 */

			Dimension dimension = new Dimension(1800, 1080);
			driver.manage().window().setSize(dimension);

		}

		@Test
		public void test1() throws InterruptedException {
			openBrowser();

			driver.findElement(By.cssSelector("#secondary")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#deals-clearance>a")).click();
			Thread.sleep(10000);

			List<WebElement> a = driver.findElements(By.cssSelector(".Row-uds8za-0.jBYETz.h-padding-t-tight>li"));
			int size = a.size();
			System.out.println(size);

			for (int i = 1; i <= size; i++) {
				String s1 = "clearance".toLowerCase();
				String s2 = "select items on clearance".toLowerCase();

				String sale = driver.findElement(By.cssSelector(
						".Row-uds8za-0.jBYETz.h-padding-t-tight>" + "li:nth-child(" + i + ") .h-text-red.h-text-sm"))
						.getText().toLowerCase();
				System.out.println(sale);
				if (sale == "clearance") {
					System.out.println("inside the loop");
					Thread.sleep(3000);
					String s = driver
							.findElement(By.cssSelector(
									".Row-uds8za-0.jBYETz" + ".h-padding-t-tight>li:nth-child(" + i + ") .h-text-red>span"))
							.getText();
					System.out.println(s);
				} else if (sale == s2) {
					System.out.println("Sale S2");
				} else {
					System.out.println("No match found for " + i);
				}

			}

			Thread.sleep(3000);
			driver.quit();
		}

		@Test
		public void abc() {
			System.out.println("");
			int a = 10;
			String s = "hi";
			String d = new String("hello");

			// each value is conceder as an object in array
			int[] b = { 12, 13, 2 };
			String color[] = { "blue", "pink", "black" };

			// array always has fix size
			String s3[] = new String[3];
			s3[0] = "car";
			s3[1] = "car 2";
			s3[2] = "car 3";
			// s3[3] = "car 4"; //array out of boundary exception

			// String s4[] = new String[number];

			for (int i = 0; i < s3.length; i++) {
				System.out.println(s3[i]);
			}

			for (int i = s3.length - 1; i >= 0; i--) {
				System.out.println(s3[i]);
			}

			// double dimension array
			// first parameter is the parent and 2nd parameter is the child
			int z[][] = new int[2][3];
			z[0][0] = 12;
			z[0][1] = 122;
			z[0][2] = 123;
			z[1][0] = 124;
			z[1][1] = 125;
			z[1][2] = 126;

			for (int i = 0; i < z.length; i++) {
				for (int j = 0; j < z[i].length; j++) {
					System.out.println(z[i][j]);
				}
			}

			int aa = returnThesumOf2largestNumberFromAnarray();
			System.out.println(aa);
		}

		public int returnThesumOf2largestNumberFromAnarray() {
			
			//find different one from Internet it looks complicated

			int values[] = { 12, 33, 1, 22, 234, 875, 54 };

			int largestA = 0;//
			int largestB = 0;//12

			for (int value : values) {
				if (value > largestA) {
					largestB = largestA;
					largestA = value;
				} else if (value > largestB) {
					largestB = value;
				}
			}
			return largestA + largestB;

		}
		
		@Test
		public void targetClearencePriceVerify2() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("clearence");
			driver.findElement(By.xpath("//button[text()='go']")).click();
			Thread.sleep(5000);
			List<WebElement> eles = driver.findElements(By.xpath("//div[@data-component-id='WEB-210977']/div/div/ul/li/a/div[1]/div/div/picture/img"));
			System.out.println(eles.size());
			for(int i = 2; i<=eles.size(); i++) {
		      WebElement ele = driver.findElement(By.xpath("//div[@data-component-id='WEB-210977']/div/div/ul/li["+i+"]/a/div[1]/div/div/picture/img"));
			     ele.click();
			     Thread.sleep(8000);                      
			     List<WebElement> eles2 = driver.findElements(By.xpath("//*[@id=\"mainContainer\"]/div[3]/div[2]/div/div[1]/div[3]/div[2]/ul/li/div"));
			     for(int j = 1; j<=eles2.size(); j++) {
			    	 WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/div[3]/div[2]/div/div[1]/div[3]/div[2]/ul/li["+j+"]/div"));
			         WebElement clear = driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/div[3]/div[2]/div/div[1]/div[3]/div[2]/ul/li[1]/div/div[2]/div/div/div/div[2]/div/div[1]/span"));
			         //$18.74 - $19.99
			         String w[] = clear.getText().replace("$", "").split(" - ");
						double clearence1 = Double.parseDouble(w[0]);
						double clearence2 =Double.parseDouble(w[1]);
			        WebElement reg = driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/div[3]/div[2]/div/div[1]/div[3]/div[2]/ul/li[1]/div/div[2]/div/div/div/div[2]/div/div[2]"));
			        //regular $24.99
			        String w2 = reg.getText().replace("reg $", "");
					double regular = Double.parseDouble(w2);
					if(regular > clearence1 || regular > clearence2) {
						System.out.println("clearence is ok");
			     }
					}
			     driver.navigate().back();
				    	Thread.sleep(3000); 
				    	}
		
		
		//how to get max or minimum number from an array 
		//how to return an array 
		//how to parameterized an array 
		//how to declare double dimension array 
		//find a duplicate value from an array 
		//how to find the smallest value from an unsorted array 
		//Arrays class built in methods 
		
		}
	}
		
		
		

	