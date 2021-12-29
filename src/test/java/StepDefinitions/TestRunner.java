package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"},
        monochrome = true,

        plugin = {
                "pretty", // prints gherkin steps in console

                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",

                "rerun:/failed.txt"
        },


        tags="@smoketest"
)
public class TestRunner {
}
