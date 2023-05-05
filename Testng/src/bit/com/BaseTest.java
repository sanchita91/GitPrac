import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  
	@Parameters({"browser","url"})
  @BeforeMethod(groups="ui")
  public void beforeMethod(String b,String url) {
		if(b.equals("chrome")) {
			//open chrome browser
		}else if(b.equals("firefox")) {
			//open firefox browser
		}
		//dr.get(url);
	  System.out.println("bm");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod(ITestResult arg0) {
	  if(arg0.getStatus()==ITestResult.FAILURE)  
      {
      	System.out.println(arg0.getName()+"screenshot is failure");
  }
	  else if(arg0.getStatus()==ITestResult.SUCCESS){
		  System.out.println(arg0.getName()+"is Sucess");
	  
  }
	  else if(arg0.getStatus()==ITestResult.SKIP) {
		  System.out.println(arg0.getName()+"is skiped");
	  }
	  
	  
	  
	  
  }


  
  private void elseif(boolean b) {
	// TODO Auto-generated method stub
	
}

@BeforeClass(enabled=false)
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ac");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}