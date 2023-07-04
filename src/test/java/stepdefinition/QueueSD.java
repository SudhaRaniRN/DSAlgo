package stepdefinition;

//import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Queue;

public class QueueSD {
	Queue queuepage = new Queue();
	
	@When("The user clicks the Queue item from drop down menu")
	public void the_user_clicks_the_queue_item_from_drop_down_menu() {
		queuepage.ClickOnQueue();
	}

	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
		queuepage.verifyQueuepage();
	}
	
	@Given("The user is in Queue Page")
	public void the_user_is_in_queue_page() {
		queuepage.UseronQueuepage();
	}
	
	@When("The user clicks on Implementation of queue  in Python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
	  queuepage.clickPythonLink();  
	}
	@Then("The user should be directed to Implementation of queue  in Python Page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
		queuepage.verifypage2();
	}
	
	@Given("The user is in Implementation of queue  in Python Page")
	public void the_user_is_in_implementation_of_queue_in_python_page() {
	   queuepage.getImplimentationListsPage(); 
	}
	
	@When("The user clicks on Implementation using collections deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
	    queuepage.clickDequeueLink();
	}
	
	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		queuepage.DQpage();
	}
	
	@Given("The user in implementation using collections page")
	public void the_user_in_implementation_using_collections_page() {
	    queuepage.getdeQueuePage();
	}
	
	@When("The user clicks on Implementation using array link")
	public void the_user_clicks_on_implementation_using_array_link() {
	    queuepage.clickImpArrayLink();
	}
	
	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		queuepage.ImplementatioArraypage();
	}
	
	@Given("The user in Implementation using array page")
	public void the_user_in_implementation_using_array_page() {
		queuepage.getImpArrayPage(); 
		
	}
	
	@When("The user clicks on Queue Operations  link")
	public void the_user_clicks_on_queue_operations_link() {
	    queuepage.clickQueueOpLink();
	}
	
	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		queuepage.verifyQOPpage();
	}
	
	@Given("The user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
	    queuepage.getQueueOpPage();
	}
	@When("The user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
		queuepage.clickPracticeQLink();	    
	}
	
	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
		queuepage.Queuepracticepage(); 
	}

}
