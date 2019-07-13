import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature"}, glue = {"stepDefinitions"}, tags = {"@formulario"})

public class Runners {

}
