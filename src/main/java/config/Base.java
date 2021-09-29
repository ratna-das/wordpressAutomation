package config;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Properties prop;
    public static String browserName;

    @FindBy(css = "#last_name")
    public WebElement submit;

    @FindBy(css = "h1.formatted-header__title")
    public WebElement header;

    @FindBy(css = "button[class]")
    public List<WebElement> buttons;


    public Base() {
        try {
            prop = new Properties();
            FileInputStream data = new FileInputStream(
                    "src/main/java/config/testdata.properties");
            prop.load(data);
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void navigatTo() {
        driver.get(prop.getProperty("url"));
    }


    public void waitUntilElementIsClickable(WebElement element, int timeout) {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(timeout, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static boolean isElementDisplayed(WebElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (StaleElementReferenceException e) {
            return false;
        }
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public boolean retryingClick(WebElement element) {
        boolean success = false;
        int attempts = 0;
        while (attempts < 5) {
            try {
                element.click();
                success = true;
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }
        return success;
    }

    public static void waitTime(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
