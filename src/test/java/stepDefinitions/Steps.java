package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectFactory.ToolsDemoCartPage;
import PageObjectFactory.ToolsDemoCheckoutPage;
import PageObjectFactory.ToolsDemoConfirmationPage;
import PageObjectFactory.ToolsDemoHomePage;
import PageObjectFactory.ToolsDemoProductListingPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Steps {
	static WebDriver driver;
	ToolsDemoCartPage cartpg;
	ToolsDemoCheckoutPage checkoutpg;
	ToolsDemoConfirmationPage confirmpg;
	ToolsDemoHomePage homepg;
	ToolsDemoProductListingPage prodlistpg;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		confirmpg = new ToolsDemoConfirmationPage(driver);
	}

	@When("enter url {string}")
	public void enter_url(String string) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("search for dress")
	public void search_for_dress(String product) {
		homepg = new ToolsDemoHomePage(driver);
		homepg.clickSearchBtn();
		homepg.enterItem(product);
	}

	@When("choose to buy the first item")
	public void choose_to_buy_the_first_item() {
		prodlistpg = new ToolsDemoProductListingPage(driver);
		prodlistpg.clickFirstDressLink();
	}

	@When("moves to checkout from mini cart")
	public void moves_to_checkout_from_mini_cart() {
		cartpg = new ToolsDemoCartPage(driver);
		checkoutpg = new ToolsDemoCheckoutPage(driver);
		cartpg.setColor("White");
		cartpg.setSize("Small");
		cartpg.clickAddToCart();
		cartpg.clickCart();
		checkoutpg.clickChkoutBtn();
	}

	@When("enter personal details on checkout page")
	public void enter_personal_details_on_checkout_page() {

		confirmpg.setFirstName("Akshay");
		confirmpg.setLastName("Kumar");
		confirmpg.selectCountryName("India");
		confirmpg.setAddress1("rd no 1234");
		confirmpg.setbillingCity("Delhi");
		confirmpg.setStateName("Delhi");
		confirmpg.setPin("444440");
		confirmpg.setPhoneNumber("9999998899");
		confirmpg.setEmail("abcd@gmail.com");
		// confirmpg.check_TermsAndCondition();
	}

	@When("select same delivery address")
	public void select_same_delivery_address() {
	}

	@When("select payment method as {string} payment")
	public void select_payment_method_as_payment(String string) {
	}

	@When("place the order")
	public void place_the_order() {
		confirmpg.clickPlaceOrder();
	}

	@After
	public void teardown() {
		// driver.quit();
	}

}
