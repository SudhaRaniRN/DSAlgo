package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;

public class SignInPageSD {
	
	
	SignInPage signinpage = new SignInPage();
	
	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
	    signinpage.ClickOnRegisterLink();
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
	    signinpage.RegisterPage();
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String username, String password) {

            signinpage.InvalidCredentials(username, password);
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheetname, int RowNumber) throws Exception {
       signinpage.ReadFromExcel(Sheetname, RowNumber);

	}

	@Given("The user is in the Home page with valid  log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
	    
		signinpage.ValidLogin();
	}
	
	@When("The user clicks2 {string}")
	public void the_user_clicks2(String string2) {
		signinpage.signout();
	    	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
	    signinpage.homepage();
	}
	

}