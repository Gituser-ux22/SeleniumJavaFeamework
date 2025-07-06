package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.PropertiesFile;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static String browsername=null;
	
	public static void main(String[] args)
	{
		//WebDriverManager.firefoxdriver().setup();

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jeeva Praneshan A\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckhodriver");
		//WebDriver driver=new FirefoxDriver();
		PropertiesFile.getProperties();
		String projectpath=System.getProperty("user.dir");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.out.println(projectpath);
			
			//WebDriver driver=new InternetExplorerDriver();
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/search?q=selenium&rlz=1C1CHBF_enIN923IN923&oq=selenium&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIKCAEQABixAxiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBCDM1NzZqMGo3qAIIsAIB8QXuUHWD5lPGCvEF7lB1g-ZTxgo&sourceid=chrome&ie=UTF-8");
		   PropertiesFile.setProperties();
		}
		if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/search?q=selenium&rlz=1C1CHBF_enIN923IN923&oq=selenium&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIKCAEQABixAxiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBCDM1NzZqMGo3qAIIsAIB8QXuUHWD5lPGCvEF7lB1g-ZTxgo&sourceid=chrome&ie=UTF-8");

		}
		
		/*System.out.println(projectpath);
		
		//WebDriver driver=new InternetExplorerDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=selenium&rlz=1C1CHBF_enIN923IN923&oq=selenium&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIKCAEQABixAxiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBCDM1NzZqMGo3qAIIsAIB8QXuUHWD5lPGCvEF7lB1g-ZTxgo&sourceid=chrome&ie=UTF-8");
	*/
	     
	}

}
