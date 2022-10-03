package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class supportPage {
	WebDriver driver;
	public supportPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1[contains(text(),'FinoTrades Support')]")
	WebElement supportLogo;
	
	public WebElement supportLogo()
	{
		return supportLogo;
	}

}
