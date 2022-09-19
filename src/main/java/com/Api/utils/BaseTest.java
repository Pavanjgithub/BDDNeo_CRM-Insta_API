package com.Api.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Api.constants.AutoConst;
import com.Api.utils.FileLib;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
/**
 * 
 * @author ShilpaShree
 *
 */
public class BaseTest implements AutoConst {
	
	
	public FileLib flib = new FileLib();
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public WebDriverWait wait;
	public Logger logger;

	
	@BeforeSuite
	public void setupReport()
	{
        // start reporters
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"./reports/extent.html");
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
	}
	
	@AfterMethod
    public void getResult(ITestResult result) throws Throwable
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test method FAILED due to below issues:", ExtentColor.RED));
//            TakesScreenshot ts=(TakesScreenshot) driverWeb;
//    		File src=ts.getScreenshotAs(OutputType.FILE);
//    	
//    		File dest=new File("./reports/Screenshot/" + result.getName()+ ".png");
//    		try 
//    		{
//    			Files.copy(src, dest);
//    		
//    		} 
//    		catch (IOException e) 
//    		{
//    			// TODO Auto-generated catch block
//    			e.printStackTrace();
//    		}
//    		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("./reports/Screenshot/"+result.getName()+".png").build());//not visible in local system but seen on other system
//            // test with snapshot
//            test.addScreenCaptureFromPath("../reports/Screenshot/"+result.getName()+".png");//visiable in local system but not on others system
    		test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        else
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
	
	
	
	@BeforeClass
	public void setup()
	{
		logger=Logger.getLogger("empRestAPI");//added logger
		PropertyConfigurator.configure("log4j.properties");//added looger
		logger.setLevel(Level.DEBUG);
	}


	
	
	@AfterSuite
	public void teardownReport() throws Throwable 
	{
		 extent.flush();
	
	}
	

}