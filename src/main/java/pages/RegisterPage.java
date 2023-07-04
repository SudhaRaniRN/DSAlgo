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
import dsutilities.LoggerLoad;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;

public class RegisterPage {
	
	@FindBy (xpath = "//input[@Value='Register']")WebElement registerbutton;
	@FindBy (xpath = "//input[@id='id_username']")WebElement Usernamebutton;
	@FindBy (xpath = "//input[@id='id_password1']")WebElement password1;
	@FindBy (xpath = "//input[@id='id_password2']")WebElement password2;
	@FindBy (xpath = "//div[@class='alert alert-primary']")WebElement errormessage;
	@FindBy (xpath = "//div[@class='alert alert-primary']")WebElement successmessage;
	@FindBy (xpath = "//input[@id='id_password']")WebElement passwordText;
	@FindBy (xpath = "//input[@value='Login']")WebElement loginbutton;
	@FindBy (xpath = "//a[text()='Sign in']")WebElement siginbutton;
	
	 WebDriver driver;
	ConfigReader configreader = new ConfigReader();
	Properties prop = configreader.init_prop();
	String registerurl = prop.getProperty("RegisterURL");
	String siginurl = prop.getProperty("SignInURL");
	
	public RegisterPage() {
		this.driver= DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
   public void getResgisterPage() {
	 driver.get(registerurl);
    }
	public void PressRegisterButton() {
		registerbutton.click();
	}
	
	public void Alertmessage() {
		String alertmessage = Usernamebutton.getAttribute("validationMessage");
		 System.out.println(alertmessage);
		 LoggerLoad.info(alertmessage);
	 }
	
	public void EnterUsername(DataTable dataTable)  {
		List<Map<String, String>> datamap = dataTable.asMaps();
		String usrname = datamap.get(0).get("username");
		Usernamebutton.sendKeys(usrname);
		registerbutton.click();
	}
	
	public void Alertmessage2() {
		String alertmessage2 = password1.getAttribute("validationMessage");
		 System.out.println(alertmessage2);
		 LoggerLoad.info(alertmessage2);
	 }
	
	public void EnterUsernamePassword(DataTable datatable)  {
		List<Map<String, String>> credlist= datatable.asMaps();
		String usrname = credlist.get(0).get("username");
		String pwd = credlist.get(0).get("password");
		Usernamebutton.sendKeys(usrname);
		password1.sendKeys(pwd);
		registerbutton.click();
	}
	
	public void Alertmessage3() {
		String alertmessage3 = password2.getAttribute("validationMessage");
		 System.out.println(alertmessage3);
		 LoggerLoad.info(alertmessage3);
	 }
	
	public void InvalidUsername(DataTable dataTable)  {
		List<Map<String, String>> credlist = dataTable.asMaps();
		String usrname = credlist.get(0).get("username");
		String pwd = credlist.get(0).get("password");
		String pwd1 = credlist.get(0).get("password confirmation");
		Usernamebutton.sendKeys(usrname);
		password1.sendKeys(pwd);
		password2.sendKeys(pwd1);
		registerbutton.click();
	}
	
	public void ErrorMessage() {
		String Errormessage = errormessage.getText();
		String expectedmessage = "password_mismatch:The two password fields didn’t match.";
		Assert.assertEquals(expectedmessage, Errormessage);
		 System.out.println(Errormessage);
		 LoggerLoad.info(Errormessage);
	 }
	
	public void UsernameAlreadyExists(DataTable dataTable1) {
		
		List<Map<String, String>> credlist = dataTable1.asMaps();
		String usrname = credlist.get(0).get("username");
		String pwd = credlist.get(0).get("password");
		String pwd1 = credlist.get(0).get("password confirmation");
		Usernamebutton.sendKeys(usrname);
		password1.sendKeys(pwd);
		password2.sendKeys(pwd1);
		registerbutton.click();
	}
	
	public void ErrorMessage1() {
		String Errormessage1 = errormessage.getText();
		String expectedmessage1 = "password_mismatch:The two password fields didn’t match.";
		Assert.assertEquals(expectedmessage1, Errormessage1);
		 System.out.println(Errormessage1);
		 LoggerLoad.info(Errormessage1);
	 }
	
public void Passwordmismatch(DataTable dataTable2) {
		
		List<Map<String, String>> credlist = dataTable2.asMaps();
		String usrname = credlist.get(0).get("username");
		String pwd = credlist.get(0).get("password");
		String pwd1 = credlist.get(0).get("password confirmation");
		Usernamebutton.sendKeys(usrname);
		password1.sendKeys(pwd);
		password2.sendKeys(pwd1);
		registerbutton.click();
	}

   public void ErrorMessage2() {
	   String Errormessage2 = errormessage.getText();
	   String expectedmessage2 = "password_mismatch:The two password fields didn’t match.";
	   Assert.assertEquals(expectedmessage2, Errormessage2);
	   System.out.println(Errormessage2);
	   LoggerLoad.info(Errormessage2);
 }
   
   public void InvalidPassword(DataTable dataTable3) {
	   
	   List<Map<String, String>> credlist= dataTable3.asMaps();
	   String usrname = credlist.get(0).get("username");
	   String pwd = credlist.get(0).get("password");
	   String pwd1 = credlist.get(0).get("password confirmation");
	   Usernamebutton.sendKeys(usrname);
	   password1.sendKeys(pwd);
	   password2.sendKeys(pwd1);
	   registerbutton.click();
   }
   
   public void ErrorMessage3() {
	   String Errormessage3 = errormessage.getText();
	   String expectedmessage3 = "password_mismatch:The two password fields didn’t match.";
	   Assert.assertEquals(expectedmessage3, Errormessage3);
	   System.out.println(Errormessage3);
	   LoggerLoad.info(expectedmessage3);
	   
   }
   
   public void InvalidPassword1(DataTable dataTable4) {
	   List<Map<String, String>> credlist = dataTable4.asMaps();
	   String usrname = credlist.get(0).get("username");
	   String pwd = credlist.get(0).get("password");
	   String pwd1 = credlist.get(0).get("password confirmation");
	   Usernamebutton.sendKeys(usrname);
	   password1.sendKeys(pwd);
	   password2.sendKeys(pwd1);
	   registerbutton.click();
	   
   }
   
   public void ErrorMessage4() {
	   String Errormessage4 = errormessage.getText();
	   String expectedmessage4 = "password_mismatch:The two password fields didn’t match.";
	   Assert.assertEquals(expectedmessage4, Errormessage4);
	   System.out.println(Errormessage4);
	   LoggerLoad.info(expectedmessage4);
	   
   }
   
   
   public void InvalidPassword2(DataTable dataTable5) {
	   List<Map<String, String>> credlist = dataTable5.asMaps();
	   String usrname = credlist.get(0).get("username");
	   String pwd = credlist.get(0).get("password");
	   String pwd1 = credlist.get(0).get("password confirmation");
	   Usernamebutton.sendKeys(usrname);
	   password1.sendKeys(pwd);
	   password2.sendKeys(pwd1);
	   registerbutton.click();
	   
   }
   
   public void ErrorMessage5() {
	   String Errormessage5 = errormessage.getText();
	   String expectedmessage5 = "password_mismatch:The two password fields didn’t match.";
	   Assert.assertEquals(expectedmessage5, Errormessage5);
	   System.out.println(Errormessage5);
	   LoggerLoad.info(expectedmessage5);
	   
   }
   
   public void InvalidPassword3(DataTable dataTable6) {
	   List<Map<String, String>> credlist = dataTable6.asMaps();
	   String usrname = credlist.get(0).get("username");
	   String pwd = credlist.get(0).get("password");
	   String pwd1 = credlist.get(0).get("password confirmation");
	   Usernamebutton.sendKeys(usrname);
	   password1.sendKeys(pwd);
	   password2.sendKeys(pwd1);
	   registerbutton.click();
	   
   }
   
   public void ErrorMessage6() {
	   String Errormessage6 = errormessage.getText();
	   String expectedmessage6 = "Password can’t be commonly used password";
	   Assert.assertEquals(expectedmessage6, Errormessage6);
	   System.out.println(Errormessage6);
	   LoggerLoad.info(expectedmessage6);
	   
   }
   
   public void SuccessfulLogin(DataTable dataTable7) {
	   List<Map<String, String>> credlist = dataTable7.asMaps();
	   String usrname = credlist.get(0).get("username");
	   String pwd = credlist.get(0).get("password");
	   String pwd1 = credlist.get(0).get("password confirmation");
	   Usernamebutton.sendKeys(usrname);
	   password1.sendKeys(pwd);
	   password2.sendKeys(pwd1);
	   registerbutton.click();
	   
   }
   
   public void SuccessMessage() {
	   String successMessage = successmessage.getText();
	   String title = driver.getTitle();
	   String expectedtitle = "NumpyNinja";
	   Assert.assertEquals(expectedtitle, title);
	   System.out.println("The user is redirected to page " +title);
	   System.out.println(successMessage);
	   LoggerLoad.info("The user is redirected to page " +title);
	   
   }
    
   public void SignInPage() {
	   
	   driver.get(siginurl);
   }
   
public void SignIn(String username, String password) {
	   
	   Usernamebutton.sendKeys(username);
	   passwordText.sendKeys(password);
   }
   public void ClickLoginbutton() {
	   
	   loginbutton.click();
   }
}
	
	
	
	
	

