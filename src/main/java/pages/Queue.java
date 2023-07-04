package pages;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class Queue {
	
	WebDriver driver;
	ConfigReader CR = new ConfigReader();
	Properties p = CR.init_prop();
	
	public Queue() {
		this.driver= DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Data Structures']")WebElement DropdownDataStructures;
	@FindBy (xpath = "//a[text()='Queue']")WebElement DropdownQueue;
	@FindBy(xpath="//a[@href='implementation-lists']") WebElement pythonImplink;
	@FindBy(xpath="//a[@href='implementation-collections']") WebElement dqlink;
	@FindBy(xpath="//a[@href='Implementation-array']") WebElement impArraylink;
	@FindBy(xpath="//a[@href='QueueOp']") WebElement queueOplink;
	@FindBy(xpath="//a[@href='/queue/practice']") WebElement practiceQlink;	
	
	public void ClickOnQueue() {
		DropdownDataStructures.click();
		DropdownQueue.click();
		
	}
	
	public void verifyQueuepage() {
		String pageurl1= driver.getTitle();
		String expected = "Queue";
		Assert.assertEquals(expected, pageurl1);
	}
	public void UseronQueuepage() {
		String URL = p.getProperty("QueueURL");
		driver.navigate().to(URL);
		
	}
	public void clickPythonLink()
	{
		pythonImplink.click();
	}
   public void verifypage2() {
	   String expected = "Implementation of Queue in Python";
	   String pageurl2= driver.getTitle();
	   Assert.assertEquals(expected, pageurl2);
   }
   
   public void getImplimentationListsPage(){
	   
	   String implementListURL = p.getProperty("queimplementationlists");
		driver.navigate().to(implementListURL);
	}
   public void clickDequeueLink()
	{
		dqlink.click();
	}
	
	public void DQpage() {
		System.out.println("The user is on" + driver.getTitle());
	}
	
	public void getdeQueuePage() {
		String URL = p.getProperty("impdeqeueurl");
		driver.navigate().to(URL);
	}
	
	public void clickImpArrayLink()
	{
		impArraylink.click();
	}
	public void ImplementatioArraypage() {
		System.out.println("The user is on" + driver.getTitle());
		
	}
	
	public void getImpArrayPage() {
		String url = p.getProperty("imparrayurl");
		driver.navigate().to(url);
	}
	
	public void clickQueueOpLink()
	{
		queueOplink.click();
	}
	
	 public void verifyQOPpage() {
		   String expected = "Queue Operations";
		   String pageurl2= driver.getTitle();
		   Assert.assertEquals(expected, pageurl2);
	   }
	 
	 public void getQueueOpPage() {
		 String url = p.getProperty("queueopurl");
		 driver.navigate().to(url);
	 }
	 public void clickPracticeQLink()
		{
			practiceQlink.click();
		}
	 
	 public void Queuepracticepage() {
		 String expected = "Practice Questions";
		   String pageurl2= driver.getTitle();
		   Assert.assertEquals(expected, pageurl2);
	   }
	 
}
