package stepsdeffi;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.New_Article;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArticleStepDeffs {
	     WebDriver driver;
	     LoginPage loginPage;


	
	 public ArticleStepDeffs() {
		 TestBase.initDriver();
			driver = TestBase.getDriver();
			loginPage = new LoginPage(driver); 
 
	}

	@Given("User is on login page")
	public void user_is_on_login_page() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		TestBase.openURL("https://conduit-realworld-example-app.fly.dev/#/");
		loginPage.homePage();
     
		
	}
	@When("User provide {string} and {string}")
	public void user_provide_and(String strUser, String strPwd) {
		loginPage.validLogin(strUser, strPwd);

		
	}
	@Then("User should be on Home Page")
	public void user_should_be_on_home_page() {
		String expectedURL = driver.getCurrentUrl();
		assert driver.getCurrentUrl().equals(expectedURL) : "Loging failed, not on Home Page";

	}

}
