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

public class SSV8VALDEBTA0003IntegrationTests {
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
    recorder.startRecording(this.getClass().getCanonicalName());
  }
  // ** enregistrement des risques pour les trois banques

@Test
  public void testSSV8VALDEBTA0003IntegrationTests() throws Exception {

driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
Thread.sleep(1000); findElement(By.id("j_username")).clear();
findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    optionalClick(By.xpath("//span/a[contains(@class,'btValider')]"));
    findElement(By.id("form:table:0:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[11]")).click();
    findElement(By.linkText("New Risk")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 11");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 11");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    new Select(findElement(By.id("AddIssuerRiskBankManagementForm:periodicity1111222"))).selectByVisibleText("Evoucher Periodicity");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("4500");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("5");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("5000");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("450");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click(); 
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 12");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 12");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    new Select(findElement(By.id("AddIssuerRiskBankManagementForm:periodicity1111222"))).selectByVisibleText("daily periodicity");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("700");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    Thread.sleep(1000); findElement(By.   id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("7700");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("8");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("140");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 13");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 13");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    new Select(findElement(By.id("AddIssuerRiskBankManagementForm:periodicity1111222"))).selectByVisibleText("bi-weekly periodicity");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("4590");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("80000");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("5");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("500");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 21");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 21");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("7800");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("8800");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("2");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("4000");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 22");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 22");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("7890");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("9990");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("9");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("400");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 23");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 23");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("7890");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("8");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("9870");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("500");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 31");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 31");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("78945");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("98765");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("2");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("80");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 32");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 32");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("7890");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("9990");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("9");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("400");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    new Select(findElement(By.id("AddInquiryIssuerRiskBankManagementForm:bank111222111"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:idgfdgfdg222111")).sendKeys("Risk Test 33");
    Thread.sleep(1000); findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).clear();
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:id3ffffffdfd222111")).sendKeys("Risk Test 33");
    findElement(By.id("AddInquiryIssuerRiskBankManagementForm:hsqyo5555l")).click();
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id11")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id11")).sendKeys("7890");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id21")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id21")).sendKeys("9990");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id41")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id41")).sendKeys("9");
    Thread.sleep(1000); findElement(By.id("AddIssuerRiskBankManagementForm:id31")).clear();
    findElement(By.id("AddIssuerRiskBankManagementForm:id31")).sendKeys("400");
    findElement(By.id("AddIssuerRiskBankManagementForm:hsqyoggf55fff55l")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
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
