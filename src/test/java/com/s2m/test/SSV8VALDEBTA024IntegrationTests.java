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

public class SSV8VALDEBTA024IntegrationTests {
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
driver.manage().window().maximize() ;
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    recorder.startRecording(this.getClass().getSimpleName());
  }
  
  
 @Test
  public void testSSV8VALDEBTA024IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Card program Wizard")).click();
    new Select(findElement(By.id("ListeCardForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeCardForm:cprIden")).clear();
    findElement(By.id("ListeCardForm:cprIden")).sendKeys("CPROG033");
    Thread.sleep(1000); findElement(By.id("ListeCardForm:cprLabe")).clear();
    findElement(By.id("ListeCardForm:cprLabe")).sendKeys("CPROG033");
    new Select(findElement(By.id("ListeCardForm:nationalBin"))).selectByVisibleText("<1500000>........<1600000>");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:cardProgramControlItemsId"))).selectByVisibleText("Control_011V2");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:piste102E"))).selectByVisibleText("Risk Test 11");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"Next.\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeCardForm:cprLifeCyclId")).clear();
    findElement(By.id("ListeCardForm:cprLifeCyclId")).sendKeys("3");
    Thread.sleep(1000); findElement(By.id("ListeCardForm:idCprPrepDate")).clear();
    findElement(By.id("ListeCardForm:idCprPrepDate")).sendKeys("15");
    findElement(By.cssSelector("img[alt=\"Next.\"]")).click();
    findElement(By.name("ListeCardForm:j_id414")).click();
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:encTrac1Id"))).selectByVisibleText("Format A");
    Thread.sleep(1000);
    findElement(By.name("ListeCardForm:j_id423")).click();
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:enTrac2Id"))).selectByVisibleText("Format B");
    Thread.sleep(1000);
    findElement(By.name("ListeCardForm:j_id432")).click();
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:encTrac3Id"))).selectByVisibleText("Format A");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:serviceCode1"))).selectByVisibleText("0 - Invalid for Visa card");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:serviceCode2"))).selectByVisibleText("0 - Normal Authorization");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:serviceCode3"))).selectByVisibleText("0 - sco_lab1");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:inputLineFormat1"))).selectByVisibleText("Card Number");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:inputLineFormat2"))).selectByVisibleText("Expiry Date Format1 (YYYY MM/YY)");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:inputLineFormat3"))).selectByVisibleText("Expiry Date Format2 (MM/YY TO MM/YY)");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:inputLineFormat4"))).selectByVisibleText("Spaces");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:inputLineFormat5"))).selectByVisibleText("Corporate Name");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"Next.\"]")).click();
    findElement(By.id("ListeCardForm:hsqyo5555l")).click();
    new Select(findElement(By.id("ListeCardForm:Lang1kk"))).selectByVisibleText("PAC-BT1-011");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"Next.\"]")).click();
    new Select(findElement(By.id("ListeCardForm:withdraesItems"))).selectByVisibleText("Fr_With011");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:opposedCardFeesItems"))).selectByVisibleText("Fr_Opp_011");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:idPersonalizationFeesItems"))).selectByVisibleText("FrPer_011");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:idCardRenewFeesItems"))).selectByVisibleText("Fr_Ren_011");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:idChldMembershipFeesItems"))).selectByVisibleText("Fr_Mem_011");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeCardForm:idPinRecalculFeesItems"))).selectByVisibleText("FrPRec_011");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
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
