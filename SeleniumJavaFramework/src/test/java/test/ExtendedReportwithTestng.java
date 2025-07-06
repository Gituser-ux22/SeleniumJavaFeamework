package test;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPage;

public class ExtendedReportwithTestng {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUp()
	{
		 htmlReporter = new ExtentHtmlReporter("extentReport.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);	
	}
	
	@Test
	public void test() throws IOException
	{
		ExtentTest test = extent.createTest("Google Search Test one","this to search fuctionality");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		test.log(Status.INFO, "Starting testcase");
		driver.get("https://www.google.co.in/");
		test.pass("navigate to google");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("car");
		test.pass("Enter value in keyboard");
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		test.pass("click on enter",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreencastFromPath("screenshot.png");
		//test.fail("click on enter");
	
		driver.close();
		test.info("Test completed");
		
		
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}

}
