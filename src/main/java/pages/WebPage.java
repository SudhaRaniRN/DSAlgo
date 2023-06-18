package pages;



import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;


public class WebPage {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//button[text()='Get Started']") WebElement getstartedbutton;
	
	public WebPage  () {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	

	
	public void DsAlgoPortalLink() {
		//driver.get("https://dsportalapp.herokuapp.com/");
		ConfigReader configreader = new ConfigReader();
		Properties prop = configreader.init_prop();
		String URL = prop.getProperty("WebpageURL");
		driver.get(URL);
	}
	
	public void webpageGetStartedButton() {	
		getstartedbutton.click();
	}
	
	public  void webpageTitle() {
		String title=  driver.getTitle();
		System.out.println(title);
	}
}
