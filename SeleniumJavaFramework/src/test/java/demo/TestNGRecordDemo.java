
package demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;
//import org.apache.commons.io.FileUtils;

public class  TestNGRecordDemo {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   // System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TdISzOuKlNgNGB0YPDizC9KzEtPzSjKBQBfagem&q=orangehrm&oq=ora&gs_lcrp=EgZjaHJvbWUqEwgCEC4YgwEYxwEYsQMY0QMYgAQyBggAEEUYOTITCAEQLhiDARjHARixAxjRAxiABDITCAIQLhiDARjHARixAxjRAxiABDINCAMQABiDARixAxiABDINCAQQABiDARixAxiABDINCAUQABiDARixAxiABDINCAYQABiDARixAxiABDIGCAcQRRg80gEIMjczNGowajeoAgiwAgHxBTvEkbchmK3Z8QU7xJG3IZit2Q&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.orangehrm.com/");
    driver.get("https://www.google.com/search?q=https%3A%2F%2Fwww.orangehrm.com+login&oq=https%3A%2F%2Fwww.orangehrm.com+login&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIHCAEQABiABDIGCAIQRRhAMggIAxAAGBYYHjINCAQQABiGAxiABBiKBTIHCAUQABjvBTIKCAYQABiABBiiBDIGCAcQRRg60gEIMzYxOGowajSoAgCwAgE&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://support.orangehrm.com/portal/en/signin");
    driver.findElement(By.xpath("//div[@id='container']/portal/div/div[4]/div[2]/div/div/div/div/ul/li[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='container']/portal/div/div[4]/div[2]/div/div/div/div/ul/li[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='container']/portal/div/div[4]/div[2]/div/div/div/div/ul/li[2]/span")).click();
    //ERROR: Caught exception [unknown command []]
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("asedrftgyh");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("kilokjuhynbh");
    driver.findElement(By.xpath("//input[@value='Sign In']")).click();
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwMU02T1JgNGB0YPBiS8_PT89JBQBASQXT&q=google&oq=goo&gs_lcrp=EgZjaHJvbWUqGAgBEC4YQxiDARjHARixAxjRAxiABBiKBTIGCAAQRRg5MhgIARAuGEMYgwEYxwEYsQMY0QMYgAQYigUyDwgCEAAYQxixAxiABBiKBTIMCAMQABhDGIAEGIoFMgYIBBBFGEEyBggFEEUYQTIGCAYQRRhBMgYIBxBFGDzSAQgyNzc2ajBqN6gCCLACAfEFgUmXR6I9qik&sourceid=chrome&ie=UTF-8");
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.google.com/");
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).clear();
    driver.findElement(By.id("APjFqb")).sendKeys("car");
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.findElement(By.id("APjFqb")).clear();
    driver.findElement(By.id("APjFqb")).sendKeys("goo");
    driver.findElement(By.xpath("//div[@id='jZ2SBf']/div/span")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}