package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy (how = How.CSS, using = "input[id='username']") WebElement usernameField;
    @FindBy (how = How.CSS, using = "input[id='password']") WebElement passwordField;
    @FindBy (how = How.XPATH, using = "//button[text()='Sign in']") WebElement loginButton;


    public void insertUsername(){

        usernameField.sendKeys("demo@techfios.com");

    }

    public void insertPassword(){

        passwordField.sendKeys("abc123");

    }

    public void pressLogin(){

        loginButton.click();

    }

}
