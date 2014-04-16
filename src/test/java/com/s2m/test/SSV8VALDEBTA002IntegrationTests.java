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

public class SSV8VALDEBTA002IntegrationTests {
  private WebDriver driver;
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
startRecording();
  }
private  WebElement findElement( final By locator) {
    
          (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.presenceOfElementLocated(locator));
            (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator);
        }

//  @Test
  public void testSSV8VALDEBTA002IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("New BIN")).click();
    new Select(findElement(By.id("AccountInquiryForm:title"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("400000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("450000");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AccountInquiryForm'),{'AccountInquiryForm:j_id717':'AccountInquiryForm:j_id717'},'');}return false\"]")).click();
    findElement(By.linkText("New BIN")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("500000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("550000");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Serial Method");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Classic");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AccountInquiryForm'),{'AccountInquiryForm:j_id717':'AccountInquiryForm:j_id717'},'');}return false\"]")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("15");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("600000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("650000");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Random Active Range / Random Number");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Visa Travel Money Card");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("17");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AccountInquiryForm'),{'AccountInquiryForm:j_id717':'AccountInquiryForm:j_id717'},'');}return false\"]")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    new Select(findElement(By.id("AccountInquiryForm:title"))).selectByVisibleText("banque test2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("18");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("700000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("750000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("1");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 1");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardUsage"))).selectByVisibleText("Credit Card");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("ABC Card Method");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("VISA Infinite Card");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:pvkiSelectionMethod"))).selectByVisibleText("pvki 1");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AccountInquiryForm'),{'AccountInquiryForm:j_id717':'AccountInquiryForm:j_id717'},'');}return false\"]")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("19");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("800000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("850000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("1");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("1234567890");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Random Active Range / Random Number");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Visa Signature Card");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AccountInquiryForm'),{'AccountInquiryForm:j_id717':'AccountInquiryForm:j_id717'},'');}return false\"]")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 3");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Random Active Range / Random Number");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("MasterCard Card");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:pvkiSelectionMethod"))).selectByVisibleText("pvki 3");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:domain"))).selectByVisibleText("Worldwide");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("19");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("300000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("350000");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AccountInquiryForm'),{'AccountInquiryForm:j_id717':'AccountInquiryForm:j_id717'},'');}return false\"]")).click();
    new Select(findElement(By.id("ListeNationalBinForm:title"))).selectByVisibleText("banque test3");
    Thread.sleep(1000);
    findElement(By.cssSelector("option[value=\"7765\"]")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("20");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("150000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("200000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("1234567890");
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Classic");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("19");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AccountInquiryForm'),{'AccountInquiryForm:j_id717':'AccountInquiryForm:j_id717'},'');}return false\"]")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("99");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("1500000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("2000000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("2345678901");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("ABC Card Method");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 4");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("MasterCard Card");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("19");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("750000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("8000000");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("850000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("900000");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("(//img[@alt='save2'])[2]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.linkText("Manage BIN")).click();
    new Select(findElement(By.id("ListeNationalBinForm:title"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.cssSelector("option[value=\"7763\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    new Select(findElement(By.id("ListeNationalBinForm:title"))).selectByVisibleText("banque test2");
    Thread.sleep(1000);
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:4:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:3:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:2:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:1:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
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
