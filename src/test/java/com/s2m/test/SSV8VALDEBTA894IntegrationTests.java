package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import com.google.common.base.Function;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import s2m.automation.utilities.*;

public class SSV8VALDEBTA894IntegrationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Recorder recorder;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    recorder = new Recorder();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize() ;
    recorder.startRecording(this.getClass().getName());
  }

  @Test
  public void testSSV8VALDEBTA894IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/modules/index.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Manage controls")).click();
    new Select(findElement(By.id("ListeTransactionForm:titleBank1"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.cssSelector("td > a > img")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    new Select(findElement(By.id("ListeTransactionForm:titleBank1"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.cssSelector("td > a > img")).click();
    findElement(By.cssSelector("td > a > img")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.cssSelector("td > a > img")).click();
    new Select(findElement(By.id("ListeTransactionForm:titleBank1"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.cssSelector("td > a > img")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
    recorder.stopRecording();
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private  WebElement findElement( final By locator) {
    (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.presenceOfElementLocated(locator));
      (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
      WebElement element=driver.findElement(locator);
      if (element.isEnabled()==false )  ((JavascriptExecutor) driver).executeScript("arguments[0].disabled = false", element);
      return element;
  }

  public  void optionalClick( final By locator) {
	  WebElement we=null;
	  try {
	      we = driver.findElement( locator );
	      we.click();
	    } catch ( StaleElementReferenceException ser ) {                        
	      
	    } catch ( NoSuchElementException nse ) {                        
	    
	    } catch ( Exception e ) {
	      //staticlogger.info( e.getMessage() );
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
