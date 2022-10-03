package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtilities {

	
	public static WebDriver driver;
	public static  Logger log;

	public WebDriver setUp(String x,String y) throws IOException {
		String browser=ReadPropFile(x);
		System.out.println(browser);
		String Url=ReadPropFile(y);	
		System.out.println(Url);
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else{
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(Url);
		driver.manage().window().maximize();	
		log=Logger.getLogger("Finorade_log");
		PropertyConfigurator.configure("log4j.properties");
		log.setLevel(Level.DEBUG);
		
		
		
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public static void GetUrl(String url)
	{
		
		//driver.get(url);
		
	}

	public String ReadPropFile(String Key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/Harshal/eclipse-workspace/BDDFramework/src/main/resources/AppData/data.properties");
		prop.load(fis);
		return (prop.getProperty(Key));
	}

	public void typeInput(WebElement element, String input) {
		//waitForElementDisplayed(element);
		element.clear();
		element.sendKeys(input);
	}

	public void clickElement(WebElement element) {
		//waitForElementTOBeClickable(element);
		element.click();
	}

//	public void waitForElementDisplayed(WebElement element) {
//		wait=new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(element));
//	}
//
//	public void waitForElementTOBeClickable(WebElement element) {
//		wait=new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(element));
//	}
	public void failedTest() throws IOException 
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst=new File("C:/Users/Harshal/eclipse-workspace-new/BDDTestNG/target/My/FailedTest.png");
		FileHandler.copy(src,dst);
	}
	
	public static Logger invokeLogger()
	{
		log=Logger.getLogger("Finorade_log");
		PropertyConfigurator.configure("log4j.properties");
		log.setLevel(Level.DEBUG);
		return log;
		
	}
	
		public static void takesScreenShot(String MethodName)
		{
		   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   try {
			FileHandler.copy(src, new File("C:/Users/Harshal/eclipse-workspace-new/BDDTestNG/target/My/"+MethodName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
