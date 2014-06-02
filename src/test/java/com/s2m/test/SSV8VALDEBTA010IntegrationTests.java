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

public class SSV8VALDEBTA010IntegrationTests {
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
    recorder.startRecording(this.getClass().getName());
  }
  //**** tests de creation des frai de personnalisation
  
  //** creation fonctionnelle+unicité de l'id +Nom Obligé
 @Test
  public void testSSV8VALDEBTA010aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Personalization Fees")).click();
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:title11"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("f");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_011");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_011");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("80");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000004");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLfffffabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLfffffabe11")).sendKeys("4");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_011");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_012");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("70");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000005");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_013");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("60");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000003");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  //**** id oblige +montant oblig+frai de generation obligé
@Test
  public void testSSV8VALDEBTA010bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Personalization Fees")).click();
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:title11"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_021");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("80");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000004");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLfffffabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLfffffabe11")).sendKeys("4");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_021");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_022");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_022");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000005");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_023");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_023");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("40");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000003");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  //***** donnes variés sur le champ montant "0.0" "10,5" et "0"
@Test
  public void testSSV8VALDEBTA010cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Personalization Fees")).click();
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:title11"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_031");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_031");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("10.5");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000003");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_032");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_032");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("50,5");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000005");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldPersonalizationFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputId111")).sendKeys("FrPer_033");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputLabe11")).sendKeys("FrPer_033");
    Thread.sleep(1000); findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldPersonalizationFeesForm:inputAmoulll")).sendKeys("0");
    new Select(findElement(By.id("globalChldPersonalizationFeesForm:typeList"))).selectByVisibleText("0000000005");
    Thread.sleep(1000);
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
  public  void optionalClick( final By locator) {
	  WebElement we=null;
	  try {
	      we = driver.findElement( locator );
	      we.click();
	    } catch ( StaleElementReferenceException ser ) {                        
	      
	    } catch ( NoSuchElementException nse ) {                        
	    
	    } catch ( Exception e ) {
	      //staticlogger.info( e.getMessage() );
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
