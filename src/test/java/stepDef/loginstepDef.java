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

public class loginstepDef extends SeleniumUtilities {

	WebDriver driver;
	@Given("I have url and homepage")
	public void i_have_url_and_homepage() throws IOException {
		System.out.println("homepage");
		driver = setUp("browserName", "url");
		homePage obj = new homePage(driver);
		obj.safety1().click();
		obj.safety2().click();
		obj.signIn().click();
	}

	@Given("I have {string} and {string}")
	public void i_have_and(String string, String string2) {
		System.out.println(string);
		System.out.println(string2);
		loginPage obj = new loginPage(driver);
		obj.email().sendKeys(string);
		obj.password().sendKeys(string2);
		

	 
	}

	@When("I login to homwpage")
	public void i_login_to_homwpage() throws InterruptedException {
		System.out.println("login btn");
		loginPage obj = new loginPage(driver);
		obj.loginBtn().click();
		
		Thread.sleep(3000);
		
	  
	}

	@Then("I validate the login")
	public void i_validate_the_login() throws InterruptedException {
		System.out.println("test success");
		loginPage obj = new loginPage(driver);
		boolean alert=obj.alert().isDisplayed();
		Assert.assertTrue(alert);
		Thread.sleep(3000);
		driver.close();
				
	   
	}

	
}
