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

public class ConsultingBanqRisksIntegrationTests {
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
  public void testConsultingBanqRisksIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    driver.findElement(By.id("form:table:0:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[8]")).click();
    driver.findElement(By.linkText("Parameter Space")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[11]")).click();
    driver.findElement(By.linkText("New Risk")).click();
    new Select(driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 1");
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("testRisk");
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("testRisk");
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    new Select(driver.findElement(By.id("AddIssuerRiskBankManagementForm:periodicity1111222"))).selectByVisibleText("bi-weekly periodicity");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("2000");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("4000");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("2");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("1500");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    driver.findElement(By.linkText("Managing Risk")).click();
    new Select(driver.findElement(By.id("globalIssuerRiskBankManagementForm:titletttrrrr"))).selectByVisibleText("banque test 1");
    driver.findElement(By.id("globalIssuerRiskBankManagementForm:hs5414")).click();
    driver.findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
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
