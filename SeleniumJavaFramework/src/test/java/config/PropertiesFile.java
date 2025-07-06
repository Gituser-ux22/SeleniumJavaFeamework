package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.BrowserTest;


public class PropertiesFile   {
	
	static Properties prop=new Properties();
	static String projectpath=System.getProperty("user.dir");
	
	public static void main(String[] args)
	{
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties()
	{
		try {

				InputStream input =new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
				prop.load(input);
				String browser= prop.getProperty("browser");
				System.out.println(browser);
				BrowserTest.browsername=browser;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void setProperties()
	{
		try {

				OutputStream output =new FileOutputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
				//prop.setProperty("browser","firefox");
				prop.setProperty("RESULT","PASS");
				prop.store(output, null);
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
