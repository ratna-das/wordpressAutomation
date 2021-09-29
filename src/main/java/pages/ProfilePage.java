package pages;

import config.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ProfilePage extends Base {

    JavascriptExecutor js = ((JavascriptExecutor) driver);

    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1.formatted-header__title")
    public WebElement header;

    @FindBy(css = "#first_name")
    public WebElement firstName;

    @FindBy(css = "#last_name")
    public WebElement lastName;

    @FindBy(css = "li .selected")
    public WebElement selectedOption;

    @FindBy(css = "#display_name")
    public WebElement dispalyName;

    @FindBy(css = "h2.profile-gravatar__user-display-name")
    public WebElement sideNavDispalyName;

    @FindBy(css = "button.sidebar__me-signout-button")
    public WebElement logOut;

    @FindBy(css = "textarea[name='description']")
    public WebElement aboutMe;

    @FindBy(xpath = "//button[contains(text(),'Save profile details')]")
    public WebElement saveBtn;

    @FindBy(css = ".section-header__actions button")
    public WebElement linkAddBtn;

    @FindBy(css = "input.profile-links-add-other__value")
    public WebElement urlLink;

    @FindBy(css = "input.profile-links-add-other__title")
    public WebElement linkDesc;

    @FindBy(xpath = "//button[contains(text(),'Add Site')]")
    public WebElement addSiteBtn;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public WebElement cancelBtn;

    @FindBy(css = "div.popover__inner")
    public List<WebElement> menu;

    @FindBy(css = "button.popover__menu-item")
    public List<WebElement> linkMenu;

    @FindBy(css = ".sidebar__menu li")
    public List<WebElement> sidebarMenu;

    @FindBy(css = "li.profile-link")
    public List<WebElement> addedLink;

    @FindBy(css = "button.profile-link__remove")
    public List<WebElement> removeLink;

    @FindBy(css = ".profile-gravatar__user-secondary-info")
    public WebElement userInfo;
}