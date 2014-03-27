package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CardProgramFeesParametreNewOneWithNoFeesReasonCodeIntegrationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

 // @Test
  public void testCardProgramFeesParametreNewOneWithNoFeesReasonCodeIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.id("form:fdfdfiiphhhppiiegggeooo")).click();
    driver.findElement(By.id("form:table:1:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    driver.findElement(By.linkText("Fees parameter")).click();
    new Select(driver.findElement(By.id("globalChldCardParameterFeesForm:bank"))).selectByVisibleText("OBZI Bank");
    driver.findElement(By.cssSelector("td > a > img")).click();
    driver.findElement(By.xpath("//table[@id='globalChldCardParameterFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    driver.findElement(By.id("globalChldCardParameterFeesForm:inputIdlll")).clear();
    driver.findElement(By.id("globalChldCardParameterFeesForm:inputIdlll")).sendKeys("id10");
    driver.findElement(By.id("globalChldCardParameterFeesForm:inputLabelll")).clear();
    driver.findElement(By.id("globalChldCardParameterFeesForm:inputLabelll")).sendKeys("nom10");
    driver.findElement(By.id("globalChldCardParameterFeesForm:inputAmoulll")).clear();
    driver.findElement(By.id("globalChldCardParameterFeesForm:inputAmoulll")).sendKeys("0");
    driver.findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalChldCardParameterFeesForm'),{'globalChldCardParameterFeesForm:j_id262':'globalChldCardParameterFeesForm:j_id262'},'');}return false\"]")).click();
    driver.findElement(By.xpath("//span[@id='globalChldCardParameterFeesForm:searchParameterFeesResultsId:0:j_id248']/a/img")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalChldCardParameterFeesForm'),{'globalChldCardParameterFeesForm:j_id273':'globalChldCardParameterFeesForm:j_id273'},'');}return false\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalChldCardParameterFeesForm'),{'globalChldCardParameterFeesForm:j_id282':'globalChldCardParameterFeesForm:j_id282'},'');}return false\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
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
