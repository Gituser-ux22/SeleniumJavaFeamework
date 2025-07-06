package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		test();
	}

	public static void test() throws IOException, InterruptedException {
        WebDriver driver=new  ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
	   // driver.findElement(By.xpath("//input[@name='userfile']")).click();
	    
	    Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
	    Thread.sleep(50);
	    

	}

}
