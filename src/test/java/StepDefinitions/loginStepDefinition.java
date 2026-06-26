package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_is_on_login_page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_enters_username_and_password");
	}

	/*@When("user enters * and *")
	public void user_enters_*_and_*() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clicks_on_login_button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_is_navigated_to_the_homepage");
	}
}
