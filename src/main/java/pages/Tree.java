package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class Tree {
	
	WebDriver driver;
	ConfigReader CR = new ConfigReader();
	Properties p = CR.init_prop();
	String treeURL  = p.getProperty("TreeURL");
	
	public Tree() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//a[text()='Data Structures']")WebElement DropdownDataStructures;
	@FindBy (xpath = "//a[text()='Graph']")WebElement DropdownGraph;
	@FindBy(xpath = "//*[@href='overview-of-trees']")WebElement overviewOfTreesLink;	
	@FindBy(xpath = "//*[@href='types-of-trees']")WebElement typesoftreesLink;
	@FindBy(xpath = "//*[@href='terminologies']")WebElement terminologiesLink;
	@FindBy(xpath = "//*[@href='tree-traversals']")WebElement treetraversalsLink;
	@FindBy(xpath = "//*[@href='traversals-illustration']")WebElement travIllustrationsLink;
	@FindBy(xpath = "//*[@href='binary-trees']")WebElement binarytreesLink;
	@FindBy(xpath = "//*[@href='types-of-binary-trees']")WebElement typesofBinaryTreesLink;
	@FindBy(xpath = "//a[@href='implementation-in-python']")WebElement implementationInPythonLink;
	@FindBy(xpath = "//a[@href='binary-tree-traversals']")WebElement binaryTreeTraversalsLink;
	@FindBy(xpath = "//a[@href='implementation-of-binary-trees']")WebElement implementationOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='applications-of-binary-trees']")WebElement applicationsOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='binary-search-trees']")WebElement binarySearchTreesLink;
	@FindBy(xpath = "//a[@href='implementation-of-bst']")WebElement implementationBSTLink;
	@FindBy(xpath = "//a[@href='/tree/practice']")WebElement practiceQLink;
	@FindBy(xpath="//*[@id='answer_form']/div/div/div[1]/textarea") WebElement editorbox;
	@FindBy(xpath="//*[@id='output']") WebElement outputbox;
	@FindBy(xpath="//button[text()='Run']") WebElement runbutton;
	@FindBy (xpath = "//a[text()='Try here>>>']")WebElement tryherebutton;
	
	public void ClickOnTree() {
		DropdownDataStructures.click();
		DropdownGraph.click();
	}
	
	public void getPagetitle() {
		System.out.println("User is on :"+ driver.getTitle());
	}
	public void getTreePage()
	{
		driver.navigate().to(treeURL);
	}
	
	public void clickPagelink(String pageName)
	{
		
		switch(pageName) {
		case "Overview of Trees": 
			overviewOfTreesLink.click();
			break;
		case "Types of Trees":
			typesoftreesLink.click();
		break;
		case "Terminologies":
			terminologiesLink.click();
		break;
		case "Traversals illustration":
			travIllustrationsLink.click();
		break;
		case "Tree Traversals":
			treetraversalsLink.click();
		break;
		case "Binary trees":
			binarytreesLink.click();
		break;
		case "Types of Binary trees":
			typesofBinaryTreesLink.click();
		break;
		case "Implementation in Python":
			implementationInPythonLink.click();
		break;
		case "Binary Tree Traversals":
			binaryTreeTraversalsLink.click();
		break;
		case "Implementation of Binary Trees":
			implementationOfBinaryTreesLink.click();
		break;
		case "Applications of Binary trees":
			applicationsOfBinaryTreesLink.click();
		break;
		case "Binary Search Trees":
			binarySearchTreesLink.click();
		break;
		case "Implementation Of BST":
			implementationBSTLink.click();
		break;
		case "Practice Questions":
		practiceQLink.click();
		break;
		}

		}
	
	public void getPage(String pageName)
	{
		String subPage;
		switch(pageName) {
		case "Overview of Trees": subPage="overview-of-trees/";
			driver.get(treeURL+subPage);
			break;
		case "Types of Trees":subPage="types-of-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Terminologies":subPage="terminologies/";
		driver.get(treeURL+subPage);
		break;
		case "Tree Traversals":subPage="binary-tree-traversals/";
		driver.get(treeURL+subPage);
		break;
		case "Traversals illustration":subPage="traversals-illustration/";
		driver.get(treeURL+subPage);
		break;
		case "Binary trees":subPage="binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Types of Binary trees":subPage="types-of-binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Implementation in Python":subPage="implementation-in-python/";
		driver.get(treeURL+subPage);
		break;
		case "Binary Tree Traversals":subPage="binary-tree-traversals/";
		driver.get(treeURL+subPage);
		break;
		case "Implementation of Binary Trees":subPage="implementation-of-binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Applications of Binary trees":subPage="applications-of-binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Binary Search Trees":subPage="binary-search-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Implementation Of BST":subPage="implementation-of-bst/";
		driver.get(treeURL+subPage);
		break;
		case "Practice Questions":subPage="practice";
		driver.get(treeURL+subPage);
		break;
		}
}
	
	public void TryHereButton() {
		tryherebutton.click();
	}
}
