

package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Pages.GoogleSearchPage;
import Pages.GoogleSearchPageObject;

public class TestNG_Demo2 {
	
	private static WebDriver driver=null;
	

@BeforeTest
	public void setUpTest()
	{
		driver=new ChromeDriver();	
	}
	
@Test	
	public  void googleSearchTest2()
	{

	//	driver=new ChromeDriver();
		GoogleSearchPageObject searchObj= new GoogleSearchPageObject(driver);
		
         driver.get("https://www.google.co.in/");
		
         searchObj.textbox_search("car");
		
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	}

@Test	
public  void googleSearchTest3()
{

//	driver=new ChromeDriver();
	GoogleSearchPageObject searchObj= new GoogleSearchPageObject(driver);
	
     driver.get("https://www.google.co.in/");
	
     searchObj.textbox_search("car");
	
	
	GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
}
	
@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}

