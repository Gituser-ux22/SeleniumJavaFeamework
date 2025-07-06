package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;
import Pages.GoogleSearchPageObject;


public class GoogleSearchPageTest {
	
	private static WebDriver driver=null;
	

	
	public static void main(String[] args)
	{
		googleSearchTest();
	}
	
	public static void googleSearchTest()
	{

		driver=new ChromeDriver();
		GoogleSearchPageObject searchObj= new GoogleSearchPageObject(driver);
		
         driver.get("https://www.google.co.in/");
		
         searchObj.textbox_search("car");
		
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	}

}
