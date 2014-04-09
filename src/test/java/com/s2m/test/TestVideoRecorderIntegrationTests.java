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

public class TestVideoRecorderIntegrationTests {
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
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
startRecording();
  }
private  WebElement findElement( final By locator) {
    
          (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.presenceOfElementLocated(locator));
            (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator);
        }

  @Test
  public void testVideoRecorderIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:0:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("New fee")).click();
    new Select(findElement(By.id("globalcardHolderCommissionForm:title"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:iden")).clear();
    findElement(By.id("globalcardHolderCommissionForm:iden")).sendKeys("id1");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:label")).clear();
    findElement(By.id("globalcardHolderCommissionForm:label")).sendKeys("nom1");
    new Select(findElement(By.id("globalcardHolderCommissionForm:types"))).selectByVisibleText("MERCHANT");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:rate")).clear();
    findElement(By.id("globalcardHolderCommissionForm:rate")).sendKeys("25");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:fixe")).clear();
    findElement(By.id("globalcardHolderCommissionForm:fixe")).sendKeys("100");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:min")).clear();
    findElement(By.id("globalcardHolderCommissionForm:min")).sendKeys("200");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:max")).clear();
    findElement(By.id("globalcardHolderCommissionForm:max")).sendKeys("300");
    findElement(By.xpath("//a[@id='globalcardHolderCommissionForm:userModifButton']/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalcardHolderCommissionForm'),{'globalcardHolderCommissionForm:j_id423':'globalcardHolderCommissionForm:j_id423'},'');}return false\"]")).click();
    findElement(By.linkText("Manage fees")).click();
    new Select(findElement(By.id("globalcardHolderCommissionForm:title"))).selectByVisibleText("banque test 1");
    findElement(By.id("globalcardHolderCommissionForm:hs5414")).click();
    findElement(By.cssSelector("img[alt=\"Supprimer\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalcardHolderCommissionForm'),{'globalcardHolderCommissionForm:j_id305':'globalcardHolderCommissionForm:j_id305'},'');}return false\"]")).click();
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
