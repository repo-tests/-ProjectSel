package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import java.io.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.remote.Augmenter;

public class AddingNewCardDebitIntegrationTests {
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
  public void testAddingNewCardDebitIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    driver.findElement(By.id("form:table:1:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    new Select(driver.findElement(By.id("globalDebitProgramInquiryForm:bank"))).selectByVisibleText("banque test 1");
    driver.findElement(By.cssSelector("option[value=\"7763\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='Exporter'])[2]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprIden")).sendKeys("idTest");
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).clear();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprLabe")).sendKeys("labelTest");
    driver.findElement(By.cssSelector("img[alt=\"Selectionner IssuerRiskProgram\"]")).click();
    driver.findElement(By.id("includedPanel:issuerRiskProgramFilterTableForm:issuerRiskProgramListId:0:j_id352")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprValuDateDayCell24")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDatePopupButton")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:dprExpiDateDayCell31")).click();
    driver.findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id269':'globalDebitProgramInquiryForm:j_id269'},'');}return false\"]")).click();
    driver.findElement(By.id("globalDebitProgramInquiryForm:debitProgramListId:0:sxqshxsqhtx")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalDebitProgramInquiryForm'),{'globalDebitProgramInquiryForm:j_id280':'globalDebitProgramInquiryForm:j_id280'},'');}return false\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
	  String className = this.getClass().getSimpleName();
//    String methodName = this.testName.getMethodName();
//    System.err.println("Finished test " +
//                       className + "." + methodName + "()");
	  WebDriver augmentedDriver = new Augmenter().augment(driver);
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(screenshot, new File(className+".png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
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
