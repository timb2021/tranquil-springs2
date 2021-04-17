package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:target/cucumber.html", "rerun:target/Rerun_Failed/LoginRunner.txt", "json:target/cucumber.json"},
        features = {"src/test/resources/features/mainPage(PLAN-1).feature"},
        glue = {"steps", "hooks"},
        dryRun = false

)


public class Runner {
}
