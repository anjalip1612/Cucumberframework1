package PageObjectFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToolsDemoConfirmationPage {
	WebDriver driver;

	public ToolsDemoConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// define all elements fo the page
	@FindBy(id = "billing_first_name")
	WebElement firstNametxtbox;

	@FindBy(id = "billing_last_name")
	WebElement lastNametxtbox;

	@FindBy(id = "billing_company")
	WebElement compNametxtbox;

	@FindBy(id = "billing_country")
	WebElement country;

	@FindBy(id = "billing_address_1")
	WebElement billingAddress1;

	@FindBy(id = "billing_address_2")
	WebElement billingAddress2;

	@FindBy(id = "billing_city")
	WebElement billingCity;

	@FindBy(id = "billing_state")
	WebElement state;

	@FindBy(id = "billing_postcode")
	WebElement billingPostcode;

	@FindBy(id = "billing_phone")
	WebElement billingPhone;

	@FindBy(id = "billing_email")
	WebElement billingEmail;

	@FindBy(how = How.CSS, using = "#terms.input-checkbox") 
	private WebElement chkbx_AcceptTermsAndCondition;

	@FindBy(id = "place_order")
	WebElement placeOrder;

	// define methods to perform actions
	public void setFirstName(String firstName) {
		firstNametxtbox.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		lastNametxtbox.sendKeys(lastName);
	}

	public void setCompName(String compName) {
		compNametxtbox.sendKeys(compName);
	}

	public void selectCountryName(String inputcountryName) {
		Select sel=new Select(country);
		sel.selectByVisibleText(inputcountryName);
	}

	public void setAddress1(String add1) {
		billingAddress1.sendKeys(add1);
	}

	public void setAddress2(String add2) {
		billingAddress2.sendKeys(add2);
	}

	public void setbillingCity(String billcity) {
		billingCity.sendKeys(billcity);
	}

	public void setStateName(String statename) {
		Select sel=new Select(state);
		sel.selectByVisibleText(statename);
	}

	public void setPin(String pin) {
		billingPostcode.sendKeys(pin);
	}

	public void setPhoneNumber(String phone) {
		billingPhone.sendKeys(phone);
	}

	public void setEmail(String email) {
		billingEmail.sendKeys(email);
	}

	public void check_TermsAndCondition(boolean value) {
		if(value) chkbx_AcceptTermsAndCondition.click();
	}

	public void clickPlaceOrder() {
		placeOrder.click();
	}

}
