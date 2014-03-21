package com.s2m.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


	public class SecondIntegrationTests {
		private Selenium selenium;

		@Before
		public void setUp() throws Exception {
			selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://10.0.0.107:8080/selectsystem-view-tomcat-oracle/login.xhtml");
			selenium.start();
		}

		@Test
		public void testSecond() throws Exception {
			selenium.open("/selectsystem-view-tomcat-oracle/login.xhtml");
			selenium.click("css=#login > img[alt=\"Frensh\"]");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=form:fdfdfiiphhhppiiegggeooo");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=form:table:0:sdksds");
			selenium.click("xpath=(//img[@alt='English'])[6]");
			selenium.waitForPageToLoad("30000");
			selenium.click("link=New fee");
			selenium.waitForPageToLoad("30000");
			selenium.type("id=globalcardHolderCommissionForm:iden", "22");
			selenium.type("id=globalcardHolderCommissionForm:label", "nom22");
			selenium.type("id=globalcardHolderCommissionForm:rate", "11");
			selenium.type("id=globalcardHolderCommissionForm:fixe", "25");
			selenium.type("id=globalcardHolderCommissionForm:min", "100");
			selenium.type("id=globalcardHolderCommissionForm:max", "200");
			selenium.click("//a[@id='globalcardHolderCommissionForm:userModifButton']/img");
			selenium.waitForPageToLoad("30000");
			selenium.click("//a[@onclick=\"if(typeof jsfcljs == 'function'){jsfcljs(document.getElementById('globalcardHolderCommissionForm'),{'globalcardHolderCommissionForm:j_id420':'globalcardHolderCommissionForm:j_id420'},'');}return false\"]");
			selenium.waitForPageToLoad("30000");
		}

		@After
		public void tearDown() throws Exception {
			selenium.stop();
		}
	}



