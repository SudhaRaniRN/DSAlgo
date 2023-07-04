package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tree;

public class TreeSD {
	
	Tree treepage  = new Tree();
	
	@When("The user clicks the Tree item from drop down menu")
	public void the_user_clicks_the_tree_item_from_drop_down_menu() {
		treepage .ClickOnTree();
	}

	@Then("The user should be directed to Tree Data Structure Page")
	public void the_user_should_be_directed_to_tree_data_structure_page() {
		treepage.getPagetitle();
	}

	@Given("The user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
		treepage.getTreePage();
	}

	@When("The user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
		treepage.clickPagelink(string);
	}
	
	@Given("The user is on the overview {string} after logged in")
	public void the_user_is_on_the_overview_after_logged_in(String string) {
		treepage.getPage(string);
	}
	@When("The user clicks Tree {string} button on {string} page")
	public void the_user_clicks_tree_button_on_page(String string, String string2) {
		treepage.TryHereButton();
	}
	
	@Given("The user is on the tree {string} after logged in")
	public void the_user_is_on_the_tree_after_logged_in(String string) {
	    
	}
	@Then("The user should be directed to Practice Questions of Overview of trees Page")
	public void the_user_should_be_directed_to_practice_questions_of_overview_of_trees_page() {
	   
	}
	}
