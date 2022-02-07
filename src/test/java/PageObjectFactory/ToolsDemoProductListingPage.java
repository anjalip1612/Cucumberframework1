package PageObjectFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsDemoProductListingPage {
	WebDriver driver;

	public ToolsDemoProductListingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//driver.findElements(By.cssSelector(".noo-product-inner"));
	// define all elements fo the page
	@FindAll(@FindBy(css = ".noo-product-inner"))
	private List<WebElement> firstDress;

	// define methods to perform actions
	public void clickFirstDressLink() {
		firstDress.get(0).click();

	}
}
