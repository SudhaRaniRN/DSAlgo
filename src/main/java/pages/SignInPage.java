package pages;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import dsutilities.ExcelReader;
import factory.DriverFactory;

public class SignInPage {

	WebDriver driver;
	
	public SignInPage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Register!']")WebElement registerbutton;
	@FindBy (xpath = "//input[@id='id_username']")WebElement usernametext;
	@FindBy (xpath = "//input[@id='id_password']")WebElement passwordtext;
	@FindBy (xpath = "//input[@value='Login']")WebElement loginbutton;
	@FindBy (xpath= "//a[text()='Sign out']")WebElement signoutbutton;
	
	
	public void ClickOnRegisterLink() {
		registerbutton.click();
	}
	
	public void RegisterPage() {
		
		String title = driver.getTitle();
		String expectedtitle= "Registration";
		Assert.assertEquals(expectedtitle, title);
		System.out.println("The user is in the"  +title+ "page");
	}
	
	public void InvalidCredentials(String username, String password) {
		
		usernametext.sendKeys(username);
		passwordtext.sendKeys(password);
		loginbutton.click();
		
	}
	
	public void ReadFromExcel(String Sheetname, int RowNumber) throws Exception {
		ExcelReader excelreader = new ExcelReader();
		ConfigReader configR = new ConfigReader();
		 Properties prop = configR.init_prop();
		String Excel = prop.getProperty("ExcelSheet");
		List<Map<String, String>> datamap = excelreader.getData(Excel, Sheetname);
		usernametext.sendKeys(datamap.get(RowNumber).get("username"));
		passwordtext.sendKeys(datamap.get(RowNumber).get("password"));
		loginbutton.click();
		
	}
	
	public void ValidLogin() {
		usernametext.sendKeys("Ninja_Hawks3");
		passwordtext.sendKeys("SDET@110");
		loginbutton.click();
	}
		
    public void signout() {
		signoutbutton.click();
		
	}
	
	public void homepage() {
		
		String title = driver.getTitle();
		String expectedtitle= "NumpyNinja";
		Assert.assertEquals(expectedtitle, title);
		System.out.println("The user is in the"  +title+ "page");
		
	}
}
