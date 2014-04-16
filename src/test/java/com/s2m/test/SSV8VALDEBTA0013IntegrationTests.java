package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import java.io.*;
import java.awt.*;

import javax.swing.text.html.Option;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import com.google.common.base.Function;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.VideoFormatKeys.*;
import com.s2m.SpecializedScreenRecorder;

public class SSV8VALDEBTA0013IntegrationTests {
  private WebDriver driver;
  Actions builder ;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
private ScreenRecorder screenRecorder;

  public void startRecording() throws Exception
  {
	  File file = new File("target\\surefire-reports\\"+this.getClass().getName()+"\\");
      
      java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int width = screenSize.width;
      int height = screenSize.height;
      Rectangle captureSize = new Rectangle(0,0, width, height);
      GraphicsConfiguration gc = GraphicsEnvironment
          .getLocalGraphicsEnvironment()
          .getDefaultScreenDevice()
          .getDefaultConfiguration();

      this.screenRecorder = new SpecializedScreenRecorder(gc, captureSize,
              new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
              new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                   CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                   DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                   QualityKey, 1.0f,
                   KeyFrameIntervalKey, 15 * 60),
              new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                   FrameRateKey, Rational.valueOf(30)),
              null, file, this.getClass().getSimpleName());

      this.screenRecorder.start();
  }

  public void stopRecording() throws Exception
  {
      this.screenRecorder.stop();
  }
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     builder = new Actions(driver);
startRecording();
  }
private  WebElement findElement( final By locator) {
    
          (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.presenceOfElementLocated(locator));
            (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator);
        }

 // @Test
  public void testSSV8VALDEBTA0013IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
   
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test3");
   // (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.elementToBeSelected(By.cssSelector("option[value=\"7765\"]")));
    //builder.moveToElement(findElement(By.cssSelector("option[value=\"7765\"]"))).click().build().perform();
    //Thread.sleep(5000);
   // findElement(By.cssSelector("option[value=\"7765\"]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG031");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM031");
    findElement(By.cssSelector("img[alt=\"Selectionner IssuerRiskProgram\"]")).click();
    findElement(By.id("includedPanel:issuerRiskProgramFilterTableForm:issuerRiskProgramListId:0:j_id352")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprPerc")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprPerc")).sendKeys("0");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id269':'globalDebitProgramInquiryForm:j_id269'},'');}return false\"]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG032");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM032");
    findElement(By.cssSelector("img[alt=\"Selectionner IssuerRiskProgram\"]")).click();
    findElement(By.id("includedPanel:issuerRiskProgramFilterTableForm:issuerRiskProgramListId:1:j_id30")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell15")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell18")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprPerc")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprPerc")).sendKeys("100");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id269':'globalDebitProgramInquiryForm:j_id269'},'');}return false\"]")).click();
    findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG033");
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM033");
    findElement(By.cssSelector("img[alt=\"Selectionner IssuerRiskProgram\"]")).click();
    findElement(By.id("includedPanel:issuerRiskProgramFilterTableForm:issuerRiskProgramListId:2:j_id30")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell22")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell23")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitProgramInquiryForm:dprPerc")).clear();
    findElement(By.id("globalDebitProgramInquiryForm:dprPerc")).sendKeys("150");
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id269':'globalDebitProgramInquiryForm:j_id269'},'');}return false\"]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test3");
    WebElement option = new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).getFirstSelectedOption();
      option.click();
    
   // (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.elementToBeSelected(By.cssSelector("option[value=\"7765\"]")));
    //builder.moveToElement(findElement(By.cssSelector("option[value=\"7765\"]"))).build().perform();
    //Thread.sleep(5000);
    findElement(By.cssSelector("option[value=\"7765\"]")).click();
    findElement(By.id("globalDebitProgramInquiryForm:debitProgramListId:0:sxqshxsqhtx")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id266':'globalDebitProgramInquiryForm:j_id266'},'');}return false\"]")).click();
    findElement(By.id("globalDebitProgramInquiryForm:debitProgramListId:0:sxqshxsqhtx")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id266':'globalDebitProgramInquiryForm:j_id266'},'');}return false\"]")).click();
    findElement(By.id("globalDebitProgramInquiryForm:debitProgramListId:0:sxqshxsqhtx")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id266':'globalDebitProgramInquiryForm:j_id266'},'');}return false\"]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test 1");
   // builder.moveToElement(findElement(By.cssSelector("option[value=\"7763\"]"))).build().perform();
   // Thread.sleep(5000);
   // (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.elementToBeSelected(By.cssSelector("option[value=\"7763\"]")));
    //findElement(By.cssSelector("option[value=\"7763\"]")).click();
     WebElement option0 = new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).getFirstSelectedOption();
     option0.click();
     findElement(By.cssSelector("option[value=\"7763\"]")).click();
    findElement(By.id("globalDebitProgramInquiryForm:hs5414")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test2");
  //  builder.moveToElement(findElement(By.cssSelector("option[value=\"7764\"]"))).build().perform();
    //Thread.sleep(5000);
    //(new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.elementToBeSelected(By.cssSelector("option[value=\"7764\"]")));
  // findElement(By.cssSelector("option[value=\"7764\"]")).click();
    WebElement option2 = new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).getFirstSelectedOption();
    option2.click();
    findElement(By.id("globalDebitProgramInquiryForm:hs5414")).click();
    new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test3");
    //builder.moveToElement(findElement(By.cssSelector("option[value=\"7765\"]"))).build().perform();
    //Thread.sleep(5000);
   // (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.elementToBeSelected(By.cssSelector("option[value=\"7765\"]")));
    WebElement option3 = new Select(findElement(By.id("globalDebitProgramInquiryForm:bank"))).getFirstSelectedOption();
    option3.click();
    findElement(By.cssSelector("option[value=\"7765\"]")).click();
    findElement(By.id("globalDebitProgramInquiryForm:hs5414")).click();
    findElement(By.linkText("Home")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
stopRecording();
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
