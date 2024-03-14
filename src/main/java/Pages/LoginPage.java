package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement loginBTN;
    public void EnterUserNameValue(String usernamevalue){
        userName.clear();
        userName.sendKeys(usernamevalue);
    }
    public void EnterPasswordValue(String passwordValue){
        password.clear();
        password.sendKeys(passwordValue);
    }
    public void clickOnLoginBTN(){
        loginBTN.click();
    }

}
