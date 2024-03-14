package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "finish")
    WebElement finishBTN;
    @FindBy(className = "complete-header")
    WebElement completeHeader;

    public void ClickOnFinishButton(){
        finishBTN.click();
    }
    public String getCompleteHeaderMessage(){
        return  completeHeader.getText();
    }
}
