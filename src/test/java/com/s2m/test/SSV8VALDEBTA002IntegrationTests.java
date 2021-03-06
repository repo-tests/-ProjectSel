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

public class SSV8VALDEBTA002IntegrationTests {
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
  public void testSSV8VALDEBTA002aIntegrationTests() throws Exception {
	Select select;
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("New BIN")).click();
    new Select(findElement(By.id("AccountInquiryForm:title"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("1500000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("1600000");
    new Select(findElement(By.id("AccountInquiryForm:cardUsage"))).selectByVisibleText("Visa Check Card II");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Serial Method");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Visa Business");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("1700000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("1800000");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Random Active Range / Random Number");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("World MAsterCard Card");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:pvkiSelectionMethod"))).selectByVisibleText("pvki 2");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 3");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("1900000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("2000000");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("ABC Card Method");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:domain"))).selectByVisibleText("National");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

 @Test
  public void testSSV8VALDEBTA002bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("New BIN")).click();
    new Select(findElement(By.id("AccountInquiryForm:title"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("760000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("770000");
    new Select(findElement(By.id("AccountInquiryForm:pvkiSelectionMethod"))).selectByVisibleText("pvki 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("1");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Random Active Range / Random Number");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("World MAsterCard Card");
    Thread.sleep(1000);
    
    new Select(findElement(By.id("AccountInquiryForm:domain"))).selectByVisibleText("National");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("6");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("860000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("870000");
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Visa Electron");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("2345678901");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Random Active Range / Random Number");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();

    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    new Select(findElement(By.id("AccountInquiryForm:cardUsage"))).selectByVisibleText("Credit Card");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("2100000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("2200000");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 2");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("ABC Card Method");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Electronique");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("ATM");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Electronique");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("2345678901");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
 @Test
  public void testSSV8VALDEBTA002cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a"));
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[10]")).click();
    findElement(By.linkText("New BIN")).click();
    new Select(findElement(By.id("AccountInquiryForm:title"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("2300000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("2400000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("1234567890");
    new Select(findElement(By.id("AccountInquiryForm:domain"))).selectByVisibleText("National");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:pvkiSelectionMethod"))).selectByVisibleText("pvki 1");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();

    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("2700000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("2800000");
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("Serial Method");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("2345678901");
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Visa Electron");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeNationalBinForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurCarte")).clear();
    findElement(By.id("AccountInquiryForm:LongueurCarte")).sendKeys("16");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:LongueurBin")).clear();
    findElement(By.id("AccountInquiryForm:LongueurBin")).sendKeys("7");
    new Select(findElement(By.id("AccountInquiryForm:cardUsage"))).selectByVisibleText("Credit Card");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMin")).clear();
    findElement(By.id("AccountInquiryForm:RangeMin")).sendKeys("2900000");
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:RangeMax")).clear();
    findElement(By.id("AccountInquiryForm:RangeMax")).sendKeys("3000000");
    new Select(findElement(By.id("AccountInquiryForm:FormatBin"))).selectByVisibleText("bin format 3");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardNumbGenerationMethod"))).selectByVisibleText("ABC Card Method");
    Thread.sleep(1000);
    new Select(findElement(By.id("AccountInquiryForm:cardTypeNetwork"))).selectByVisibleText("Electronique");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AccountInquiryForm:SequenceBin")).clear();
    findElement(By.id("AccountInquiryForm:SequenceBin")).sendKeys("3456789012");
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
