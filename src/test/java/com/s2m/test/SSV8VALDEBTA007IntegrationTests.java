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

public class SSV8VALDEBTA007IntegrationTests {
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

  //creation des frais de remplacement
  // *** montant et nom obligatoire 
 //@Test
  public void testSSV8VALDEBTA007aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Replacement Fees")).click();
    new Select(findElement(By.id("globalChldCardReplacementFeesForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_011");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_011");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("45");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_012");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_013");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("60");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_013");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  // **** id unique par banque et id obligatoire + champ montant de type numerique
 //@Test
  public void testSSV8VALDEBTA007bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Replacement Fees")).click();
    new Select(findElement(By.id("globalChldCardReplacementFeesForm:bank"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_021");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("70");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_021");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_021");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_022");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("30");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_022");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_023");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_023");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("llllll");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("35");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  // **** Tests les valeurs 4,5 et 4.5 et le max de longeur 10 :1200000000
  
 //@Test
  public void testSSV8VALDEBTA007cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Replacement Fees")).click();
    new Select(findElement(By.id("globalChldCardReplacementFeesForm:bank"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_031");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_031");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("1200000000");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_032");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_032");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("4,5");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("40");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//table[@id='globalChldCardReplacementFeesForm:AZlll']/tbody/tr/td/a[2]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputIdlll")).sendKeys("Fr_Rp_033");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputLabelll")).sendKeys("Fr_Rp_033");
    Thread.sleep(1000); findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardReplacementFeesForm:inputAmoulll")).sendKeys("40.5");
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
