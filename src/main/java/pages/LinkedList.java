package pages;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class LinkedList {
	
	WebDriver driver;
	ConfigReader CR = new ConfigReader();
	Properties p = CR.init_prop();
	
	public LinkedList() {
		this.driver= DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Data Structures']")WebElement DropdownDataStructures;
	@FindBy (xpath = "//a[text()='Linked List']")WebElement DropdownLinkedList;
	@FindBy(xpath="//a[text()='Introduction']") WebElement llIntroduction;
	@FindBy(xpath = "//a[text()='Creating Linked LIst']") WebElement creatingLL;
	@FindBy(xpath = "//a[text()='Types of Linked List']") WebElement llTypes;
	@FindBy(xpath = "//a[text()='Implement Linked List in Python']") WebElement implementLL;
	@FindBy(xpath = "//a[text()='Traversal']") WebElement traversalLL;
	@FindBy(xpath = "//a[text()='Insertion']") WebElement insertionLL;
	@FindBy(xpath = "//a[text()='Deletion']") WebElement deletionLL;
	@FindBy(xpath = "//a[text()='Practice Questions']") WebElement practiceLL;
	
	public void dsDropdownforLinkedList() {
		DropdownDataStructures.click();
		DropdownLinkedList.click();
	}
	
	public void useronLLpage() {
		
		String pageurl = driver.getTitle();
        String expectedurl = "Linked List";
        Assert.assertEquals(expectedurl, pageurl);
	}
	
	public void redirectLinkedListPage() {
		String linkedlist = p.getProperty("LinkedList");
		driver.navigate().to(linkedlist);
	}
	
	public void linkedListIntro() {
		llIntroduction.click();		
	}
	
	public void introductionpage() {
		System.out.println("the user is on page" + driver.getTitle());
	}
   public void userOnIndroductionPage() {
	   
	   String linkedlist2 = p.getProperty("LinkedListURL2");
		driver.navigate().to(linkedlist2);
   }
   
   public void creatingLLClick() {
		creatingLL.click();
	}
   
   public void CreatingLLpage() {
		System.out.println("the user is on page" + driver.getTitle());
	}
   public void llTypesClick() {
		llTypes.click();
	}
   public void implementLLClick() {
		implementLL.click();
	}
   
   public void traversalLLClick() {
		traversalLL.click();
	}
   public void insertionLLClick() {
		insertionLL.click();
	}
   
   public void deletionLLClick() {
		deletionLL.click();
	}
   public void practiceLLClick() {
		practiceLL.click();
	}
   public void practicepage() {
	   System.out.println("the user is on page" + driver.getTitle());
   }
}
