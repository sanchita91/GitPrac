package testing.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@AfterTest
	public void afterTest() {
		System.out.println(" i will execute last");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am before suite");
		
	}

	@Test(groups= {"smoke"})
	public void ploan() {
		
		System.out.println("good");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("i am after class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println(" i will execute first");
	}


}
