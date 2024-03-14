package RestassuredBDD;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/RestassuredBDD.APIMethods.feature",
        glue = "RestassuredBDD.stepdefs",
        plugin = {"pretty", "html:target/cucumber-reports"})
public class Runner {
}



