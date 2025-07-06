package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;


public class GoogleSearchText {
	
	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("car");
		
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	     
	}

}
