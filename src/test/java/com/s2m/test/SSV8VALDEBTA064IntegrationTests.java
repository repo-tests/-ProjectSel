package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.base.Function;
import s2m.automation.utilities.*;

public class SSV8VALDEBTA064IntegrationTests {
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

  //@Test
  public void testSSV8VALDEBTA064IntegrationTests() throws Exception {
Select select;
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:0:sdksds")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.id("form:table:2:sdksds")).click();
    findElement(By.id("form:table:3:sdksds")).click();
    findElement(By.id("form:table:4:sdksds")).click();
    findElement(By.id("form:table:5:sdksds")).click();
    findElement(By.id("form:table:6:sdksds")).click();
    findElement(By.id("form:table:7:sdksds")).click();
    findElement(By.id("form:table:8:sdksds")).click();
    findElement(By.cssSelector("img[alt=\"Frensh\"]")).click();
    findElement(By.id("form:table:0:sdksds")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.id("form:table:2:sdksds")).click();
    findElement(By.id("form:table:3:sdksds")).click();
    findElement(By.id("form:table:4:sdksds")).click();
    findElement(By.id("form:table:5:sdksds")).click();
    findElement(By.id("form:table:6:sdksds")).click();
    findElement(By.id("form:table:7:sdksds")).click();
    findElement(By.id("form:table:8:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[3]")).click();
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
