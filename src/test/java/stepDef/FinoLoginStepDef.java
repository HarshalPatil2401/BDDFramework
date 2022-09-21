package stepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homePage;
import pageObject.loginPage;

public class FinoLoginStepDef extends SeleniumUtilities {
	WebDriver driver;
	String Url;

	@Given("I have Url")
	public void i_have_url() throws IOException {
		Url = ReadPropFile("url");
		System.out.println("The Given Url is: " + Url);
		driver = setUp("browserName", "url");
	}

	@When("login to the Homepage")
	public void login_to_the_homepage() throws IOException, InterruptedException {
		homePage obj = new homePage(driver);
		obj.safety1().click();
		obj.safety2().click();
		obj.signIn().click();
	}

	@Then("Verify HomePage")
	public void verify_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.finotrades.com/login");
		driver.close();
	}

	@Given("i have url  and go to login page")
	public void i_have_url_and_go_to_login_page() throws IOException {
		driver = setUp("browserName", "url");
		homePage obj = new homePage(driver);
		obj.safety1().click();
		obj.safety2().click();
		obj.signIn().click();

	}

	@When("i enter Id and pass")
	public void i_enter_id_and_pass() {
		loginPage obj = new loginPage(driver);
		obj.login();
	}

	@Then("i clicked on login btn and looged in")
	public void i_clicked_on_login_btn_and_looged_in() throws InterruptedException {
		loginPage obj = new loginPage(driver);
		boolean alert=obj.alert().isDisplayed();
		Assert.assertTrue(alert);
		Thread.sleep(3000);
		driver.close();
	}

}
