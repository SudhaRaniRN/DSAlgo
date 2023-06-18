package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;


public class HomePageSD {
	
 HomePage homepage= new HomePage();
	
	@Given("user is on the homepage")
	public void the_user_is_on_the_homepage() {
		homepage.gethomepage();

	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) {
         homepage.ClickOnGetStarted(option);

	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
     homepage.getwarning();

	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
	    homepage.checkhomepage();

	}

	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String option) {
            homepage.ClickOnDropDown(option);

	}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
	    homepage.checkhomepage();
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		homepage.sigin();
	    	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
       homepage.checksigninpage();

	}
	
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	    homepage.register();
	}
	
	}