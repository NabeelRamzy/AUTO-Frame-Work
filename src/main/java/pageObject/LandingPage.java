package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static commonAction.CommonActions.*;

public class LandingPage {
	
	public  LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(xpath = "//h1[normalize-space(text())='Only pay for what you need']")
	@FindBy(xpath = "//h1[text()='Only pay for what you need']")
	WebElement landingPageTitl;
	@FindBy(xpath = "//input[@type='checkbox' and @data-testid='lob-Auto']")
	WebElement autoQuote;
	@FindBy(css = "#quote-zipCode-input")
	WebElement zipCode;
	@FindBy(xpath =   "//button[normalize-space(text())='Get my price']")
	WebElement getMyPriceBtn;
	 
	
	public void validateLandingPageTitle(String expectedTitle) {
		validate(landingPageTitl, expectedTitle);
	}
	
	public void clickautoQuote() {
		click(autoQuote);
	}
    
	public void insertzipCode (String zipcode) {
		insert(zipCode , zipcode);
	}
	
	public void clickgetMypriceBtn() {
		click(getMyPriceBtn);
	}
}
