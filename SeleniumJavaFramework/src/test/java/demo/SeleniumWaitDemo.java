package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumWaits();
	}
	
	@SuppressWarnings("deprecation")
	public static void seleniumWaits()
	{
		
		WebDriver driver=new  ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("car");
	   // driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    
	   WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	    
	    WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("agnhjm")));
	   // driver.findElement(By.name("agnhjm")).sendKeys(Keys.RETURN);
	    	}

}
