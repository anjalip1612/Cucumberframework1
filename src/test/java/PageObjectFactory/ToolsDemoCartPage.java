package PageObjectFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToolsDemoCartPage {
	WebDriver driver;

	public ToolsDemoCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define all elements fo the page
	@FindBy(id = "pa_color")
	private WebElement dropdwncolor;

	@FindBy(id = "pa_size")
	private WebElement dropdwnsize;
	
	@FindBy(className="reset_variations")
	private WebElement clear;
	
	@FindBy(className="icon_minus-06")
	private WebElement minus;
	
	@FindBy(className="icon_plus")
	private WebElement plus;
	
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	private WebElement addToCart;
	
	@FindBy(className="cart-name-and-total")
	private WebElement cart;
	

	// define methods to perform actions
	public void setColor(String color) {
		Select sel = new Select(dropdwncolor);
		sel.selectByVisibleText(color);
	}

	public void setSize(String size) {
		Select sel = new Select(dropdwnsize);
		sel.selectByVisibleText(size);
	}
	public void setQuantity() {
		
	}
	public void clickAddToCart() {
		addToCart.click();
	}
	public void clickCart() {
		cart.click();
	}
	
}
