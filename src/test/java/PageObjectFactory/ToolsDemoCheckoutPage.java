package PageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsDemoCheckoutPage {
	WebDriver driver;
	
		public ToolsDemoCheckoutPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		// define all elements fo the page
		@FindBy(xpath="//a[contains(text(),'checkout')]")
		private WebElement checkOutBtn;

		// define methods to perform actions
		public void clickChkoutBtn() {
			checkOutBtn.click();
	}
}
