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

public class SSV8VALDEBTA015IntegrationTests {
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

//@Test
  public void testSSV8VALDEBTA015aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Design Fees")).click();
    new Select(findElement(By.id("globalChldCardDesignFeesForm:titleeeee"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_011");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_011");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_011");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_012");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("200");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_011");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("120");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//tr[2]/td[2]/table/tbody/tr[2]/td")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  
//@Test
  public void testSSV8VALDEBTA015bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Design Fees")).click();
    new Select(findElement(By.id("globalChldCardDesignFeesForm:titleeeee"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_021");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_021");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("450");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_022");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_022");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("150");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_023");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_023");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("10.0");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  //@Test
  public void testSSV8VALDEBTA015cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Design Fees")).click();
    new Select(findElement(By.id("globalChldCardDesignFeesForm:titleeeee"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("1222222222");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_031");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("100");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("//td[3]/span/a/img")).click();
    findElement(By.xpath("//td/div[3]/a")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_031");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_031");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("120");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_032");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("120000000000000000000000000000000000000000000000000000000");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("100");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='Modify'])[2]")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_032");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("globalChldCardDesignFeesForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputIdeee")).sendKeys("Fr_Des_033");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputLabeeee")).sendKeys("Fr_Des_033");
    Thread.sleep(1000); findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).clear();
    findElement(By.id("globalChldCardDesignFeesForm:inputAmoulll")).sendKeys("0000000000");
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
