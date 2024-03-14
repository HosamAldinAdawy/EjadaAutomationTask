package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends BasePage{
    public CommonPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@class='title']")
    WebElement headerTitle;
    public String getPageTitle()
    {
        return headerTitle.getText();
    }
}
