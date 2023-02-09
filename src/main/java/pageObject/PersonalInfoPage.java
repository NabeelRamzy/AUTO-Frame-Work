package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static commonAction.CommonActions.*;

public class PersonalInfoPage {
	
	public PersonalInfoPage(WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".pg-title")
	WebElement personalInfoPageTitle;
	@FindBy(xpath = "//input[@autocomplete='given-name']")
	WebElement firstNameFld;
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameFld;
	@FindBy(xpath = "//select[@class='sm_cobrowsing_hidden_field sm_cobrowsing_disabled_field']")
	WebElement dateofbathFld;
	@FindBy (xpath = "//input[@type='email']")
	WebElement emailInput;
	@FindBy(css = "#nextButton-1")
	WebElement saveandContinueBtn;
	

	public void personalInfoPageTitle(String expectedTitle) {
		validate(personalInfoPageTitle, expectedTitle);
	}
	
	public void insertfirstnameFld(String firstName) {
		insert(firstNameFld, firstName);
	}
	
	public void insertlastfld(String lastName) {
		insert(lastNameFld, lastName);
		
	}
	
	public void personalInfoPageSteps() {
	   dateofbathFld.click();
	   selectDropdown(dateofbathFld , "February");
	}
	
	public void insertemailFld() {
		click(saveandContinueBtn);
	}
	
}
