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

public class SSV8VALDEBTA0002IntegrationTests {
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
  
  //  ***** Test de création des agences pour les banques*********

//@Test
  public void testSSV8VALDEBTA0002IntegrationTests() throws Exception {
Select select;
driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
Thread.sleep(1000); findElement(By.id("j_username")).clear();
findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:0:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[8]")).click();
    findElement(By.linkText("New Branch")).click();
    new Select(findElement(By.id("MyBranchForm:bankOnglet1:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("MyBranchForm:bankOnglet1:braIden")).clear();
    findElement(By.id("MyBranchForm:bankOnglet1:braIden")).sendKeys("agence test BNQ1");
    Thread.sleep(1000); findElement(By.id("MyBranchForm:bankOnglet1:branch")).clear();
    findElement(By.id("MyBranchForm:bankOnglet1:branch")).sendKeys("agence test BNQ1");
    Thread.sleep(1000); findElement(By.name("MyBranchForm:bankOnglet1:j_id258")).clear();
    findElement(By.name("MyBranchForm:bankOnglet1:j_id258")).sendKeys("abnq1");
    findElement(By.cssSelector("img[alt=\"save\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.linkText("New Branch")).click();
    new Select(findElement(By.id("MyBranchForm:bankOnglet1:bank"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("MyBranchForm:bankOnglet1:braIden")).clear();
    findElement(By.id("MyBranchForm:bankOnglet1:braIden")).sendKeys("agence test BNQ2");
    Thread.sleep(1000); findElement(By.id("MyBranchForm:bankOnglet1:branch")).clear();
    findElement(By.id("MyBranchForm:bankOnglet1:branch")).sendKeys("agence test BNQ2");
    Thread.sleep(1000); findElement(By.name("MyBranchForm:bankOnglet1:j_id258")).clear();
    findElement(By.name("MyBranchForm:bankOnglet1:j_id258")).sendKeys("abnq2");
    findElement(By.cssSelector("img[alt=\"save\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.linkText("New Branch")).click();
    new Select(findElement(By.id("MyBranchForm:bankOnglet1:bank"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("MyBranchForm:bankOnglet1:braIden")).clear();
    findElement(By.id("MyBranchForm:bankOnglet1:braIden")).sendKeys("agence test BNQ3");
    Thread.sleep(1000); findElement(By.id("MyBranchForm:bankOnglet1:branch")).clear();
    findElement(By.id("MyBranchForm:bankOnglet1:branch")).sendKeys("agence test BNQ3");
    Thread.sleep(1000); findElement(By.name("MyBranchForm:bankOnglet1:j_id258")).clear();
    findElement(By.name("MyBranchForm:bankOnglet1:j_id258")).sendKeys("abnq3");
    findElement(By.cssSelector("img[alt=\"save\"]")).click();
    findElement(By.xpath("//span/a")).click();
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
      return driver.findElement(locator);
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
