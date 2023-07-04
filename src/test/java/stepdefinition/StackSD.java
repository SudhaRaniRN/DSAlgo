package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Stack;

public class StackSD {
	Stack stackPage= new Stack();
	
	@When("The user select {string} item from the drop down menu")
	public void the_user_select_item_from_the_drop_down_menu(String Stack) {
	    stackPage.dsDropdownforStack();
	}
	
	@Given("The user is on the Stack page after logged in")
	public void the_user_is_on_the_stack_page_after_logged_in() {
		stackPage.redirectStackPage();
	}
	
	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		stackPage.opInStackClick();
	}

	
	@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String string) {
	   
	}
	
	@Given("The user is on the Operations in Stack page after logged in")
	public void The_user_is_on_the_Operations_in_Stack_page_after_logged_in() {}
	
	@When("The user clicks on the Implementation button")
	public void the_user_clicks_on_the_implementation_button() {
		stackPage.implementBtnClick();
	}
	
	@Then("The user should then be directed to Implementation Page")
	public void the_user_should_then_be_directed_to_implementation_page() {
	    
	}
	
	@Given("The user is on the Stack Implementation page after logged in")
	public void The_user_is_on_the_Stack_Implementation_Stack_page_after_logged_in() {}
	
	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		stackPage.applicationsBtnClick();
	}
	
	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
	    
	}
	
	@Given("The user is on the Applications stack page after logged in")
	public void The_user_is_on_the_Stack_Applications_Stack_page_after_logged_in() {
		stackPage.applicationstackpage();
	}
	
	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		stackPage.practiceQuestionBtnClick();
	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {
	    
	}
}
