package testing.org;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void webloginCarLoan() {
		System.out.println("webloginCarLoan");
		System.out.println("test branch 1");
		System.out.println("test branch 2");
		System.out.println("test branch 3");
		System.out.println("test branch 4");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("i am before method");
	}	
	
	@Test(enabled=false)
	public void mobileloginsignLoan() {
		System.out.println("sign in");
		
	}
	@AfterMethod
	public void aftermethods() {
		System.out.println("i am after method");
	}
	@Test
	public void mobileloginSignoutLoan() {
		System.out.println("signout");
		
	}
	@Test(dataProvider="getData")
	
	public void obilelogin(String username,String pass) {
		System.out.println(username);
		System.out.println(pass);
		
		
	}
	@Test
	public void mobileloginPinCarLoan() {
		System.out.println("hu");
		System.out.println("hi");
		
		
	}
	@AfterSuite
	public void beforesuite() {
		System.out.println("I am after suite");
		
	}
	
	//@Test(dependsOnMethods= {"mobileloginPinCarLoan"})
	@Test
	public void ApiCarLoan() {
		System.out.println("ApiCarLoan");
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="password";
		data[1][0]="secUsername";
		data[1][1]="SecPass";
		data[2][0]="Thirduser";
		data[2][1]="ThirdPass";
		return data;
	}


}
