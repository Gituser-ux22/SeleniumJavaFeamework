package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPage;

public class ExtentReportBasicDemo {
	
	public static void main(String args[])
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Google Search Test one","this to search fuctionality");

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		test.log(Status.INFO, "Starting testcase");
		driver.get("https://www.google.co.in/");
		test.pass("navigate to google");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("car");
		test.pass("Enter value in keyboard");
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//test.pass("click on enter");
		test.fail("click on enter");
	
		driver.close();
		test.info("Test completed");
		
		extent.flush();
	}

}
