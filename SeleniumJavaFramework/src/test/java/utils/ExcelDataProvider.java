package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	/*public static void main(String args[])
	{
		try {
			testData("C:\\Users\\Jeeva Praneshan A\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx","Sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	WebDriver driver;
	@BeforeTest
	public void setUpTest()
	{
		 driver=new ChromeDriver();	
	}
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password) throws InterruptedException
	{
		System.out.println(username+" "+password);
		driver.get("https://www.facebook.com/");
		//wait(5);
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys(password);
		//driver.findElement(By.name("username")).sendKeys(username);
		//driver.findElement(By.name("password")).sendKeys(password);
	}
	@DataProvider(name="test1data")
	public Object[][] getData() throws IOException
	{
		 Object data[][]=testData("C:\\\\Users\\\\Jeeva Praneshan A\\\\eclipse-workspace\\\\SeleniumJavaFramework\\\\excel\\\\data.xlsx", "Sheet1");
		 return data;
	}
	public static Object[][] testData(String excelPath,String sheetName) throws IOException
	{
		ExcelUtils excel= new ExcelUtils(excelPath,sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		
		Object data[][]= new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String celldata=excel.getCellData(i,j);
				//System.out.println(celldata);
				data[i-1][j]=celldata;
			}
		}
		return data;
	}

}



