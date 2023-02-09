package libertymutualpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinearScripting {

	WebDriver driver;

	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.libertymutual.com/");
		driver.manage().window().maximize();
	}

	@Test(enabled = false)
	public void linearScripting() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.libertymutual.com/");

		WebElement star = driver.findElement(By.xpath("//input[@type='checkbox' and @data-testid='lob-Auto']"));

		star.click();

	}

	// LANDING PAGE PRE TEST
	@Test(enabled = false)
	public void Test1() {
		String pagetitle = driver.findElement(By.xpath("//h1[normalize-space(text())='Only pay for what you need']"))
				.getText();
		System.out.println("title--->" + pagetitle);
		driver.findElement(By.xpath("//input[@type='checkbox' and @data-testid='lob-Auto']")).click();

		driver.findElement(By.cssSelector("#quote-zipCode-input")).sendKeys("10003");
		driver.findElement(By.xpath("//button[normalize-space(text())='Get my price']")).click();

	}

	// ADDRESS PAGE PRE TEST

	@Test(enabled = true)
	public void Test2() {
		Test1();
		driver.findElement(By.linkText("OK, thanks!")).click();
		String pagetitle1 = driver.findElement(By.cssSelector(".pg-title")).getText();
		System.out.println("Title is --->" + pagetitle1);
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("1 Astor Place");
		driver.findElement(By.xpath("//input[@id='additionalStreetAddress-customer-0']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("10003");
		driver.findElement(By.xpath("//input[@id='city-customer-0']")).sendKeys("New York");
		driver.findElement(By.xpath("label[for='priorResidenceAddressIndicator-customer-0-Y']")).click();
		driver.findElement(By.xpath("//a[@id='nextButton-0']")).click();
	}

	// PERSONAL INFO PAGE PRE TEST
	@Test(enabled = false)
	public void Test3() {
		Test1();
		Test2();
		String pagetitle2 = driver.findElement(By.cssSelector(".pg-title")).getText();
		System.out.println("Title is --->" + pagetitle2);
        driver.findElement(By.xpath("//input[@autocomplete='given-name']")).sendKeys("Aryan");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Khan");
        driver.findElement(By.xpath("//select[@class='sm_cobrowsing_hidden_field sm_cobrowsing_disabled_field']"));
        driver.findElement(By.xpath("//input[@autocomplete='given-name']")).sendKeys("Aryan Khan");

	}
}
