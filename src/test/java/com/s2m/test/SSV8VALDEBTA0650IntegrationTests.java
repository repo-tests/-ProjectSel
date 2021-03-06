package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import com.google.common.base.Function;
import s2m.automation.utilities.*;



public class SSV8VALDEBTA0650IntegrationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
private Recorder recorder=new Recorder();

 
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize() ;
  //  recorder.startRecording();
  }
private  WebElement findElement( final By locator) {
    
          (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.presenceOfElementLocated(locator));
            (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator);
        }

  //@Test
  public void testSSV8VALDEBTA0650IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    findElement(By.linkText("Account Type")).click();
    new Select(findElement(By.id("ListeBankAccountTypeForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeBankAccountTypeForm:bankAccountType"))).selectByVisibleText("savings account");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeBankAccountTypeForm:inputIden")).clear();
    findElement(By.id("ListeBankAccountTypeForm:inputIden")).sendKeys("idAccountT");
    Thread.sleep(1000); findElement(By.id("ListeBankAccountTypeForm:inputLabe")).clear();
    findElement(By.id("ListeBankAccountTypeForm:inputLabe")).sendKeys("AccountBankTests1");
    new Select(findElement(By.id("ListeBankAccountTypeForm:Lang"))).selectByVisibleText("French");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeBankAccountTypeForm'),{'ListeBankAccountTypeForm:j_id259':'ListeBankAccountTypeForm:j_id259'},'');}return false\"]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

//  @Test
  public void testSSV8VALDEBTA0652IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    findElement(By.linkText("Account Type")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    new Select(findElement(By.id("ListeBankAccountTypeForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.cssSelector("option[value=\"7763\"]")).click();
    new Select(findElement(By.id("ListeBankAccountTypeForm:bankAccountType"))).selectByVisibleText("savings account");
    Thread.sleep(1000);
    findElement(By.cssSelector("option[value=\"10\"]")).click();
    findElement(By.cssSelector("img[alt=\"Exporter\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeBankAccountTypeForm:inputIden")).clear();
    findElement(By.id("ListeBankAccountTypeForm:inputIden")).sendKeys("id2");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("(//img[@alt='save2'])[2]")).click();
    findElement(By.xpath("(//a[contains(text(),'Debit Program')])[2]")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  //@Test
  public void testSSV8VALDEBTA0653IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    findElement(By.linkText("Account Type")).click();
    findElement(By.cssSelector("img[alt=\"Aide en ligne\"]")).click();
    findElement(By.cssSelector("img[alt=\"Frensh\"]")).click();
    new Select(findElement(By.id("ListeBankAccountTypeForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeBankAccountTypeForm:bankAccountType"))).selectByVisibleText("savings account");
    Thread.sleep(1000);
    findElement(By.id("ListeBankAccountTypeForm:hsqyo54354")).click();
    findElement(By.xpath("(//a[contains(text(),'Produit Débit')])[2]")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  //@Test
  public void testSSV8VALDEBTA0654IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:name")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[7]")).click();
    findElement(By.linkText("Account Type")).click();
    new Select(findElement(By.id("ListeBankAccountTypeForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    new Select(findElement(By.id("ListeBankAccountTypeForm:bankAccountType"))).selectByVisibleText("savings account");
    Thread.sleep(1000);
    findElement(By.id("ListeBankAccountTypeForm:hsqyo54354")).click();
    findElement(By.xpath("//span[@id='ListeBankAccountTypeForm:searchResultsBankAccount:0:j_id212']/a/img")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeBankAccountTypeForm'),{'ListeBankAccountTypeForm:j_id233':'ListeBankAccountTypeForm:j_id233'},'');}return false\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeBankAccountTypeForm'),{'ListeBankAccountTypeForm:j_id245':'ListeBankAccountTypeForm:j_id245'},'');}return false\"]")).click();
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
