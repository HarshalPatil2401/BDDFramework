package stepDef;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homePage;

public class Faqcheck extends SeleniumUtilities{
	WebDriver driver;
	
	@Given("i have url")
	public void i_have_url() throws IOException {
		driver=setUp("browserName","url");
		homePage obj = new homePage(driver);
		obj.safety1().click();
		obj.safety2().click();
		
	  
	}

	@When("i go to faq")
	public void i_go_to_faq() throws InterruptedException {
		homePage obj = new homePage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", obj.faq());
		Thread.sleep(3000);
	}

	@When("i click on faq")
	public void i_click_on_faq() {
		homePage obj = new homePage(driver);
		obj.Faqclick().click();

	}

	@Then("faq description open")
	public void faq_description_open() throws InterruptedException {
		homePage obj = new homePage(driver);
		boolean check=obj.FAQ().isDisplayed();
		Assert.assertTrue(check);
		Thread.sleep(3000);
		driver.close();
	}

}
