import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilitiesDemo {
	
	public static void main(String args[])
	{
		
	            DesiredCapabilities caps= new DesiredCapabilities();
	            caps.setCapability("ignorePr", false);
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/search?q=selenium&rlz=1C1CHBF_enIN923IN923&oq=selenium&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIKCAEQABixAxiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIGCAUQRRg8MgYIBhBFGDwyBggHEEUYPNIBCDM1NzZqMGo3qAIIsAIB8QXuUHWD5lPGCvEF7lB1g-ZTxgo&sourceid=chrome&ie=UTF-8");
			
	}

}
