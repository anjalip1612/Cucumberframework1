package TestRunner;

import org.testng.annotations.Test;

import PageObjectFactory.ToolsDemoCartPage;
import PageObjectFactory.ToolsDemoCheckoutPage;
import PageObjectFactory.ToolsDemoConfirmationPage;
import PageObjectFactory.ToolsDemoHomePage;
import PageObjectFactory.ToolsDemoProductListingPage;

public class testrunner extends BaseClass{
ToolsDemoCartPage cartpg;
ToolsDemoCheckoutPage checkoutpg;
ToolsDemoConfirmationPage confirmpg;
ToolsDemoHomePage homepg;
ToolsDemoProductListingPage prodlistpg;
	@Test
	public void checkOut() throws InterruptedException
	{
		cartpg= new ToolsDemoCartPage(driver);
		checkoutpg=new ToolsDemoCheckoutPage(driver) ;
		confirmpg=new ToolsDemoConfirmationPage(driver) ;
		homepg=new ToolsDemoHomePage(driver) ;
		prodlistpg=new ToolsDemoProductListingPage(driver) ;
		
		homepg.clickSearchBtn();
		homepg.enterItem("dress");
		
		prodlistpg.clickFirstDressLink();
		
		cartpg.setColor("White");
		cartpg.setSize("Small");
		cartpg.clickAddToCart();
		cartpg.clickCart();
		
		checkoutpg.clickSearchBtn();
		
		confirmpg.setFirstName("Akshay");
		confirmpg.setLastName("Kumar");
		confirmpg.selectCountryName("Brazil");
		confirmpg.setAddress1("rd no 1234");
		confirmpg.setbillingCity("Delhi");
		confirmpg.setStateName("Roraima");
		confirmpg.setPin("444440");
		confirmpg.setPhoneNumber("9999998899");
		confirmpg.setEmail("abcd@gmail.com");
		confirmpg.check_TermsAndCondition(true);
		confirmpg.clickPlaceOrder();
		//Thread.sleep(3000);

		
		
		
		
	}

}
