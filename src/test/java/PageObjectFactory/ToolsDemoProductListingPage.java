package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsDemoProductListingPage {
	WebDriver driver;

	public ToolsDemoProductListingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define all elements fo the page
	@FindBy(xpath = "//a[text()='white milkmaid hook and eye bodycon midi dress']")
	WebElement firstDress;

	// define methods to perform actions
	public void clickFirstDressLink() {
		firstDress.click();

	}
}
