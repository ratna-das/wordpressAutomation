package stepDefinition;


import config.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import pages.ProfilePage;

import java.util.List;


public class ProfileSteps extends Base {

    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();

    @And("I should land on home page")
    public void iShouldLandOnHomePage() {
        Assert.assertEquals(homePage.header.getText(), "My Home", "User not in home page");
    }

    @When("I click on my profile icon")
    public void iClickOnMyProfileIcon() {
        homePage.profileIcon.click();
    }

    @Then("I should be on my profile page")
    public void iShouldBeOnMyProfilePage() {
        waitTime(2);
        Assert.assertEquals(profilePage.header.getText(), "My Profile", "User not in profile page");
    }

    @And("I should see my userid in side navbar")
    public void iShouldSeeMyUseridInSideNavbar() {
        Assert.assertEquals(profilePage.userInfo.getText(), prop.getProperty("userInfo"), "User Id not matched");
    }

    @And("my public display name should be visible")
    public void myPublicDisplayNameShouldBeVisible() {
        Assert.assertEquals(profilePage.sideNavDispalyName.getText(), prop.getProperty("displayName"), "Public Display Name not matched");
    }

    @And("I should see log out option available on side nav bar")
    public void iShouldSeeLogOutOptionAvailableOnSideNavBar() {
        Assert.assertTrue(isElementDisplayed(profilePage.logOut, 5), "Button not available");
    }

    @When("I log out")
    public void iLogOut() {
        profilePage.logOut.click();
        waitTime(2);
    }

    @And("I update my first name")
    public void iUpdateMyFirstName() {
        profilePage.firstName.clear();
        profilePage.firstName.sendKeys(prop.getProperty("updatedFirstName"));
    }

    @And("I update my last name")
    public void iUpdateMyLastName() {
        profilePage.lastName.clear();
        profilePage.lastName.sendKeys(prop.getProperty("updatedLastName"));
    }

    @When("I update my public user name")
    public void iUpdateMyPublicUserName() {
        profilePage.dispalyName.clear();
        profilePage.dispalyName.sendKeys(prop.getProperty("updatedDisplayName"));
    }

    @And("I save my details")
    public void iSaveMyDetails() {
        profilePage.saveBtn.click();
        waitTime(2);
    }

    @Then("my public display name should be updated")
    public void myPublicDisplayNameShouldBeUpdated() {
        Assert.assertEquals(profilePage.sideNavDispalyName.getText(), prop.getProperty("updatedDisplayName"), "Public Display Name not updated");
    }

    @Given("I add profile link {string}")
    public void iAddProfileLink(String index) {
        if (profilePage.menu.size() < 1) {
            profilePage.linkAddBtn.click();
        }
        profilePage.linkMenu.get(1).click();
        profilePage.urlLink.sendKeys(prop.getProperty("profileLink" + index));
        profilePage.linkDesc.sendKeys(prop.getProperty("desc" + index));
        profilePage.addSiteBtn.click();
        waitTime(2);
    }

    @Given("I click add profile link button")
    public void iClickAddProfileLinkButton() {
        profilePage.linkAddBtn.click();
    }

    @And("I should see following option available:")
    public void iShouldSeeFollowingOptionAvailable(List<String> options) {
//        options.forEach(o -> Assert.assertEquals(getElementByText(profilePage.linkMenu,o),o));
        for (int i = 0; i < profilePage.linkMenu.size(); i++) {
            Assert.assertTrue(profilePage.linkMenu.get(i).getText().equals(options.get(i)), "Option not available");
        }
        waitTime(2);
    }

    @Then("I should see {int} link added to my profile")
    public void iShouldSeeLinkAddedToMyProfile(int number) {
        Assert.assertTrue(profilePage.addedLink.size() == number, "Added link number didn't match");
    }

    @When("I remove all the link")
    public void iRemoveAllTheLink() {
        for (WebElement link : profilePage.addedLink) {
            link.findElement(By.cssSelector(".profile-link__remove")).click();
        }
        waitTime(2);
    }

    @And("I should see {string} option is selected")
    public void iShouldSeeOptionIsSelected(String option) {
        Assert.assertTrue(profilePage.selectedOption.getText().equals(option), "Option was not selected mode");
    }

    @And("I should see following option in side nav bar:")
    public void iShouldSeeFollowingOptionInSideNavBar(List<String> options) {
        for (int i = 0; i < profilePage.sidebarMenu.size(); i++) {
            Assert.assertTrue(profilePage.sidebarMenu.get(i).getText().equals(options.get(i)), "Option not available");
        }
        waitTime(2);
    }
}