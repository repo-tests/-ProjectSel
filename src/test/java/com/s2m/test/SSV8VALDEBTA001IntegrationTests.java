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

public class SSV8VALDEBTA001IntegrationTests {
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
//*** creation des Programmes debit
 @Test
  public void testSSV8VALDEBTA001IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("globalDebitProgramInquiryForm:hs5414")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG011");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM011");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 11");
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell8")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell17")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG012");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 12");
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM012");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG013");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM013");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 13");
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell16")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell16")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG021");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM021");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 21");
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell16")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell11")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell23")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG021");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM022");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 22");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG022");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG023");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM023");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 23");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM031");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 31");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG031");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG032");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM032");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dapIRProgramsugges")).sendKeys("Risk Test 32");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG033");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM033");
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell9")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell25")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
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
