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

public class SSV8VALDEBTA895IntegrationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Recorder recorder;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    recorder = new Recorder();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize() ;
    recorder.startRecording(this.getClass().getSimpleName());
  }

  @Test
  public void testSSV8VALDEBTA895aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("PIN Recalculation Fees")).click();
    new Select(findElement(By.id("ListeRecalculPinFrom:titleaaayyyyxxxx"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  @Test
  public void testSSV8VALDEBTA895bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("PIN Recalculation Fees")).click();
    new Select(findElement(By.id("ListeRecalculPinFrom:titleaaayyyyxxxx"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();   
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  
  @Test
  public void testSSV8VALDEBTA895cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("PIN Recalculation Fees")).click();
    new Select(findElement(By.id("ListeRecalculPinFrom:titleaaayyyyxxxx"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();   
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  @Test
  public void testSSV8VALDEBTA895dIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Withdrawal Fees")).click();
    new Select(findElement(By.id("globalChldWithdrawalFeesForm:titlesss"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click(); 
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 @Test
  public void testSSV8VALDEBTA895eIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Withdrawal Fees")).click();
    new Select(findElement(By.id("globalChldWithdrawalFeesForm:titlesss"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click(); 
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 @Test
  public void testSSV8VALDEBTA895fIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Withdrawal Fees")).click();
    new Select(findElement(By.id("globalChldWithdrawalFeesForm:titlesss"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click(); 
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 @Test
  public void testSSV8VALDEBTA895gIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Design Fees")).click();
    new Select(findElement(By.id("globalChldCardDesignFeesForm:titleeeee"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();}
 
 @Test
  public void testSSV8VALDEBTA895hIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Design Fees")).click();
    new Select(findElement(By.id("globalChldCardDesignFeesForm:titleeeee"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  @Test
  public void testSSV8VALDEBTA895iIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Design Fees")).click();
    new Select(findElement(By.id("globalChldCardDesignFeesForm:titleeeee"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
@Test
  public void testSSV8VALDEBTA895jIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Misc Periodical Fees")).click();
    new Select(findElement(By.id("globalChldMiscPeriodicalFeesForm:titlezzz"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("globalChldMiscPeriodicalFeesForm:hsqyo54354")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();}
 
 // @Test
  public void testSSV8VALDEBTA895kIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Misc Periodical Fees")).click();
    new Select(findElement(By.id("globalChldMiscPeriodicalFeesForm:titlezzz"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("globalChldMiscPeriodicalFeesForm:hsqyo54354")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 
  @Test
  public void testSSV8VALDEBTA895lIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Misc Periodical Fees")).click();
    new Select(findElement(By.id("globalChldMiscPeriodicalFeesForm:titlezzz"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("globalChldMiscPeriodicalFeesForm:hsqyo54354")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[5]/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
@Test
  public void testSSV8VALDEBTA895mIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Misc OneShot Fees")).click();
    new Select(findElement(By.id("globalChldMiscOneShotFeesForm:titleChldMiscOneShot"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("globalChldMiscOneShotFeesForm:hsqyo54354")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 @Test
  public void testSSV8VALDEBTA895nIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Misc OneShot Fees")).click();
    new Select(findElement(By.id("globalChldMiscOneShotFeesForm:titleChldMiscOneShot"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("globalChldMiscOneShotFeesForm:hsqyo54354")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 @Test
  public void testSSV8VALDEBTA895oIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Misc OneShot Fees")).click();
    new Select(findElement(By.id("globalChldMiscOneShotFeesForm:titleChldMiscOneShot"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("globalChldMiscOneShotFeesForm:hsqyo54354")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
@Test
  public void testSSV8VALDEBTA895pIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Renew Fees")).click();
    new Select(findElement(By.id("ListeRenewFeesFrom:titleaaayyyy"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("ListeRenewFeesFrom:hsqyo54354")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  @Test
  public void testSSV8VALDEBTA895qIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Renew Fees")).click();
    new Select(findElement(By.id("ListeRenewFeesFrom:titleaaayyyy"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("ListeRenewFeesFrom:hsqyo54354")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
@Test
  public void testSSV8VALDEBTA895rIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Renew Fees")).click();
    new Select(findElement(By.id("ListeRenewFeesFrom:titleaaayyyy"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("ListeRenewFeesFrom:hsqyo54354")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//center/a[2]/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
 @Test
  public void testSSV8VALDEBTA895sIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Profil Account Routing")).click();
    new Select(findElement(By.id("ListeProfileAccountRoutingForm:title"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("ListeProfileAccountRoutingForm:hsqyo54354")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
@Test
  public void testSSV8VALDEBTA895tIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Profil Account Routing")).click();
    new Select(findElement(By.id("ListeProfileAccountRoutingForm:title"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("ListeProfileAccountRoutingForm:hsqyo54354")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.linkText("Issuer Space")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 @Test
  public void testSSV8VALDEBTA895vIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Profil Account Routing")).click();
    new Select(findElement(By.id("ListeProfileAccountRoutingForm:title"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("ListeProfileAccountRoutingForm:hsqyo54354")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.cssSelector("a[title=\"delete\"] > img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.linkText("Issuer Space")).click();
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

  private  WebElement findElement( final By locator) {
    (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.presenceOfElementLocated(locator));
      (new WebDriverWait(driver, 30,1000)).until(ExpectedConditions.visibilityOfElementLocated(locator));
      WebElement element=driver.findElement(locator);
      if (element.isEnabled()==false )  ((JavascriptExecutor) driver).executeScript("arguments[0].disabled = false", element);
      return element;
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
