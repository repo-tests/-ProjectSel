package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SSV8VALDEBTA001IntegrationTests {
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

  @Test
  public void testSSV8VALDEBTA001IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.id("form:fdfdfiiphhhppiiegggeooo")).click();
    driver.findElement(By.id("form:table:1:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(driver.findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test 1");
    driver.findElement(By.cssSelector("option[value=\"7763\"]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:hs5414")).click();
    driver.findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG011");
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM011");
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell23")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell30")).click();
    driver.findElement(By.cssSelector("img[alt=\"Selectionner IssuerRiskProgram\"]")).click();
    driver.findElement(By.id("includedPanel:issuerRiskProgramFilterTableForm:issuerRiskProgramListId:0:j_id414")).click();
    Thread.sleep(500);
    driver.findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id265':'globalDebitProgramInquiryForm:j_id265'},'');}return false\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG011");
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM012");
    driver.findElement(By.cssSelector("img[alt=\"Selectionner IssuerRiskProgram\"]")).click();
    Thread.sleep(500);
    driver.findElement(By.id("includedPanel:issuerRiskProgramFilterTableForm:issuerRiskProgramListId:1:j_id30")).click();
    Thread.sleep(500);
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell15")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell29")).click();
    driver.findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG012");
    driver.findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id265':'globalDebitProgramInquiryForm:j_id265'},'');}return false\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("DPROG013");
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("DEBITPROGRAM013");
    driver.findElement(By.cssSelector("img[alt=\"Selectionner IssuerRiskProgram\"]")).click();
    Thread.sleep(500);
    driver.findElement(By.id("includedPanel:issuerRiskProgramFilterTableForm:issuerRiskProgramListId:2:j_id30")).click();
    Thread.sleep(500);
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell32")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell18")).click();
    driver.findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell11")).click();
    driver.findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id265':'globalDebitProgramInquiryForm:j_id265'},'');}return false\"]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:debitProgramListId:0:sxqshxsqhtx")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id276':'globalDebitProgramInquiryForm:j_id276'},'');}return false\"]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:debitProgramListId:0:sxqshxsqhtx")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id276':'globalDebitProgramInquiryForm:j_id276'},'');}return false\"]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:debitProgramListId:0:sxqshxsqhtx")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id276':'globalDebitProgramInquiryForm:j_id276'},'');}return false\"]")).click();
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
