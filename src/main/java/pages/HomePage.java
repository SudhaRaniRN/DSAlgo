package pages;


import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import dsutilities.LoggerLoad;
import factory.DriverFactory;




public class HomePage {
	
	String warningmessage;
	//static  String URL = "https://dsportalapp.herokuapp.com/home";
     private WebDriver mydriver;
     ConfigReader configreader = new ConfigReader();
	 Properties prop = configreader.init_prop();
	 String URL = prop.getProperty("HomepageURL");
     
     
     
     public HomePage() {
 		this.mydriver = DriverFactory.getDriver();
 		PageFactory.initElements(mydriver, this);
     }
     
     public void gethomepage() {
    	 
    	// mydriver.get(URL);
    	 
    	 mydriver.get(URL);
    	 
     }
	

	@FindBy (xpath = "//a[@href='data-structures-introduction']")WebElement datastructure;
	@FindBy (xpath = "//a[@href='array']")WebElement array;
	@FindBy (xpath = "//a[@href='linked-list']")WebElement linkedlist;
	@FindBy (xpath = "//a[@href='stack']")WebElement Stack;
	@FindBy (xpath = "//a[@href='queue']")WebElement Queue;
	@FindBy (xpath = "//a[@href='tree']")WebElement Tree;
	@FindBy (xpath = "//a[@href='graph']")WebElement graph;
    @FindBy (xpath = "//div[@class='alert alert-primary']")WebElement warning;
    @FindBy (xpath = "//a[text()='Data Structures']")WebElement DropdownDataStructures;
    @FindBy (xpath = "//a[text()='Arrays']")WebElement Dropdownarray;
    @FindBy (xpath = "//a[text()='Linked List']")WebElement DropdownLinkedList;
    @FindBy (xpath = "//a[text()='Stack']")WebElement DropdownStack;
    @FindBy (xpath = "//a[text()='Queue']")WebElement DropdownQueue;
    @FindBy (xpath = "//a[text()='Tree']")WebElement DropdownTree;
    @FindBy (xpath = "//a[text()='Graph']")WebElement DropdownGraph;
    @FindBy (xpath = "//a[text()='Sign in']")WebElement signInbutton;
    @FindBy (xpath = " //a[text()=' Register ']")WebElement registerbutton;
    
    
    
    
    
    
    public void getwarning() {
    	String warningmessage = warning.getText();
    	System.out.println(warningmessage);
        LoggerLoad.info(warningmessage);
    	
    }
    public void ClickOnGetStarted(String option) {
    	
    	switch(option) {
    	case "Datastructures": datastructure.click();
             System.out.println(warningmessage);
             LoggerLoad.info(warningmessage);
    	break;
    	
    	case"Arrays":array.click();
    	     System.out.println(warningmessage);
             LoggerLoad.info(warningmessage);
    	break;
    	
    	case "Linkedlist":linkedlist.click();
    	     System.out.println(warningmessage);
             LoggerLoad.info(warningmessage);
        break;
        
    	case "Stack": Stack.click();
             System.out.println(warningmessage);
             LoggerLoad.info(warningmessage);
	    break;
        
    	case "Queue": Queue.click();
              System.out.println(warningmessage);
              LoggerLoad.info(warningmessage);
        break;
        
    	case "Tree": Tree.click();
             System.out.println(warningmessage);
             LoggerLoad.info(warningmessage);
        break;
        
    	case "Graph": graph.click();
             System.out.println(warningmessage);
             LoggerLoad.info(warningmessage);
        break;
    	}
    }
    public void checkhomepage() {
    	mydriver.navigate().to(URL);
    	String title = mydriver.getTitle();
    	String ExpectedTitle = "NumpyNinja";
     Assert.assertEquals(ExpectedTitle, title);
    }
    
    public void ClickOnDropDown(String option) {
    	
    	DropdownDataStructures.click();
    	switch(option) {
    	case "Arrays":Dropdownarray.click();
    	     System.out.println(warningmessage);
             LoggerLoad.info(warningmessage);
        break;
        
    	case "Linkedlist":DropdownLinkedList.click();
	     System.out.println(warningmessage);
        LoggerLoad.info(warningmessage);
   break;
   
    	case "Stack":DropdownStack.click();
	     System.out.println(warningmessage);
        LoggerLoad.info(warningmessage);
   break;
   
    	case "Queue":DropdownQueue.click();
	     System.out.println(warningmessage);
        LoggerLoad.info(warningmessage);
   break;
   
    	case "Tree":DropdownTree.click();
	     System.out.println(warningmessage);
        LoggerLoad.info(warningmessage);
   break;
   
    	case "Graph":DropdownGraph.click();
	     System.out.println(warningmessage);
        LoggerLoad.info(warningmessage);
   break;
    	}
    	
    }
    public void sigin() {
    	
    	signInbutton.click(); 	
    }
    
    public void checksigninpage() {
    	
    	mydriver.navigate().to("https://dsportalapp.herokuapp.com/login");
    	String title2= mydriver.getTitle();
    	String Expectedtitle2 = "Login";
    	Assert.assertEquals(Expectedtitle2, title2);
    }
    public void register() {
    	registerbutton.click();
    }
    
    }
    
    
	
	
	
	
	
   