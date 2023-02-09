package test.auto;

import org.testng.annotations.Test;

import base.RootClass;

public class LandingPageTest extends RootClass {
	
	@Test
	public void creatAQuoteTest() {
		landingPage.validateLandingPageTitle("Only pay for what you need");
		landingPage.clickautoQuote();
	    landingPage.insertzipCode("10003");
		landingPage.clickgetMypriceBtn();
		
	}

}


