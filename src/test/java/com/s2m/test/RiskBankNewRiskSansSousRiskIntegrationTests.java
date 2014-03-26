package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RiskBankNewRiskSansSousRiskIntegrationTests {
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
  public void testRiskBankNewRiskSansSousRiskIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.id("form:fdfdfiiphhhppiiegggeooo")).click();
    driver.findElement(By.id("form:table:0:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[11]")).click();
    driver.findElement(By.linkText("New Risk")).click();
    new Select(driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("bnq 001");
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("id12");
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("label12");
    driver.findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    driver.findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    new Select(driver.findElement(By.id("AddIssuerRiskBankManagementForm:periodicity1111222"))).selectByVisibleText("Evoucher Periodicity");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("200");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("300");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("20");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("150");
    driver.findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    driver.findElement(By.xpath("//span[@id='AddInquiryIssuerRiskBankManagementForm:SearchCustChldOnliRiskRecoDetailPanel111222:0:j_id186']/a/img")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AddInquiryIssuerRiskBankManagementForm'),{'AddInquiryIssuerRiskBankManagementForm:j_id222':'AddInquiryIssuerRiskBankManagementForm:j_id222'},'');}return false\"]")).click();
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
