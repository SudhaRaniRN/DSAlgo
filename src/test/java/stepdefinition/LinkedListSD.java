package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LinkedList;

public class LinkedListSD {
	
	
	LinkedList LLpage = new LinkedList();
	
	@When("The user selecting {string} item from the drop down menu")
	public void the_user_selecting_item_from_the_drop_down_menu(String linkedList) {
		LLpage.dsDropdownforLinkedList();
	}
	
	@Then("The user should be directed to Linked List Page")
	public void the_user_should_be_directed_to_Linked_List_page_after_logged_in() {
		LLpage.useronLLpage();
	}
	
	@Given("The user is in the Linked List  page after logged in")
	public void the_user_is_in_the_linked_list_page_after_logged_in() {
		LLpage.redirectLinkedListPage();
	}
	
	@When("The user clicks Introduction {string} link")
	public void the_user_clicks_introduction_link(String string) {
		LLpage.linkedListIntro();
	}
	
	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) {
		LLpage.introductionpage();
	}
	
	@Given("The user is on the Introduction after logged in")
	public void the_user_is_on_theIntroduction__after_logged_in() {
		LLpage.userOnIndroductionPage();
	}
	
	@When("The user clicks the creating Linked list {string} button")
	public void the_user_clicks_the_creating_linked_list_button(String string) {
		LLpage.creatingLLClick();
	}
	
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
		LLpage.CreatingLLpage();
	}
	
	@Given("The user is on the Creating a Linked List after logged in")
	public void the_user_is_on_the_creating_a_Linked_list_after_logged_in() {
		
	}
	
	@When("The user clicks the Types of Linked List {string} button")
	public void the_user_clicks_the_types_of_linked_list_button(String string) {
		LLpage.llTypesClick();
	}
	
	@Given("The user is on the Types of Linked list after logged in")
	public void the_user_is_on_the_Types_of_Linked_List_after_logged_in() {
		
	}
	
	@When("The user clicks the Implement {string} button")
	public void the_user_clicks_the_implement_button(String string) {
		LLpage.implementLLClick();
	}
	
	@When("The user clicks the Traversal {string} button")
	public void the_user_clicks_the_traversal_button(String string) {
		LLpage.traversalLLClick();
	}

	
	@When("The user clicks the Insertion {string} button")
	public void the_user_clicks_the_insertion_button(String string) {
		LLpage.insertionLLClick();
	}
	
	@When("The user clicks the deletion {string} button")
	public void the_user_clicks_the_deletion_button(String string) {
		LLpage.deletionLLClick();
	}
	
	@When("The user clicks on the Practice Questions")
	public void the_user_clicks_on_the_practice_questions() {
		LLpage.practiceLLClick();
	}
	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
		LLpage.practicepage();
	}
	
	@Given("The user is on the Traversal after logged in")
	public void The_user_is_on_the_Traversal_after_logged_() {}
	
	@Given("The user is on the Insertion after logged in")
	public void The_user_is_on_the_Insertion_after_logged_() {}
	
	@Given("The user is on the Deletion after logged in")
	public void The_user_is_on_the_Deletion_after_logged_() {}
	
	@Given("The user is on the Implement Linked List in Python after logged in")
	public void The_user_is_on_the_Implement_Linked_List_after_logged_() {}

}
