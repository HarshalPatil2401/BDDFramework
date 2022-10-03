package stepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DashboardPage;
import pageObject.homePage;
import pageObject.loginPage;
import pageObject.supportPage;

public class supportStepDef extends SeleniumUtilities {
	WebDriver driver;
	
	@Given("user has url and login credential")
	public void user_has_url_and_login_credential() throws IOException {
		driver=setUp("browserName","url");
		homePage obj = new homePage(driver);
		obj.safety1().click();
		obj.safety2().click();
		obj.signIn().click();
	   
	}

	@When("user go to suport page")
	public void user_go_to_suport_page() {
		loginPage obj = new loginPage(driver);
		obj.login();
		DashboardPage obj1= new DashboardPage(driver);
		obj1.support();
	   
	}

	@Then("validate support")
	public void validate_support() {
		supportPage obj = new supportPage(driver);
		Assert.assertTrue(obj.supportLogo().isDisplayed());
		driver.close();
	  
	}

}
