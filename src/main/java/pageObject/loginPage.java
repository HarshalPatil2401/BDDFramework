package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.SeleniumUtilities;

public class loginPage extends SeleniumUtilities {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='email']")
	 WebElement email;
	
	@FindBy(xpath="//*[@id='password']")
     WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement loginbtn;
	public WebElement email()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement loginBtn()
	{
		return loginbtn;
	}
	public void login()
	{
		typeInput(email,"hp7066550140@gmail.com");
		typeInput(password,"Harshal@2401");
		clickElement(loginbtn);
		
	}
	
	@FindBy(xpath="//*[@class='alert alert-danger']")
	WebElement alert;
	public WebElement alert()
	{
		return alert;
	}
	

	
}
