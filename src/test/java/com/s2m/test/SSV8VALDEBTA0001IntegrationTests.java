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

public class SSV8VALDEBTA0001IntegrationTests {
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

 // @Test
  public void testSSV8VALDEBTA00001IntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();  
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:0:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[8]")).click();
    findElement(By.linkText("New Bank")).click();
    Thread.sleep(1000); findElement(By.id("AddBankForm:idenBK")).clear();
    findElement(By.id("AddBankForm:idenBK")).sendKeys("banque test 1");
    new Select(findElement(By.id("AddBankForm:grban"))).selectByVisibleText("Solutions( EDI - INT -TMA)");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddBankForm:banInit")).clear();
    findElement(By.id("AddBankForm:banInit")).sendKeys("btn1");
    new Select(findElement(By.id("AddBankForm:tyban"))).selectByVisibleText("OUT OF THE CENTER");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddBankForm:banCorpName")).clear();
    findElement(By.id("AddBankForm:banCorpName")).sendKeys("banque test 1");
    new Select(findElement(By.id("AddBankForm:pays"))).selectByVisibleText("Morocco");
    Thread.sleep(1000);
    findElement(By.id("AddBankForm:j_id507_lbl")).click();
    findElement(By.id("AddBankForm:j_id672_lbl")).click();
    findElement(By.id("AddBankForm:currencyRate:0")).click();
    new Select(findElement(By.id("AddBankForm:currency"))).selectByVisibleText("U.A.E. Dirham");
    Thread.sleep(1000);
    findElement(By.xpath("//form[@id='AddBankForm']/div[2]/a/img")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.linkText("New Bank")).click();
    Thread.sleep(1000); findElement(By.id("AddBankForm:idenBK")).clear();
    findElement(By.id("AddBankForm:idenBK")).sendKeys("banque test2");
    Thread.sleep(1000); findElement(By.id("AddBankForm:idenBK")).clear();
    findElement(By.id("AddBankForm:idenBK")).sendKeys("banque test 2");
    Thread.sleep(1000); findElement(By.id("AddBankForm:banCorpName")).clear();
    findElement(By.id("AddBankForm:banCorpName")).sendKeys("banque test 2");
    Thread.sleep(1000); findElement(By.id("AddBankForm:banInit")).clear();
    findElement(By.id("AddBankForm:banInit")).sendKeys("btn2");
    new Select(findElement(By.id("AddBankForm:grban"))).selectByVisibleText("Solutions( EDI - INT -TMA)");
    Thread.sleep(1000);
    new Select(findElement(By.id("AddBankForm:tyban"))).selectByVisibleText("OUT OF THE CENTER");
    Thread.sleep(1000);
    new Select(findElement(By.id("AddBankForm:pays"))).selectByVisibleText("Morocco");
    Thread.sleep(1000);
    findElement(By.id("AddBankForm:j_id507_lbl")).click();
    findElement(By.id("AddBankForm:j_id672_lbl")).click();
    findElement(By.id("AddBankForm:currencyRate:0")).click();
    new Select(findElement(By.id("AddBankForm:currency"))).selectByVisibleText("Slovenia Tolar");
    Thread.sleep(1000);
    findElement(By.xpath("//form[@id='AddBankForm']/div[2]/a/img")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.linkText("New Bank")).click();
    Thread.sleep(1000); findElement(By.id("AddBankForm:idenBK")).clear();
    findElement(By.id("AddBankForm:idenBK")).sendKeys("banque test 3");
    Thread.sleep(1000); findElement(By.id("AddBankForm:banCorpName")).clear();
    findElement(By.id("AddBankForm:banCorpName")).sendKeys("banque test 3");
    new Select(findElement(By.id("AddBankForm:grban"))).selectByVisibleText("GRB LABE 05");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddBankForm:banInit")).clear();
    findElement(By.id("AddBankForm:banInit")).sendKeys("btn3");
    new Select(findElement(By.id("AddBankForm:tyban"))).selectByVisibleText("OUT OF THE CENTER");
    Thread.sleep(1000);
    new Select(findElement(By.id("AddBankForm:pays"))).selectByVisibleText("Morocco");
    Thread.sleep(1000);
    findElement(By.id("AddBankForm:j_id672_lbl")).click();
    findElement(By.id("AddBankForm:currencyRate:0")).click();
    new Select(findElement(By.id("AddBankForm:currency"))).selectByVisibleText("Swaziland Lilangeni");
    Thread.sleep(1000);
    findElement(By.xpath("//form[@id='AddBankForm']/div[2]/a/img")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
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
      return driver.findElement(locator);
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
