package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static commonAction.CommonActions.*;

public class VehicleInfoPage {
	
	@FindBy(css = ".pg-title")
	WebElement VehicleInfoPageTitle;
	@FindBy(xpath = "//label[@for='vehicleBySelectionIndicator-vehicle-0-YMM']")
	WebElement year_Make_model_Btn;
	@FindBy(xpath = "//select[@id='year-vehicle-0_selectNode']")
	WebElement makedropdown;
	@FindBy(css = "#model-vehicle-0_selectNode")
	WebElement modeldropdown;
	@FindBy(id = "fullModelName-vehicle-0_selectNode")
	WebElement trimdropdown;
	@FindBy(css = "#bodyStyle-vehicle-0_selectNode")
	WebElement bodystyledropdown;
	@FindBy(css = "#nextButton-0")
	WebElement saveandcontinue;
	
	public void vehiceInforpageTitle(String expectedTitle) {
		validate(VehicleInfoPageTitle,expectedTitle );
	}
	
	public void year_make_model_Btn() {
		click(year_Make_model_Btn);
	}
	
	public void makedropdow() {
		makedropdown.click();
		selectDropdown(makedropdown, "BMW");
	}
}
