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

public class SSV8VALDEBTA901IntegrationTests {
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
    recorder.startRecording();
  }

  @Test
  public void testSSV8VALDEBTA901aIntegrationTests() throws Exception {
Select select;
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("Manage BIN")).click();
    new Select(findElement(By.id("ListeNationalBinForm:title"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.cssSelector("option[value=\"7815\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  @Test
  public void testSSV8VALDEBTA901bIntegrationTests() throws Exception {

    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("Manage BIN")).click();
    new Select(findElement(By.id("ListeNationalBinForm:title"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.cssSelector("option[value=\"7816\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @Test
  public void testSSV8VALDEBTA901cIntegrationTests() throws Exception {

    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("Manage BIN")).click();
    new Select(findElement(By.id("ListeNationalBinForm:title"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.cssSelector("option[value=\"7817\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
    findElement(By.xpath("//span[@id='ListeNationalBinForm:searchResultNationalBin:0:j_id201']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id215':'ListeNationalBinForm:j_id215'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeNationalBinForm'),{'ListeNationalBinForm:j_id241':'ListeNationalBinForm:j_id241'},'');}return false\"]")).click();
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
