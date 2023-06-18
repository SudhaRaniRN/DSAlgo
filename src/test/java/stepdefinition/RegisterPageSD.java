package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class RegisterPageSD {
	
 private RegisterPage registerpage= new RegisterPage();
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {

              registerpage.getResgisterPage();
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String username) {
      registerpage.PressRegisterButton();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string){
	 
	    registerpage.Alertmessage();
	}

	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, DataTable dataTable) throws InterruptedException {
	    registerpage.EnterUsername(dataTable);
	    
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
	    registerpage.Alertmessage2();
	}

	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String string2, String string3, DataTable datatable) throws InterruptedException {
         registerpage.EnterUsernamePassword(datatable);

	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
	     registerpage.Alertmessage3();
	}

	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, DataTable dataTable)  {
	     registerpage.InvalidUsername(dataTable);
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	   registerpage.ErrorMessage();
	}


	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3, DataTable dataTable1) {
	    registerpage.UsernameAlreadyExists(dataTable1);
	}
	
	@Then("It should display an error message1 {string}")
	public void it_should_display_an_error_message1(String string) {
	   registerpage.ErrorMessage1();
	}

	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string, String string2, String string3, String string4,DataTable dataTable2) {
	    registerpage.Passwordmismatch(dataTable2);
	}
	
	@Then("It should display an error message2 {string}")
	public void it_should_display_an_error_message2(String string) {
	   registerpage.ErrorMessage2();
	}

	@When("The user enters a valid {string} and {string} with characters less than {int}")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, Integer int1, DataTable dataTable3) {
	    registerpage.InvalidPassword(dataTable3);
	}
	
	@Then("It should display an error message3 {string}")
	public void it_should_display_an_error_message3(String string) {
	   registerpage.ErrorMessage3();
	}

	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2, DataTable dataTable4) {
	    registerpage.InvalidPassword1(dataTable4);
	}
	
	@Then("It should display an error message4 {string}")
	public void it_should_display_an_error_message4(String string) {
	   registerpage.ErrorMessage4();
	}

	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2, DataTable dataTable5) {
       registerpage.InvalidPassword2(dataTable5);

	}
	
	@Then("It should display an error message5 {string}")
	public void it_should_display_an_error_message5(String string) {
	   registerpage.ErrorMessage5();
	}

	@When("The user enters a valid {string} and commonly used password {string}")
	public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2, DataTable dataTable6) {
	    registerpage.InvalidPassword3(dataTable6);
	}
	
	@Then("It should display an error message6 {string}")
	public void it_should_display_an_error_message6(String string) {
	   registerpage.ErrorMessage6();
	}

	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3, DataTable dataTable7) {
	    registerpage.SuccessfulLogin(dataTable7);
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
		registerpage.SuccessMessage();
	    
	}

	@Given("The user is on the Sign in page")
	public void the_user_is_on_the_sign_in_page() {
	    registerpage.SignInPage();
	}

	@When("The user enters a valid {string} and {string}")
	public void the_user_enters_a_valid_and(String username, String password) {
	    registerpage.SignIn(username, password); 
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {
      registerpage.ClickLoginbutton();
		
	}

}
