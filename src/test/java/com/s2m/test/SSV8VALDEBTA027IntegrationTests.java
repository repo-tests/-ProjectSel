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
public class SSV8VALDEBTA027IntegrationTests {
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
  public void testSSV8VALDEBTA027IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('form'),{'form:j_id1037':'form:j_id1037'},'');}return false\"]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[18]")).click();
    findElement(By.linkText("New Debit Application")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:DAP_IDEN")).clear();
    findElement(By.id("globalDebitApplicationForm:DAP_IDEN")).sendKeys("DAPP001");
    new Select(findElement(By.id("globalDebitApplicationForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:branchsugges")).clear();
    findElement(By.id("globalDebitApplicationForm:branchsugges")).sendKeys("agence test 1");
    new Select(findElement(By.id("globalDebitApplicationForm:DAP_CUS_TYPE"))).selectByVisibleText("New");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:customersugges")).clear();
    findElement(By.id("globalDebitApplicationForm:customersugges")).sendKeys("CL011");
    findElement(By.id("globalDebitApplicationForm:branchsugges")).click();
    new Select(findElement(By.id("globalDebitApplicationForm:dapVipCat"))).selectByVisibleText("VIP1");
    Thread.sleep(1000);
    new Select(findElement(By.id("globalDebitApplicationForm:dapTitle"))).selectByVisibleText("Mister");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapFirstName")).clear();
    findElement(By.id("globalDebitApplicationForm:dapFirstName")).sendKeys("Najib");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapLastName")).clear();
    findElement(By.id("globalDebitApplicationForm:dapLastName")).sendKeys("LAHLOU");
    findElement(By.id("globalDebitApplicationForm:dapBirthDatePopupButton")).click();
    findElement(By.id("globalDebitApplicationForm:dapBirthDateInputDate")).click();
    findElement(By.id("globalDebitApplicationForm:dapBirthDatePopupButton")).click();
    findElement(By.id("globalDebitApplicationForm:dapBirthDatePopupButton")).click();
    findElement(By.id("globalDebitApplicationForm:dapBirthDatePopupButton")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.id("globalDebitApplicationForm:dapBirthDateDayCell12")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapBirthLoc")).clear();
    findElement(By.id("globalDebitApplicationForm:dapBirthLoc")).sendKeys("Fes");
    new Select(findElement(By.id("globalDebitApplicationForm:dapFirsIdenTyp"))).selectByVisibleText("Civil ID");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapFirsIde")).clear();
    findElement(By.id("globalDebitApplicationForm:dapFirsIde")).sendKeys("CD6567");
    new Select(findElement(By.id("globalDebitApplicationForm:dapSecoIdenTyp"))).selectByVisibleText("Passport");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapSecoIde")).clear();
    findElement(By.id("globalDebitApplicationForm:dapSecoIde")).sendKeys("A8876");
    new Select(findElement(By.id("globalDebitApplicationForm:dapGend"))).selectByVisibleText("Male");
    Thread.sleep(1000);
    new Select(findElement(By.id("globalDebitApplicationForm:dapMst"))).selectByVisibleText("Single");
    Thread.sleep(1000);
    new Select(findElement(By.id("globalDebitApplicationForm:dapNat"))).selectByVisibleText("Morocco");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapDepNum")).clear();
    findElement(By.id("globalDebitApplicationForm:dapDepNum")).sendKeys("0");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapEmplCode")).clear();
    findElement(By.id("globalDebitApplicationForm:dapEmplCode")).sendKeys("EMP009");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapEmplName")).clear();
    findElement(By.id("globalDebitApplicationForm:dapEmplName")).sendKeys("NAJIB");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapGrosSal")).clear();
    findElement(By.id("globalDebitApplicationForm:dapGrosSal")).sendKeys("20000");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapNetSal")).clear();
    findElement(By.id("globalDebitApplicationForm:dapNetSal")).sendKeys("17000");
    new Select(findElement(By.id("globalDebitApplicationForm:dapPpo"))).selectByVisibleText("Employee");
    Thread.sleep(1000);
    findElement(By.id("globalDebitApplicationForm:dapEmplAgePopupButton")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.cssSelector("div.rich-calendar-tool-btn.rich-calendar-tool-btn-hover")).click();
    findElement(By.id("globalDebitApplicationForm:dapEmplAgeDayCell8")).click();
    findElement(By.id("globalDebitApplicationForm:j_id447_lbl")).click();
    findElement(By.id("globalDebitApplicationForm:j_id615_lbl")).click();
    findElement(By.id("globalDebitApplicationForm:j_id447_lbl")).click();
    findElement(By.xpath("//div[@id='globalDebitApplicationForm:j_id448_body']/a/img")).click();
    findElement(By.id("globalDebitApplicationForm:j_id615_lbl")).click();
    findElement(By.id("globalDebitApplicationForm:j_id644_lbl")).click();
    findElement(By.id("globalDebitApplicationForm:j_id729_lbl")).click();
    findElement(By.id("globalDebitApplicationForm:j_id729_lbl")).click();
    new Select(findElement(By.id("globalDebitApplicationForm:dapChldTitl"))).selectByVisibleText("Mister");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapChldFirsName")).clear();
    findElement(By.id("globalDebitApplicationForm:dapChldFirsName")).sendKeys("Najib");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapChldLastName")).clear();
    findElement(By.id("globalDebitApplicationForm:dapChldLastName")).sendKeys("LAHLOU");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:DAP_CHLD_NAME")).clear();
    findElement(By.id("globalDebitApplicationForm:DAP_CHLD_NAME")).sendKeys("Mr Najib LAHLOU");
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:dapChldCorpName")).clear();
    findElement(By.id("globalDebitApplicationForm:dapChldCorpName")).sendKeys("OFPPT");
    findElement(By.cssSelector("img[alt=\"Selectionner Programme Carte\"]")).click();
    findElement(By.id("hidelink")).click();
    findElement(By.cssSelector("img[alt=\"Selectionner Programme Carte\"]")).click();
    findElement(By.id("hidelink")).click();
    findElement(By.name("globalDebitApplicationForm:j_id880")).click();
    Thread.sleep(1000); findElement(By.id("globalDebitApplicationForm:branchsugges")).clear();
    findElement(By.id("globalDebitApplicationForm:branchsugges")).sendKeys("agence test");
    findElement(By.cssSelector("td.rich-sb-cell-padding.richfaces_suggestionSelectValue")).click();
    findElement(By.name("globalDebitApplicationForm:j_id880")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
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
