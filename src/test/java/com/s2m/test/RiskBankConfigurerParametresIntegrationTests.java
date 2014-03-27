package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RiskBankConfigurerParametresIntegrationTests {
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

 //@Test
  public void testRiskBankConfigurerParametresIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.id("form:fdfdfiiphhhppiiegggeooo")).click();
    driver.findElement(By.id("form:table:0:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[11]")).click();
    driver.findElement(By.linkText("Configure Parameter")).click();
    new Select(driver.findElement(By.name("riskParameters:j_id151"))).selectByVisibleText("GCH BANK 001");
    driver.findElement(By.cssSelector("option[value=\"7743\"]")).click();
    driver.findElement(By.id("riskParameters:hs5414")).click();
    driver.findElement(By.name("riskParameters:j_id159")).click();
    driver.findElement(By.name("riskParameters:j_id162")).click();
    driver.findElement(By.name("riskParameters:j_id165")).click();
    driver.findElement(By.name("riskParameters:j_id171")).click();
    driver.findElement(By.name("riskParameters:j_id180")).click();
    driver.findElement(By.name("riskParameters:j_id174")).click();
    driver.findElement(By.name("riskParameters:j_id183")).click();
    driver.findElement(By.name("riskParameters:j_id177")).click();
    driver.findElement(By.name("riskParameters:j_id186")).click();
    driver.findElement(By.id("riskParameters:hsqyoggf5555l")).click();
    driver.findElement(By.id("riskParameters:fdfdfdfdfdfeoSffffup71114477")).click();
    driver.findElement(By.name("riskParameters:j_id159")).click();
    driver.findElement(By.name("riskParameters:j_id162")).click();
    driver.findElement(By.name("riskParameters:j_id165")).click();
    driver.findElement(By.id("riskParameters:hsqyoggf5555l")).click();
    driver.findElement(By.id("riskParameters:fdfdfdfdoffffpp1111771114477")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('riskParameters'),{'riskParameters:j_id199':'riskParameters:j_id199'},'');}return false\"]")).click();
    new Select(driver.findElement(By.name("riskParameters:j_id151"))).selectByVisibleText("GCH BANK 001");
    driver.findElement(By.cssSelector("option[value=\"7743\"]")).click();
    driver.findElement(By.id("riskParameters:hs5414")).click();
    driver.findElement(By.name("riskParameters:j_id159")).click();
    driver.findElement(By.name("riskParameters:j_id162")).click();
    driver.findElement(By.name("riskParameters:j_id165")).click();
    driver.findElement(By.name("riskParameters:j_id171")).click();
    driver.findElement(By.name("riskParameters:j_id180")).click();
    driver.findElement(By.name("riskParameters:j_id174")).click();
    driver.findElement(By.name("riskParameters:j_id183")).click();
    driver.findElement(By.name("riskParameters:j_id177")).click();
    driver.findElement(By.name("riskParameters:j_id186")).click();
    driver.findElement(By.id("riskParameters:hsqyoggf5555l")).click();
    driver.findElement(By.id("riskParameters:fdfdfdfdoffffpp1111771114477")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('riskParameters'),{'riskParameters:j_id199':'riskParameters:j_id199'},'');}return false\"]")).click();
    new Select(driver.findElement(By.name("riskParameters:j_id151"))).selectByVisibleText("GCH BANK 001");
    driver.findElement(By.cssSelector("option[value=\"7743\"]")).click();
    driver.findElement(By.id("riskParameters:hs5414")).click();
    driver.findElement(By.name("riskParameters:j_id159")).click();
    driver.findElement(By.name("riskParameters:j_id162")).click();
    driver.findElement(By.name("riskParameters:j_id165")).click();
    driver.findElement(By.id("riskParameters:hsqyoggf5555l")).click();
    driver.findElement(By.id("riskParameters:fdfdfdfdoffffpp1111771114477")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('riskParameters'),{'riskParameters:j_id199':'riskParameters:j_id199'},'');}return false\"]")).click();
    new Select(driver.findElement(By.name("riskParameters:j_id151"))).selectByVisibleText("GCH BANK 001");
    driver.findElement(By.cssSelector("option[value=\"7743\"]")).click();
    driver.findElement(By.id("riskParameters:hs5414")).click();
    driver.findElement(By.name("riskParameters:j_id177")).click();
    driver.findElement(By.name("riskParameters:j_id186")).click();
    driver.findElement(By.name("riskParameters:j_id174")).click();
    driver.findElement(By.name("riskParameters:j_id183")).click();
    driver.findElement(By.name("riskParameters:j_id171")).click();
    driver.findElement(By.name("riskParameters:j_id180")).click();
    driver.findElement(By.name("riskParameters:j_id159")).click();
    driver.findElement(By.name("riskParameters:j_id162")).click();
    driver.findElement(By.name("riskParameters:j_id165")).click();
    driver.findElement(By.id("riskParameters:hsqyoggf5555l")).click();
    driver.findElement(By.id("riskParameters:fdfdfdfdoffffpp1111771114477")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('riskParameters'),{'riskParameters:j_id199':'riskParameters:j_id199'},'');}return false\"]")).click();
    driver.findElement(By.linkText("Parameter Space")).click();
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
