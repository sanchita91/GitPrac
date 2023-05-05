package testing.org;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day1 {
	@Parameters({"url"})
	@Test
	public void Demo(String url) {
		
		System.out.println("TEST 1");
		System.out.println("TEST 2");
		System.out.println("TEST 3");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("i am before class");
	}
	@Test(groups= {"smoke"})
	public void SecondTest() {
		
		System.out.println("bye");
		
	}

}
