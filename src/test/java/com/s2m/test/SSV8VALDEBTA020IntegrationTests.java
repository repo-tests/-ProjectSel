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

public class SSV8VALDEBTA020IntegrationTests {
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
  public void testSSV8VALDEBTA020aIntegrationTests() throws Exception {
	  driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
	    Thread.sleep(1000); findElement(By.id("j_username")).clear();
	    findElement(By.id("j_username")).sendKeys("usercenter");
	    Thread.sleep(1000); findElement(By.id("j_password")).clear();
	    findElement(By.id("j_password")).sendKeys("pwd8888");
	    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
	    findElement(By.xpath("//span/a")).click();
	    findElement(By.id("form:table:1:sdksds")).click();
	    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Profil Account Routing")).click();
    new Select(findElement(By.id("ListeProfileAccountRoutingForm:title"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC011");
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta1")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta4")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta3")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT16011");
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT1-011");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT1-012");
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta2")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta3")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT1-011");
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta4")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta5")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta1")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta2")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta3")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT1-013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  @Test
  public void testSSV8VALDEBTA020bIntegrationTests() throws Exception {
	  driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
	    Thread.sleep(1000); findElement(By.id("j_username")).clear();
	    findElement(By.id("j_username")).sendKeys("usercenter");
	    Thread.sleep(1000); findElement(By.id("j_password")).clear();
	    findElement(By.id("j_password")).sendKeys("pwd8888");
	    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
	    findElement(By.xpath("//span/a")).click();
	    findElement(By.id("form:table:1:sdksds")).click();
	    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Profil Account Routing")).click();
    new Select(findElement(By.id("ListeProfileAccountRoutingForm:title"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT2-021");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT2-012");
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT2-012nnnnnnnnn");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='Modify'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT2-012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT2-023");
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta1")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta4")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  @Test
  public void testSSV8VALDEBTA020cIntegrationTests() throws Exception {
	  driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
	    Thread.sleep(1000); findElement(By.id("j_username")).clear();
	    findElement(By.id("j_username")).sendKeys("usercenter");
	    Thread.sleep(1000); findElement(By.id("j_password")).clear();
	    findElement(By.id("j_password")).sendKeys("pwd8888");
	    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
	    findElement(By.xpath("//span/a")).click();
	    findElement(By.id("form:table:1:sdksds")).click();
	    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Profil Account Routing")).click();
    new Select(findElement(By.id("ListeProfileAccountRoutingForm:title"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT3-031");
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta4")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta5")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("....................");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='Modify'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT3-032");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:qSDHUAQ")).click();
    Thread.sleep(1000); findElement(By.id("ListeProfileAccountRoutingForm:yyy")).clear();
    findElement(By.id("ListeProfileAccountRoutingForm:yyy")).sendKeys("PAC-BT3-033");
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta1")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta4")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta5")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta2")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='Modify'])[3]")).click();
    findElement(By.id("ListeProfileAccountRoutingForm:checkSta3")).click();
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
