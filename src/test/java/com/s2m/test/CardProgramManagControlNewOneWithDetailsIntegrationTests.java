package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CardProgramManagControlNewOneWithDetailsIntegrationTests {
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
  public void testCardProgramManagControlNewOneWithDetailsIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.id("form:fdfdfiiphhhppiiegggeooo")).click();
    driver.findElement(By.id("form:table:1:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    driver.findElement(By.linkText("Manage controls")).click();
    new Select(driver.findElement(By.id("ListeTransactionForm:titleBank1"))).selectByVisibleText("OBZI Bank");
    driver.findElement(By.cssSelector("td > a > img")).click();
    driver.findElement(By.xpath("//div[@id='ListeTransactionForm:j_id293_body']/table/tbody/tr/td/a[3]/img")).click();
    driver.findElement(By.id("ListeTransactionForm:iden")).clear();
    driver.findElement(By.id("ListeTransactionForm:iden")).sendKeys("id2");
    driver.findElement(By.id("ListeTransactionForm:label")).clear();
    driver.findElement(By.id("ListeTransactionForm:label")).sendKeys("nom2");
    driver.findElement(By.id("ListeTransactionForm:j_id370_lbl")).click();
    driver.findElement(By.id("ListeTransactionForm:j_id394_lbl")).click();
    driver.findElement(By.xpath("//tr[@id='ListeTransactionForm:j_id396:source::3']/td")).click();
    driver.findElement(By.xpath("//a[@id='ListeTransactionForm:j_id396copylink']/div/img")).click();
    driver.findElement(By.xpath("//tr[@id='ListeTransactionForm:j_id396:source::7']/td")).click();
    driver.findElement(By.xpath("//a[@id='ListeTransactionForm:j_id396copylink']/div/img")).click();
    driver.findElement(By.xpath("//tr[@id='ListeTransactionForm:j_id396:source::12']/td")).click();
    driver.findElement(By.xpath("//a[@id='ListeTransactionForm:j_id396copylink']/div/img")).click();
    driver.findElement(By.id("ListeTransactionForm:j_id399_lbl")).click();
    driver.findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeTransactionForm'),{'ListeTransactionForm:j_id477':'ListeTransactionForm:j_id477'},'');}return false\"]")).click();
    driver.findElement(By.linkText("Manage controls")).click();
    new Select(driver.findElement(By.id("ListeTransactionForm:titleBank1"))).selectByVisibleText("OBZI Bank");
    driver.findElement(By.cssSelector("td > a > img")).click();
    driver.findElement(By.xpath("//span[@id='ListeTransactionForm:searchCardProgControlResultsId:0:j_id464']/a/img")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeTransactionForm'),{'ListeTransactionForm:j_id488':'ListeTransactionForm:j_id488'},'');}return false\"]")).click();
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
