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

public class SSV8VALDEBTA014IntegrationTests {
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

@Test
  public void testSSV8VALDEBTA014aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Withdrawal Fees")).click();
    new Select(findElement(By.id("globalChldWithdrawalFeesForm:titlesss"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With011");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With011");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("1000");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With011");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With012");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("200");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With013");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("300");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

 @Test
  public void testSSV8VALDEBTA014bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Withdrawal Fees")).click();
    new Select(findElement(By.id("globalChldWithdrawalFeesForm:titlesss"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With021");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("200");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With021");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With022");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With022");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("150");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With023");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With023");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("nnnnnnnnnn");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("140");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  
@Test
  public void testSSV8VALDEBTA014cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Withdrawal Fees")).click();
    new Select(findElement(By.id("globalChldWithdrawalFeesForm:titlesss"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With031");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("222222222222222222222222222222222222222222222222222222222");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("200");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With031");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With032");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With032");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("nnn120");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("120");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldWithdrawalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputIdsss")).sendKeys("Fr_With033");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputLabesss")).sendKeys("Fr_With033");
    Thread.sleep(1000); findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldWithdrawalFeesForm:inputAmoulll")).sendKeys("0");
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
