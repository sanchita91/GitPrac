package bit.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class BaseListener implements ITestListener{
	
	@Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
		System.out.println(arg0.getName()+" Test is finished");
        
    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
    	System.out.println(arg0.getName()+" Test is started");
        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        if(arg0.getStatus()==ITestResult.FAILURE)  
        {
        	System.out.println(arg0.getName()+"screenshot is failure");
    }
    }
    @Override
    public void onTestSkipped(ITestResult arg0) {
    	if(arg0.getStatus()==ITestResult.SKIP)
    		System.out.println(arg0.getName()+"is skiped");
    	{
        
    }
    }
    @Override
    public void onTestStart(ITestResult arg0) {
   System.out.println(arg0.getName()+"test started");        
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
    	if(arg0.getStatus()==ITestResult.SUCCESS) {
    		System.out.println(arg0.getName()+"code is success");
    		screenshot();
        
    }

}
    public void screenshot()
    {
    	TakesScreenshot scrshot=((TakesScreenshot)dr);
    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    	File DestFile=new File("/Users/bittech/Desktop/BTC07312021M/TestNGProject2106/SreenShot");
        Files.copy(SrcFile, DestFile);

    }
    public void saprac() {
    	SoftAssert s=new SoftAssert() ;
    	s.assertTrue(3>5);
    	s.assertFalse(3<5);
    	s.assertAll(); // through asert all it will grab all the assert unmacth condition
    		Reporter.log("Test1");
    	
    }

}
