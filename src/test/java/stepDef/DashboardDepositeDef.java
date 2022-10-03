package stepDef;

import java.io.IOException;

import org.apache.log4j.Logger;
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
	Logger log = Logger.getLogger(FinoLoginStepDef.class);

	@Given("user login to DashBoard")
	public void user_login_to_dash_board() throws IOException {
	   driver=setUp("browserName","url");
	   log.info("chrome has been started");
	   homePage obj = new homePage(driver);
		obj.safety1().click();
		obj.safety2().click();
		obj.signIn().click();
		log.info("signed into login");
		loginPage obj1= new loginPage(driver);
		obj1.login();
		log.info("login was succesful");
		
	}

	@Then("user verify deposite logo")
	public void user_verify_deposite_logo() throws InterruptedException {
		DashboardPage obj = new DashboardPage(driver);
		Thread.sleep(3000);
	 System.out.println(obj.displayDepo().isDisplayed());
	 log.info("deposite word is displayed");
	  driver.close();
	}
	
	

}
