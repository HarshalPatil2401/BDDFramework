package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {

	
	WebDriver driver;
	public DashboardPage(WebDriver driver)
	{
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath="(//*[@class=\"text-center icon-big\"])[1]")
WebElement depositelogo;

@FindBy(xpath="(//*[@class=\"card-title text-light\"])[1]")
WebElement DepoBalance;

@FindBy(xpath="//*[contains(text(),'Deposited')]")
WebElement depoWord;

public WebElement displayDepo()
{
	//Assert.assertTrue(depoWord.isDisplayed());	
	return depoWord;
}

}
