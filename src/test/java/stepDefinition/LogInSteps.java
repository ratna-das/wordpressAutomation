package stepDefinition;

import config.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;


public class LogInSteps extends Base {

    LoginPage loginPage = new LoginPage();

    @Given("I am on log in page")
    public void iAmOnHomePage() {
        navigatTo();
        Assert.assertEquals(driver.getTitle(), "WordPress.com: Create a Free Website or Blog", "User not on log in page");
    }

    @Given("I log in with valid user id and password")
    public void iLogInWithValidUserIdAndPassword() {
        loginPage.signInBtn.click();
        isElementDisplayed(loginPage.userId, 5);
        loginPage.userId.sendKeys(prop.getProperty("userId"));
        loginPage.continueBtn.click();
        loginPage.password.sendKeys(prop.getProperty("password"));
        loginPage.logInBtn.click();
    }


    @Then("I should be land on promo page")
    public void iShouldBeLandOnPromoPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("promo"), "User not logged out");
    }
}