package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.SeleniumUtilities;

public class DashboardPage extends SeleniumUtilities{

	
	WebDriver driver;
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath="(//*[@class=\"text-center icon-big\"])[1]")
WebElement depositelogo;

@FindBy(xpath="(//*[@class=\"card-title text-light\"])[1]")
WebElement DepoBalance;

@FindBy(xpath="//p[contains(text(),'Deposited')]")
WebElement depoWord;

public WebElement displayDepo()
{
	//Assert.assertTrue(depoWord.isDisplayed());	
	return depoWord;
}

@FindBy(xpath="(//*[@class='logo'])[1]")
WebElement Logo;

public boolean LogoDispaly()
{
	boolean logo=Logo.isDisplayed();
	return logo;
}

public WebElement depoBalance()
{
	return DepoBalance;
	
}
@FindBy(xpath="//p[contains(text(),'Support')]")
WebElement support;

public void support()
{
	clickElement(support);
}



}
