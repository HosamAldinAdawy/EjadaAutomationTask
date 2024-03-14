package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChekoutPage extends BasePage{
    public ChekoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "first-name")
    WebElement firstName;
    @FindBy(id = "last-name")
    WebElement lastName;
    @FindBy(id = "postal-code")
    WebElement postalCode;
    @FindBy(id = "continue")
    WebElement continueBTN;
    public void EnterFirstName(String firstNameValue){
        firstName.clear();
        firstName.sendKeys(firstNameValue);
    }
    public void EnterLastName(String lastNameValue){
        lastName.clear();
        lastName.sendKeys(lastNameValue);
    }
    public void EnterPostalCode(String postalCodeValue){
        postalCode.clear();
        postalCode.sendKeys(postalCodeValue);
    }
    public void ClickOnContinueButton(){
        continueBTN.click();
    }
}
