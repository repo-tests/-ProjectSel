package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import java.io.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.remote.Augmenter;

public class NewBanqueIntegrationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  
 // @Rule public TestName testName = new TestName();


  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewBanqueIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    driver.findElement(By.id("form:table:0:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[8]")).click();
    driver.findElement(By.linkText("New Bank")).click();
    driver.findElement(By.id("AddBankForm:idenBK")).clear();
    driver.findElement(By.id("AddBankForm:idenBK")).sendKeys("Banque1");
    new Select(driver.findElement(By.id("AddBankForm:grban"))).selectByVisibleText("Groupe Emetteurs OBZ");
    driver.findElement(By.id("AddBankForm:banInit")).clear();
    driver.findElement(By.id("AddBankForm:banInit")).sendKeys("Banque1");
    new Select(driver.findElement(By.id("AddBankForm:tyban"))).selectByVisibleText("OUT OF THE CENTER");
    driver.findElement(By.id("AddBankForm:banCorpName")).clear();
    driver.findElement(By.id("AddBankForm:banCorpName")).sendKeys("Banque1");
    new Select(driver.findElement(By.id("AddBankForm:pays"))).selectByVisibleText("Morocco");
    driver.findElement(By.xpath("//form[@id='AddBankForm']/div[2]/a/img")).click();
    driver.findElement(By.id("AddBankForm:j_id678_lbl")).click();
    driver.findElement(By.id("AddBankForm:currencyRate:0")).click();
    new Select(driver.findElement(By.id("AddBankForm:currency"))).selectByVisibleText("Franc");
    driver.findElement(By.cssSelector("option[value=\"716\"]")).click();
    driver.findElement(By.xpath("//form[@id='AddBankForm']/div[2]/a/img")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('AddBankForm'),{'AddBankForm:j_id756':'AddBankForm:j_id756'},'');}return false\"]")).click();
    driver.findElement(By.linkText("Managing bank")).click();
    new Select(driver.findElement(By.id("SearchBankForm:title"))).selectByVisibleText("Banque1");
    driver.findElement(By.cssSelector("td > a > img")).click();
    driver.findElement(By.xpath("//span[@id='SearchBankForm:j_id768']/a[2]/img")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('SearchBankForm'),{'SearchBankForm:j_id798':'SearchBankForm:j_id798'},'');}return false\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
	  String className = this.getClass().getSimpleName();
//      String methodName = this.testName.getMethodName();
//      System.err.println("Finished test " +
//                         className + "." + methodName + "()");
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
