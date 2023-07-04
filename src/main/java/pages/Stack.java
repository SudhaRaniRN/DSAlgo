package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class Stack {
	
	WebDriver driver;
	ConfigReader CR = new ConfigReader();
	Properties p = CR.init_prop();
	
	public Stack() {
		this.driver= DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Data Structures']")WebElement DropdownDataStructures;
	@FindBy (xpath = "//a[text()='Stack']")WebElement DropdownStack;
	@FindBy(xpath="//a[text()='Operations in Stack']") WebElement opInStack;
	@FindBy(xpath="//a[text()='Implementation']") WebElement implementBtn;
	@FindBy(xpath="//a[text()='Applications']") WebElement applicationsBtn;
	@FindBy(xpath="//a[text()='Practice Questions']") WebElement practiceBtn;

	
	public void dsDropdownforStack() {
		DropdownDataStructures.click();
		DropdownStack.click();
	}
	
	public void redirectStackPage() {
		
		String stack = p.getProperty("Stack");
		System.out.println("Stack url: " +stack);
		driver.navigate().to(stack);
	}
	
	public void opInStackClick() {
		opInStack.click();		
	}
	
	public void implementBtnClick() {
		implementBtn.click();
	}
	
	public void applicationstackpage() {
		String stack = p.getProperty("StackURL2");
		System.out.println("Stack url: " +stack);
		driver.navigate().to(stack);
	}
	
	public void applicationsBtnClick() {
		applicationsBtn.click();
	}
	
	public void practiceQuestionBtnClick() {
		practiceBtn.click();
	}
}
