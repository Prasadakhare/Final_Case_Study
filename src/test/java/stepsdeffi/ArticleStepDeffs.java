package stepsdeffi;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import Base.TestBase;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArticleStepDeffs {
	WebDriver driver = TestBase.getDriver();


	
	
	
	@BeforeTest
	public void setup() {
		driver.get("https://www.saucedemo.com/");
		//TestBase.openURL("https://www.saucedemo.com/");
		
	}
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {

		
	}
	@When("User provide {string} and {string}")
	public void user_provide_and(String string, String string2) {
	

		
	}
	@Then("User should be on Home Page")
	public void user_should_be_on_home_page() {
		

	}

}
