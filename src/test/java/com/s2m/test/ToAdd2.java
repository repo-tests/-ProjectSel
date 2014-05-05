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

  @Test
  public void testToAdd2() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/modules/issuer/fees/SSV8_ECR0029_RENEW_FEES.xhtml");
    new Select(findElement(By.id("ListeRenewFeesFrom:titleaaayyyy"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("ListeRenewFeesFrom:hsqyo54354")).click();
    findElement(By.id("ListeRenewFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("Fr_Ren_021");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("30");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).sendKeys("Fr_Ren_021");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeRenewFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).sendKeys("Fr_Ren_022");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("Fr_Ren_022");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("25");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeRenewFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).sendKeys("Fr_Ren_023");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("Fr_Ren_023");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("0");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    new Select(findElement(By.id("ListeRenewFeesFrom:titleaaayyyy"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("ListeRenewFeesFrom:hsqyo54354")).click();
    findElement(By.id("ListeRenewFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).sendKeys("Fr_Ren_031");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("200");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("vvvvvvvvvvvvvvvv");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("Fr_Ren_031");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeRenewFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).sendKeys("Fr_Ren_032");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("Fr_Ren_032");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("-12");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("12.000");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeRenewFeesFrom:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputIdaaayyyy")).sendKeys("Fr_Ren_033");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputLabeaaayyy")).sendKeys("Fr_Ren_033");
    Thread.sleep(1000); findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).clear();
    findElement(By.id("ListeRenewFeesFrom:searchResultsCardManagementFeesId:0:inputAmoulll")).sendKeys("2222222222");
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.linkText("Issuer Space")).click();
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
