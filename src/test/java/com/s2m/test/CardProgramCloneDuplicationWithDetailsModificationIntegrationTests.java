package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CardProgramCloneDuplicationWithDetailsModificationIntegrationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.0.0.107:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCardProgramCloneDuplicationWithDetailsModificationIntegrationTests() throws Exception {
    driver.get(baseUrl + "/selectsystem-view-tomcat-oracle/login.xhtml");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("usercenter");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("pwd8888");
    driver.findElement(By.cssSelector("#login > img[alt=\"Frensh\"]")).click();
    driver.findElement(By.id("form:fdfdfiiphhhppiiegggeooo")).click();
    driver.findElement(By.id("form:table:1:sdksds")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[4]")).click();
    driver.findElement(By.linkText("New card program")).click();
    new Select(driver.findElement(By.id("ListeCardForm:title"))).selectByVisibleText("OBZI Bank");
    driver.findElement(By.id("ListeCardForm:idIdenValid")).clear();
    driver.findElement(By.id("ListeCardForm:idIdenValid")).sendKeys("id11");
    driver.findElement(By.id("ListeCardForm:laaaaaaaabe")).clear();
    driver.findElement(By.id("ListeCardForm:laaaaaaaabe")).sendKeys("nom11");
    new Select(driver.findElement(By.id("ListeCardForm:Laffffngzzz"))).selectByVisibleText("<100001>........<100002>");
    driver.findElement(By.id("ListeCardForm:idIdenValid")).clear();
    driver.findElement(By.id("ListeCardForm:idIdenValid")).sendKeys("id11");
    driver.findElement(By.id("ListeCardForm:laaaaaaaabe")).clear();
    driver.findElement(By.id("ListeCardForm:laaaaaaaabe")).sendKeys("nom11");
    driver.findElement(By.id("ListeCardForm:AZD11heu")).click();
    new Select(driver.findElement(By.id("ListeCardForm:ProgrammesEMV"))).selectByVisibleText("OBZI VSDC ELECTRON");
    new Select(driver.findElement(By.id("ListeCardForm:piste102E"))).selectByVisibleText("Programme Risk FUS");
    new Select(driver.findElement(By.id("ListeCardForm:cardProgramControlItemsId"))).selectByVisibleText("Controles Produit Fusion");
    driver.findElement(By.id("ListeCardForm:cprLifeCyclId")).clear();
    driver.findElement(By.id("ListeCardForm:cprLifeCyclId")).sendKeys("2");
    driver.findElement(By.id("ListeCardForm:idCprPrepDate")).clear();
    driver.findElement(By.id("ListeCardForm:idCprPrepDate")).sendKeys("2");
    driver.findElement(By.id("ListeCardForm:pinTryLimit")).clear();
    driver.findElement(By.id("ListeCardForm:pinTryLimit")).sendKeys("3");
    driver.findElement(By.id("ListeCardForm:AZD11he")).click();
    driver.findElement(By.id("ListeCardForm:AZD11hf")).click();
    driver.findElement(By.id("ListeCardForm:AZD11ccllv")).click();
    driver.findElement(By.id("ListeCardForm:j_id521_lbl")).click();
    new Select(driver.findElement(By.id("ListeCardForm:withdraesItems"))).selectByVisibleText("Frais Main Levée FUSION");
    new Select(driver.findElement(By.id("ListeCardForm:idChldMembershipFeesItems"))).selectByVisibleText("Frais d'adhésion FUSION");
    new Select(driver.findElement(By.id("ListeCardForm:idPersonalizationFeesItems"))).selectByVisibleText("Frais de Perso FUSION");
    driver.findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeCardForm'),{'ListeCardForm:j_id695':'ListeCardForm:j_id695'},'');}return false\"]")).click();
    driver.findElement(By.linkText("Card program Clone")).click();
    new Select(driver.findElement(By.id("ListeTransactionForm:titled"))).selectByVisibleText("OBZI Bank");
    driver.findElement(By.id("ListeTransactionForm:hsqyo54354")).click();
    driver.findElement(By.xpath("//a[@id='ListeTransactionForm:searchResultsId:0:colne_command']/img")).click();
    driver.findElement(By.id("j_id419:cprIden")).clear();
    driver.findElement(By.id("j_id419:cprIden")).sendKeys("id12");
    driver.findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    driver.findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeTransactionForm'),{'ListeTransactionForm:j_id413':'ListeTransactionForm:j_id413'},'');}return false\"]")).click();
    driver.findElement(By.linkText("Card program management")).click();
    driver.findElement(By.id("ListeTransactionForm:hsqyo54354")).click();
    driver.findElement(By.cssSelector("img[alt=\"Modify\"]")).click();
    driver.findElement(By.id("ListeCardForm:AZD11heu")).click();
    driver.findElement(By.id("ListeCardForm:AZD11hf")).click();
    driver.findElement(By.id("ListeCardForm:AZD11he")).click();
    driver.findElement(By.id("ListeCardForm:AZD11ccllv")).click();
    driver.findElement(By.id("ListeCardForm:pinTryLimit")).clear();
    driver.findElement(By.id("ListeCardForm:pinTryLimit")).sendKeys("");
    driver.findElement(By.cssSelector("img[alt=\"save2\"]")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeCardForm'),{'ListeCardForm:j_id695':'ListeCardForm:j_id695'},'');}return false\"]")).click();
    driver.findElement(By.id("ListeTransactionForm:hsqyo54354")).click();
    driver.findElement(By.xpath("//span[@id='ListeTransactionForm:searchResultsId:0:j_id382']/a/img")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeTransactionForm'),{'ListeTransactionForm:j_id400':'ListeTransactionForm:j_id400'},'');}return false\"]")).click();
    driver.findElement(By.xpath("//span[@id='ListeTransactionForm:searchResultsId:0:j_id382']/a/img")).click();
    driver.findElement(By.xpath("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('ListeTransactionForm'),{'ListeTransactionForm:j_id400':'ListeTransactionForm:j_id400'},'');}return false\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='English'])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
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
