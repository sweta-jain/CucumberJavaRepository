package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchStepDefinition {

	WebDriver driver = null;
	
	@Before()
	public void browserSetup() {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	   driver.manage().window().maximize();
	}
	
	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://google.com");
	}
	
	@When("user enters search text")
	public void user_enters_search_text() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
	}
	
	@When("user hits enter")
	public void user_hits_enter() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.getPageSource().contains("Online Courses");
	    Thread.sleep(2000);
	}
	
	@After
	public void browserTeardown() {
		driver.close();
	    driver.quit();
	}
}
