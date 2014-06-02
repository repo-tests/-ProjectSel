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

public class ToAddIntegrationTests {
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
    driver.manage().window().maximize();
    recorder.startRecording(this.getClass().getSimpleName());
  }

  @Test
  public void testToAddIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.xpath("(//img[@alt='Frensh'])[2]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:0:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[6]")).click();
    findElement(By.linkText("Manage fees")).click();
    findElement(By.xpath("//img[@alt='Exporter']")).click();
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:iden")).clear();
    findElement(By.id("globalcardHolderCommissionForm:iden")).sendKeys("Frai2");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:label")).clear();
    findElement(By.id("globalcardHolderCommissionForm:label")).sendKeys("label1");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:rate")).clear();
    findElement(By.id("globalcardHolderCommissionForm:rate")).sendKeys("20");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:fixe")).clear();
    findElement(By.id("globalcardHolderCommissionForm:fixe")).sendKeys("10");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:min")).clear();
    findElement(By.id("globalcardHolderCommissionForm:min")).sendKeys("200");
    Thread.sleep(1000); findElement(By.id("globalcardHolderCommissionForm:max")).clear();
    findElement(By.id("globalcardHolderCommissionForm:max")).sendKeys("300");
//     findElement(By.id("globalcardHolderCommissionForm:hsqyo5555l")).click();
//     findElement(By.xpath("//td[4]/a/img")).click();
    findElement(By.xpath("//div/div/a/img")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.xpath("//td[6]")).click();
    findElement(By.xpath("//td[6]")).click();
    findElement(By.xpath("(//img[@alt='Supprimer'])[6]")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
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
      try{
      we = driver.findElement( locator );
      we.click();
      } catch ( StaleElementReferenceException ser ) {
  
      } catch ( NoSuchElementException nse ) {
  
      } catch ( Exception e ) {
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
