package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadlessChromwDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumHeadless();
	}
	
	public static void seleniumHeadless()
	{
		ChromeOptions chrome= new ChromeOptions();
		chrome.addArguments("--headless");
		//chrome.addArguments("window-size=1920,1080");
		WebDriver driver=new  ChromeDriver(chrome);
		
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("car");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println("Completed");
	   
	    
	  	}

}
