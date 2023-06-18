package pages;



import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dsutilities.ConfigReader;
import dsutilities.ExcelReader;
import dsutilities.LoggerLoad;
import factory.DriverFactory;



public class DataStructure {
	
	WebDriver driver;

	public DataStructure() {
		this.driver= DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	ConfigReader CR = new ConfigReader();
	Properties p = CR.init_prop();
	ExcelReader ER= new ExcelReader();
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	@FindBy (xpath = "//input[@id='id_username']")WebElement usernametext;
	@FindBy (xpath = "//input[@id='id_password']")WebElement passwordtext;
	@FindBy (xpath = "//input[@value='Login']")WebElement loginbutton;
	@FindBy (xpath = "//div[3]/div[1]/div[1]/div/a")WebElement DSgetstarted;
	@FindBy (xpath = "//a[text()='Time Complexity']")WebElement timecomplex;
	@FindBy (xpath = "//a[text()='Try here>>>']")WebElement tryherebutton;
	@FindBy (xpath = "//textarea[@tabindex='0']")WebElement TextEditor;
	@FindBy (xpath = "//button[text()= 'Run']")WebElement runButton;
	@FindBy (xpath = "//*[@id=\"output\"]")WebElement Output;
	
		public void Credentials () {
			
			usernametext.sendKeys("Ninja_Hawks3");
			passwordtext.sendKeys("SDET@110");
			
		}
		public void Login() {
			
			loginbutton.click();
		}
		
		public void Datastructurehomepage() {
			
		String title= driver.getTitle();
		String expectedtitle = "NumpyNinja";
		Assert.assertEquals(expectedtitle, title);
		}
		
		public void DSGetstarted() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(DSgetstarted));
			DSgetstarted.click();
			
		}
		
		public void verifyDSpage() {
			String expected0 = "Data Structures-Introduction";
			String page0= driver.getTitle();
			Assert.assertEquals(expected0, page0);
		}
		
		public void CilckTimeComplex() {
			
			String DSURL = p.getProperty("DataStructureURL");	
			driver.navigate().to(DSURL);
			WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(timecomplex));
			timecomplex.click();
			
		}
		
		public void verifyTCpage() {
			String expected1 = "Time Complexity";
			String page1= driver.getTitle();
			Assert.assertEquals(expected1, page1);
		}
		
		public void TimeComplexityPage () {
			
			String DSURL2 = p.getProperty("DataStructureURL2");
			driver.navigate().to(DSURL2);
			
		}
		
		public void TryHerebutton() {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.END).perform();
			
			tryherebutton.click();
		}
		
		public void verifyTHpage() {
			
			String expected2= "Assessment";
			String page2 = driver.getTitle();
			System.out.println(page2);
			Assert.assertEquals(expected2, page2);
		}
		
		public void TryHerepage() {
			String DSURL3 = p.getProperty("DataStructureURL3");
			driver.navigate().to(DSURL3);
			
			
		}
		public void ValidCode(String Sheetname, int RowNumber) throws Exception {
			//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
			//wait.until(ExpectedConditions.visibilityOf(runButton));
			String code = p.getProperty("ExcelSheet");
			List<Map<String, String>>datamap = ER.getData(code,Sheetname);
			TextEditor.sendKeys(datamap.get(RowNumber).get("pythonCode"));
			System.out.println(datamap.get(RowNumber).get("pythonCode"));
		}
		
		public void RunButton() {
			runButton.click();
		}
		
		public void getOutput() {
			
			String output= Output.getText();
			System.out.println(output);
			LoggerLoad.info(output);
		}
		
		public void Invalidecode(String Sheetname, int RowNumber) throws Exception {
			String xlpath = p.getProperty("ExcelSheet");
			List<Map<String, String>> code2= ER.getData(xlpath, Sheetname);
			TextEditor.sendKeys(code2.get(RowNumber).get("pythonCode"));
		}
		public void Errormessage() {
			Alert alert = driver.switchTo().alert();
			String errormessage = alert.getText();
			alert.accept();
			System.out.println(errormessage);
			LoggerLoad.info(errormessage);
			
		}
		
		
		
		
}
