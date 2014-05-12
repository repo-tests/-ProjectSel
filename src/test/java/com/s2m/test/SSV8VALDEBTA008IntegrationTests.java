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

public class SSV8VALDEBTA008IntegrationTests {
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

  // ***creation des motifs de remplacement
  //***** un enregistrement fonctionnel (juste) et l'unicité d'id par banque
  // *** la longeur du champ id limitée mais le champ nom ne l'est pas
 @Test
  public void testSSV8VALDEBTA008aIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.xpath("(//a[contains(text(),'Card Replacement Motif')])[2]")).click();
    new Select(findElement(By.id("globalCardReplacementMotifForm:bank"))).selectByVisibleText("banque test 1");
    Thread.sleep(1000);
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_011");
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_011");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_011");
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_012");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_013");
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_01333333333333333333333333");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.id("globalCardReplacementMotifForm:searchCardDesignFeesResultsId:2:scxqsjhvcqjshcvhqsceee")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_013");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  //** vérifier que les champs banque, identifiant et banque sont obligatoires
 @Test
  public void testSSV8VALDEBTA008bIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    Thread.sleep(1000); findElement(By.id("j_username")).clear();
    findElement(By.id("j_username")).sendKeys("usercenter");
    Thread.sleep(1000); findElement(By.id("j_password")).clear();
    findElement(By.id("j_password")).sendKeys("pwd8888");
    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.xpath("(//a[contains(text(),'Card Replacement Motif')])[2]")).click();
    new Select(findElement(By.id("globalCardReplacementMotifForm:bank"))).selectByVisibleText("banque test 2");
    Thread.sleep(1000);
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_021");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_021");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_022");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_022");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_023");
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_023");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }
  
  // *** l'utilisation des données "......"
  //** et des données de longeurs de "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" pour le champ nom
  //* l'impossibilité de modifier l'id d'un motif de remplacemnt une fois enregistré
@Test
  public void testSSV8VALDEBTA008cIntegrationTests() throws Exception {
	 driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
	    Thread.sleep(1000); findElement(By.id("j_username")).clear();
	    findElement(By.id("j_username")).sendKeys("usercenter");
	    Thread.sleep(1000); findElement(By.id("j_password")).clear();
	    findElement(By.id("j_password")).sendKeys("pwd8888");
	    findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
	    findElement(By.xpath("//span/a[contains(@class,'btValider')]")).click();
	    findElement(By.id("form:table:1:sdksds")).click();
    findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    findElement(By.xpath("(//a[contains(text(),'Card Replacement Motif')])[2]")).click();
    new Select(findElement(By.id("globalCardReplacementMotifForm:bank"))).selectByVisibleText("banque test 3");
    Thread.sleep(1000);
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("..........");
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_031");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_031");
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.xpath("//table[@id='globalCardReplacementMotifForm:AZ']/tbody/tr/td/a[3]/img")).click();
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputIdeee")).sendKeys("ReasRp_033");
    Thread.sleep(1000); findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).clear();
    findElement(By.id("globalCardReplacementMotifForm:inputLabeeee")).sendKeys("ReasRp_033");
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
    findElement(By.id("globalCardReplacementMotifForm:searchCardDesignFeesResultsId:0:scxqsjhvcqjshcvhqsceee")).click();
    findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    findElement(By.id("globalCardReplacementMotifForm:fdfdfffffipppipppiiegggeooo")).click();
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
