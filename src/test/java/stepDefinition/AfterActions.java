package stepDefinition;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import config.Base;


public class AfterActions extends Base {

    @After
    public static void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");

        }
        driver.quit();
    }
}
