package PageObjectFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsDemoHomePage {
	 WebDriver driver;

	public ToolsDemoHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define all elements fo the page
	@FindBy(className = "icon_search")
	WebElement searchBtn;
	
	@FindBy(className = "form-control")
	WebElement txtBox;
	

	// define methods to perform actions
	public void clickSearchBtn() {
		searchBtn.click();
	}
	public void enterItem(String item) {
		txtBox.sendKeys(item);
		txtBox.sendKeys(Keys.ENTER);
	}
}
