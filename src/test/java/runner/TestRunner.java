package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/feature/",
        glue = {"stepDefinition"},
        tags = {"@all"},
        dryRun = false,
        plugin = {"json:target/reports/cucumber.json",
                "html:target/reports",
                "pretty"})

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}