package stepdefinition;


import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;

public class WebPageSD {
	
	
	private static String title; 
	
	private WebPage webpage = new WebPage();
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	  webpage.DsAlgoPortalLink();
	 

	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		
		webpage.webpageGetStartedButton();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		webpage.webpageTitle();
		System.out.println("The user is redirected to page "+ title);
		LoggerLoad.info("The user is redirected to page "+ title);
	}

}
