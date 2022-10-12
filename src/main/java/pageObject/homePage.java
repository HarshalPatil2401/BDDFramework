package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.SeleniumUtilities;

public class homePage extends SeleniumUtilities {
	

	WebDriver driver;
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='details-button']")
	WebElement safety1 ;
	
	public WebElement safety1()
	{
		return safety1;
	}
	
	@FindBy(xpath="//*[@id='proceed-link']")
	WebElement safety2;
	public WebElement safety2()
	{
		return safety2;
	}
	
	@FindBy(xpath="//*[@href='login']")
	WebElement signin;
	
	public WebElement signIn()
	{
		return signin;
	}
	
	@FindBy(xpath="(//*[@class='section-header'])[5]")
	WebElement faq;
	
	public WebElement faq()
	{
		return faq;
	}
	@FindBy(xpath="//*[@href='#faq17']")
	WebElement faq17click;
	
	public WebElement Faqclick()
	{
		return faq17click;
	}
	@FindBy(xpath="//*[@id='faq17']")
	WebElement faq17;
	
	public WebElement FAQ()
	{
		return faq17;
	}
	
	
	

}
