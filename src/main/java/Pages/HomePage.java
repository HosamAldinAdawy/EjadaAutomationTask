package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "product_sort_container")
    WebElement filterSelection;
    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;
    @FindAll({@FindBy(className = "inventory_item_price")})
    List<WebElement> elements;
    @FindAll({@FindBy(xpath = "(//button[contains(.,'Add to cart')])")})
    List<WebElement> addToCart;
    public void getElements() {
        int Counter = 0;
        int Sum=0;
        for (WebElement i : elements) {
            String text = i.getText();
            String numberPattern = "\\d+";
            Pattern pattern = Pattern.compile(numberPattern);
            Matcher matcher = pattern.matcher(text);
            String number = null;
            if (matcher.find()) {
                number = matcher.group();
            }
            Sum+=Integer.parseInt(number);
            Counter++;
            if (Counter ==2)
                break;
        }
        System.out.println(Sum);
    }
    public void selectTheHightest3Items(){
        int counter = 0;
        for (WebElement x : addToCart) {
            x.click();
            counter++;
            if (counter == 2)
                break;
        }
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }
    public void filterFromHighToLow(){
        Select select = new Select(filterSelection);
        select.selectByValue("hilo");
    }


}
