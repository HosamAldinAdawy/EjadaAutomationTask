package TestsForUI;

import Configuration.loaddataproperties;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScenarioOne extends TestBase{
    LoginPage loginPage;
    HomePage homePage;
    CommonPage commonPage;
    CartPage cartPage;
    OverviewPage overviewPage;
    ChekoutPage chekoutPage;
    String username = loaddataproperties.UserData.getProperty("username");
    String password = loaddataproperties.UserData.getProperty("password");
    String firstname = loaddataproperties.UserData.getProperty("firstname");
    String lastname = loaddataproperties.UserData.getProperty("lastname");
    String postalcode = loaddataproperties.UserData.getProperty("postalcode");
    String ActualResult;
    @Test
    public void ExecuteScenarioOne() throws InterruptedException {
        loginPage = new LoginPage(driver);
        commonPage = new CommonPage(driver);
        homePage = new HomePage(driver);
        cartPage =new CartPage(driver);
        overviewPage = new OverviewPage(driver);
        chekoutPage = new ChekoutPage(driver);


        loginPage.EnterUserNameValue(username);
        loginPage.EnterPasswordValue(password);
        loginPage.clickOnLoginBTN();
        ActualResult = commonPage.getPageTitle();
        Assert.assertEquals(ActualResult,"Products");
        homePage.filterFromHighToLow();
        homePage.selectTheHightest3Items();
        homePage.getElements();
        homePage.clickOnCartIcon();
       ActualResult = commonPage.getPageTitle();
       Assert.assertEquals(ActualResult,"Your Cart");
       cartPage.clickOnCheckoutButton();
       ActualResult = commonPage.getPageTitle();
       Assert.assertEquals(ActualResult,"Checkout: Your Information");
       chekoutPage.EnterFirstName(firstname);
       chekoutPage.EnterLastName(lastname);
       chekoutPage.EnterPostalCode(postalcode);
       chekoutPage.ClickOnContinueButton();
       ActualResult = commonPage.getPageTitle();
       Assert.assertEquals(ActualResult,"Checkout: Overview");
       overviewPage.ClickOnFinishButton();
       ActualResult = overviewPage.getCompleteHeaderMessage();
       Assert.assertEquals(ActualResult,"Thank you for your order!");
    }

}
