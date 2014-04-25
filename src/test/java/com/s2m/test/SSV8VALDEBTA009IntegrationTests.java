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

public class SSV8VALDEBTA009IntegrationTests {
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
    recorder.startRecording();
  }
  //**** tests creatoion frais d'adhesion

  
  // ***** test de creation fonctionnel (juste)+ id oblige+ nom obligé
  @Test
  public void testSSV8VALDEBTA009aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Membership Fees")).click();
    new Select(findElement(By.id("ListeMembershipFeesFrom:titleaaayyyyxxxxrrr"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_011");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_011");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Annual Periodicity");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_022");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Evoucher Periodicity");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("40");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_013");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("40");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_013");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Per a Month");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  //*** verification montant obligé+ peridicite ablige+
  
  @Test
  public void testSSV8VALDEBTA009bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Membership Fees")).click();
    new Select(findElement(By.id("ListeMembershipFeesFrom:titleaaayyyyxxxxrrr"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_021");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_021");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Annual Periodicity");
    Thread.sleep(1000);
    findElement(By.xpath("//tr[2]/td/select/option[2]")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_022");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_022");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Per a Week");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeMembershipFeesFrom:hsqyo54354")).click();
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_022");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_023");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Evoucher Periodicity");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("35");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_023");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
// **** verification: montant non alphabetiq + pas de ";" dans le mantant + valeur maximala u champ montant
  @Test
  public void testSSV8VALDEBTA009cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Membership Fees")).click();
    new Select(findElement(By.id("ListeMembershipFeesFrom:titleaaayyyyxxxxrrr"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_031");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_031");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("daily periodicity");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("nnnnn");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("70");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_032");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_032");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Per a Month");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("10,5");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("80");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeMembershipFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputIdaaayyyyxxxxxrrr")).sendKeys("Fr_Mem_033");
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputLabeaaayyyxxxxxrrr")).sendKeys("Fr_Mem_03");
    new Select(findElement(By.id("ListeMembershipFeesFrom:Langzzzeee"))).selectByVisibleText("Per a Week");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).clear();
    findElement(By.id("ListeMembershipFeesFrom:inputAmoulll")).sendKeys("1999999999");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
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
