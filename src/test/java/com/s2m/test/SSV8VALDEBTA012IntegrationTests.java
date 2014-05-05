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

public class SSV8VALDEBTA012IntegrationTests {
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
  
  //  tests de creation des frais de livraison rapide
  
  //**** verifier un enregistrement fonctionnele+unicté de l'id par banque + id obligatoire
 //@Test
  public void testSSV8VALDEBTA012aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Express Delivery Fees")).click();
    new Select(findElement(By.id("ListeExpressDeliveryForm:titlettt"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_011");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_011");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("FedEX");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_011");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_012");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("DHL");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("100");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_013");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("FedEX");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("90");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  
  ///****   verification : nom montant operateur obligatoires
 //@Test
  public void testSSV8VALDEBTA012bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Express Delivery Fees")).click();
    new Select(findElement(By.id("ListeExpressDeliveryForm:titlettt"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_021");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_021");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("FedEX");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("50");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_021");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_022");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_022");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("DHL");
    Thread.sleep(1000);
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("100");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_023");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_023");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("70");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("DHL");
    Thread.sleep(1000);
    findElement(By.xpath("//tr[2]/td/select/option[2]")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();

    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  ///*** verification: des données varies pour le champ montant "," et "." et "-12"
  
//@Test
  public void testSSV8VALDEBTA012cIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.linkText("Express Delivery Fees")).click();
    new Select(findElement(By.id("ListeExpressDeliveryForm:titlettt"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_03");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_031");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_031");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("FedEX");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("50,0");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("50");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_032");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_032");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("DHL");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("100.0");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.xpath("//div[3]/div[2]/div/div[2]/table/tbody/tr/td/div[2]/span/a")).click();
    findElement(By.id("ListeExpressDeliveryForm:hsqyoqpllll")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputIdttt")).sendKeys("Fr_Del_033");
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputLabettt")).sendKeys("Fr_Del_033");
    new Select(findElement(By.id("ListeExpressDeliveryForm:Langttt"))).selectByVisibleText("FedEX");
    Thread.sleep(1000);
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("-12");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).clear();
    findElement(By.id("ListeExpressDeliveryForm:inputAmoulll")).sendKeys("12.000");
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
