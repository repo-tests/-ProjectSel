package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import java.io.*;
import java.awt.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import com.google.common.base.Function;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.VideoFormatKeys.*;
import com.s2m.SpecializedScreenRecorder;

public class CustomizedTestIntegrationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
private ScreenRecorder screenRecorder;

  public void startRecording() throws Exception
  {
	  File file = new File("target\\surefire-reports\\");
      
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
  
  private  WebElement findElement(final WebDriver driver, final By locator, final int timeoutSeconds) {
    
          (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.presenceOfElementLocated(locator));
           (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
            WebElement element =driver.findElement(locator);
            //jsExecutor.executeScript("$(arguments[0]).change();", element);
            return element;
            		
        }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
    
startRecording();
  }

//@Test
  public void testCustomizedTestIntegrationTests() throws Exception {
	 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    findElement(driver,By.id("j_username"),30).clear();
    findElement(driver,By.id("j_username"),30).sendKeys("usercenter");
    findElement(driver,By.id("j_password"),30).clear();
    findElement(driver,By.id("j_password"),30).sendKeys("pwd8888");
    findElement(driver,By.cssSelector("#login > img[alt=\"Frensh\"]"),30).click();
    findElement(driver,By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function')={jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]"),30).click();
    findElement(driver,By.id("form:table:0:sdksds"),30).click();
    findElement(driver,By.xpath("(//img[@alt='English'])[10]"),30).click();
    findElement(driver,By.linkText("New fee"),30).click();
    new Select(findElement(driver,By.id("globalcardHolderCommissionForm:title"),30)).selectByVisibleText("banque test 1");
    findElement(driver,By.id("globalcardHolderCommissionForm:iden"),30).clear();
    findElement(driver,By.id("globalcardHolderCommissionForm:iden"),30).sendKeys("id1");
    WebElement element = driver.findElement(By.id("globalcardHolderCommissionForm:iden"));
    jsExecutor.executeScript("$(arguments[0]).change();", element);
    findElement(driver,By.id("globalcardHolderCommissionForm:label"),30).clear();
    findElement(driver,By.id("globalcardHolderCommissionForm:label"),30).sendKeys("nom1");
    element =driver.findElement(By.id("globalcardHolderCommissionForm:label"));
    jsExecutor.executeScript("$(arguments[0]).change();", element);
    new Select(findElement(driver,By.id("globalcardHolderCommissionForm:types"),30)).selectByVisibleText("CARDHOLDER");
    findElement(driver,By.id("globalcardHolderCommissionForm:rate"),30).clear();
    findElement(driver,By.id("globalcardHolderCommissionForm:rate"),30).sendKeys("20");
    element =driver.findElement(By.id("globalcardHolderCommissionForm:rate"));
    jsExecutor.executeScript("$(arguments[0]).change();", element);
    findElement(driver,By.id("globalcardHolderCommissionForm:fixe"),30).clear();
    findElement(driver,By.id("globalcardHolderCommissionForm:fixe"),30).sendKeys("45");
    findElement(driver,By.id("globalcardHolderCommissionForm:min"),30).clear();
    findElement(driver,By.id("globalcardHolderCommissionForm:min"),30).sendKeys("100");
    element =driver.findElement(By.id("globalcardHolderCommissionForm:min"));
    jsExecutor.executeScript("$(arguments[0]).change();", element);
    findElement(driver,By.id("globalcardHolderCommissionForm:max"),30).clear();
    findElement(driver,By.id("globalcardHolderCommissionForm:max"),30).sendKeys("200");
     element =driver.findElement(By.id("globalcardHolderCommissionForm:max"));
    jsExecutor.executeScript("$(arguments[0]).change();", element);
    findElement(driver,By.xpath("//a[@id='globalcardHolderCommissionForm:userModifButton']/img"),30).click();
    findElement(driver,By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalcardHolderCommissionForm'),{'globalcardHolderCommissionForm:j_id423':'globalcardHolderCommissionForm:j_id423'},'');}return false\"]"),30).click();
    findElement(driver,By.linkText("Manage fees"),30).click();
    new Select(findElement(driver,By.id("globalcardHolderCommissionForm:title"),30)).selectByVisibleText("banque test 1");
    findElement(driver,By.id("globalcardHolderCommissionForm:hs5414"),30).click();
    findElement(driver,By.cssSelector("img[alt=\"Supprimer\"]"),30).click();
    findElement(driver,By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalcardHolderCommissionForm'),{'globalcardHolderCommissionForm:j_id305':'globalcardHolderCommissionForm:j_id305'},'');}return false\"]"),30).click();
    findElement(driver,By.linkText("Home"),30).click();
    findElement(driver,By.xpath("(//img[@alt='English'])[2]"),30).click();
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
