package testing.org;

import org.testng.annotations.Test;

public class Day4 {
	@Test(timeOut=4000)
	public void webloginHomeLoan() {
		System.out.println("webloginHomeLoan");
		
	}
	@Test
	public void mobileloginHomeLoan() {
		System.out.println("mobileloginHomeLoan");
		
	}
	@Test(groups= {"smoke"})
	public void loginApiHomeLoan() {
		System.out.println("loginApiHomeLoan");
		
	}

}
