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

public class ToAdd2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Recorder recorder;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
driver.manage().window().maximize() ;
    recorder = new Recorder();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    recorder.startRecording(this.getClass().getSimpleName());
  }

 // @Test
  public void testToAdd2() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/modules/issuer/fees/SSV8_ECR0026_MISC_PERIODICAL_FEES.xhtml");
    findElement(By.linkText("Misc Periodical Fees")).click();
    new Select(findElement(By.id("globalChldMiscPeriodicalFeesForm:titlezzz"))).selectByVisibleText("OBZI");
    Thread.sleep(1000);
    findElement(By.id("globalChldMiscPeriodicalFeesForm:hsqyo54354")).click();
    findElement(By.id("globalChldMiscPeriodicalFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldMiscPeriodicalFeesForm:searchMiscPeriodicalFeesResultsId:0:inputIdzzz")).clear();
    findElement(By.id("globalChldMiscPeriodicalFeesForm:searchMiscPeriodicalFeesResultsId:0:inputIdzzz")).sendKeys("id1");
    Thread.sleep(1000); findElement(By.id("globalChldMiscPeriodicalFeesForm:searchMiscPeriodicalFeesResultsId:0:inputLabezzz")).clear();
    findElement(By.id("globalChldMiscPeriodicalFeesForm:searchMiscPeriodicalFeesResultsId:0:inputLabezzz")).sendKeys("nom1");
    Thread.sleep(1000); findElement(By.id("globalChldMiscPeriodicalFeesForm:searchMiscPeriodicalFeesResultsId:0:inputAmoulll")).clear();
    findElement(By.id("globalChldMiscPeriodicalFeesForm:searchMiscPeriodicalFeesResultsId:0:inputAmoulll")).sendKeys("30");
    new Select(findElement(By.id("globalChldMiscPeriodicalFeesForm:searchMiscPeriodicalFeesResultsId:0:Langzzz"))).selectByVisibleText("Per a Month");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
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
