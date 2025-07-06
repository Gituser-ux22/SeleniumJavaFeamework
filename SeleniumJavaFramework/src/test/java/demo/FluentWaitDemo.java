package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumWaits();
	}
	
	
	public static void seleniumWaits()
	{
		
		WebDriver driver=new  ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.google.com/search?q=car&sca_esv=85c3db24b1142714&ei=_z1paLWnNK7vseMPi-izuQo&ved=0ahUKEwj1oqXy_aWOAxWud2wGHQv0LKcQ4dUDCBA&uact=5&oq=car&gs_lp=Egxnd3Mtd2l6LXNlcnAiA2NhcjIQEAAYgAQYsQMYQxjJAxiKBTIKEAAYgAQYQxiKBTIQEC4YgAQY0QMYQxjHARiKBTINEAAYgAQYsQMYQxiKBTIQEAAYgAQYsQMYQxiDARiKBTITEC4YgAQYsQMY0QMYQxjHARiKBTIQEC4YgAQY0QMYQxjHARiKBTIQEC4YgAQY0QMYQxjHARiKBTINEC4YgAQYQxjUAhiKBTILEAAYgAQYkgMYigVI3BRQrwZY2g1wAXgBkAEAmAHUAaAB-QKqAQUwLjEuMbgBA8gBAPgBAZgCA6ACjAPCAgoQABiwAxjWBBhHwgINEAAYgAQYsAMYQxiKBcICERAuGIAEGLEDGNEDGIMBGMcBwgILEAAYgAQYsQMYgwHCAg4QABiABBixAxiDARiKBcICBRAAGIAEmAMAiAYBkAYKkgcFMS4xLjGgB78VsgcFMC4xLjG4B4cDwgcDMi0zyAcR&sclient=gws-wiz-serp");
	    
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    	       .withTimeout(Duration.ofSeconds(30L))
	    	       .pollingEvery(Duration.ofSeconds(5L))
	    	       .ignoring(NoSuchElementException.class);

	    	   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	    	     public WebElement apply(WebDriver driver) {
	    	       WebElement linkElement= driver.findElement(By.xpath("//h3[text()='Can You Fool A Self Driving Car?']"));
	    	     
	    	       if(linkElement.isEnabled())
	    	       {
	    	    	   System.out.println("Element found");
	    	       }
				return linkElement;
	    	     
	    	     }
	    	   });

	  //  driver.findElement(By.xpath("//h3[text()='CarWale: New Cars, Used Cars, Buy a Car, Sell Your Car']")).click();
	  // driver.findElement(By.name("agnhjm")).sendKeys(Keys.RETURN);
	    	}

}
