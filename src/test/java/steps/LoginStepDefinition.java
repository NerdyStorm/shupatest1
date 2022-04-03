package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	//Given user is on Techfios Login page 	
	
	@Given ("^user is on Techfios Login page$")
	public void user_is_on_techfios_login_page() {
}		
//When user enter username as "demo@techfios.com"

 @When ("^user enter username as \"([^\"]*)\"$")
 public void user_enters_usersname_as(String username) {
	 
 }
 
}
