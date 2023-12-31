package pages;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class Graph {

	WebDriver driver;
	ConfigReader CR = new ConfigReader();
	Properties p = CR.init_prop();
	
	public Graph() {
		this.driver= DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Data Structures']")WebElement DropdownDataStructures;
	@FindBy (xpath = "//a[text()='Graph']")WebElement DropdownGraph;
	@FindBy (xpath = "//div[2]/ul[2]/a")WebElement GraphButton;
	@FindBy (xpath = "//a[text()='Graph Representations']")WebElement graphRepresentationButton;
	@FindBy (xpath = "//a[text()='Practice Questions']")WebElement practicequestion;
	
	public void SelectfromDropDown() {
		DropdownDataStructures.click();
		DropdownGraph.click();
	}
	
	public void userongraphpage() {
		String pageurl0= p.getProperty("GraphURL")+"/graph";
		driver.navigate().to(pageurl0);
		System.out.println(pageurl0);
	}
	public void UserOnPage() {
        String pageurl = driver.getTitle();
        String expectedurl = "Graph";
        Assert.assertEquals(expectedurl, pageurl);
	}
	
	public void GraphPage(String Graph) {
		String PageURL = p.getProperty("GraphURL")+ "/graph";
		driver.navigate().to(PageURL);
		}
	
	public void GraphLink() {
		GraphButton.click();
	   }
	
	public void Graph2Page() {
		
		String pageurl1 = driver.getTitle();
		String expectedurl1 = "Graph";
		Assert.assertEquals(expectedurl1, pageurl1);
	}
	
	public void graphGraphPage(String graph) {
		String pageurl= p.getProperty("GraphURL2")+"graph";
		driver.navigate().to(pageurl);
	}
	
	public void graphRepresentation() {
		graphRepresentationButton.click();
	}
	public void graphRPage() {
		String pageurl2 = driver.getTitle();
		String expectedurl1 = "Graph Representations";
		Assert.assertEquals(expectedurl1, pageurl2);
	}
	public void graphRepresentationPage(){
		String pageur2= p.getProperty("GraphURL2")+"graph-representations";
		driver.navigate().to(pageur2);
	}
	public void practiceQuestion() {
		practicequestion.click();
	}
	public void practiceQuestionpage() {
		String pageurl3 = driver.getTitle();
		String expectedurl1 = "Practice Questions";
		Assert.assertEquals(expectedurl1, pageurl3);
	}
	
	
	
	
	
	
	
}
