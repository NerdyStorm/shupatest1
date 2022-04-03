package steps;

import org.openqa.selenium.WebDriver;

import base.LoginBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDefinition {

	WebDriver driver;
	LoginPage loginPage;

	@Before
	public void before() {

		LoginBase.initDriver();
		driver = LoginBase.driver;

		loginPage = new LoginPage(driver);

	}

	// Given user is on Techfios Login page

	@Given("^user is on Techfios Login page$")
	public void user_is_on_techfios_login_page() {

		driver.get("https://www.techfios.com/billing");

	}
	// When user enter username as "demo@techfios.com"

	@When("^user enters \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_enters_usersname_as(String option, String username) {

		if (option.equals("username")) {
			loginPage.insertUsername();
		}
		else if (option.equals("password")){
			loginPage.insertPassword();
		}

	}

	@When("^user clicks  signin button$")
	public void user_clicks_signin_button() {

		loginPage.pressLogin();

	}

}
