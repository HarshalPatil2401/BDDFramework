package stepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.DashboardPage;
import pageObject.homePage;
import pageObject.loginPage;

public class DashboardDepositeDef extends SeleniumUtilities {
	WebDriver driver;
	@Given("user login to DashBoard")
	public void user_login_to_dash_board() throws IOException {
	   driver=setUp("browserName","url");
	   homePage obj = new homePage(driver);
		obj.safety1().click();
		obj.safety2().click();
		obj.signIn().click();
		loginPage obj1= new loginPage(driver);
		obj1.login();
		driver.close();
	}

	@Then("user verify deposite logo")
	public void user_verify_deposite_logo() throws InterruptedException {
		DashboardPage obj = new DashboardPage(driver);
		Thread.sleep(3000);
	  System.out.println(obj.displayDepo().isDisplayed()); 
	  driver.close();
	}
	
	

}
