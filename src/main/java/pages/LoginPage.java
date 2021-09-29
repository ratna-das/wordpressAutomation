package pages;

import config.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Base {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".x-nav-item [title='Log In']")
    public WebElement signInBtn;

    @FindBy(css = "input#usernameOrEmail")
    public WebElement userId;

    @FindBy(css = "input#password")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement continueBtn;

    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    public WebElement logInBtn;

    @FindBy(css = "li[id*=no_account]")
    public WebElement error;
}