package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static commonAction.CommonActions.*;

public class AddressPage {
	
	public  AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "OK, thanks!")
	WebElement okBtn;
	@FindBy(css = ".pg-title")
	WebElement addressPageTitle;
	@FindBy(xpath = "//input[@name='address']")
	WebElement StreetAddressInput;
	@FindBy(xpath = "//input[@id='additionalStreetAddress-customer-0']")
	WebElement aptorUnitInput;
	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement zipCodeInput;
    @FindBy(xpath = "//input[@id='city-customer-0']")
	WebElement cityInput;
    @FindBy(css = "label[for='priorResidenceAddressIndicator-customer-0-Y']")
	WebElement yesBtn;
    @FindBy(xpath = "//a[@id='nextButton-0']")
    WebElement saveandContinue;
    
    public void clickOkbtn() {
    	click(okBtn);
    }
    
    public void validateaddressPage(String addressPagetitle) {
    	validate(addressPageTitle, addressPagetitle );	
    }
    
    public void insertStreetAddressInput(String StreetAddress) {
    	insert(StreetAddressInput , StreetAddress);
    }
    
    public void insertaptOrUnitInput(String aptUnit) {
    	insert(aptorUnitInput, aptUnit);
    }
    
    public void insertzipCodeInput(String zipcode) {
    	insert(zipCodeInput, zipcode);
    }
    
    public void  insertCityInput(String city) {
    	insert(cityInput, city);
    }
    
    public void clickyesBtn() {
    	click(yesBtn);
    }
    
    public void clicksaveandContinue() {
    	click(saveandContinue);
    }
}
