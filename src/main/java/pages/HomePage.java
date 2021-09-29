package pages;

import config.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Base {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1.formatted-header__title")
    public WebElement header;

    @FindBy(css = "img[alt='My Profile']")
    public WebElement profileIcon;
}