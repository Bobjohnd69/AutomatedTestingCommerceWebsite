package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"StepDefinition", "utility"},
        tags = "@addToCart",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"})
public class AddToCartTestRunner {

}
