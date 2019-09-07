package TestRunner;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//mehmet.kaymak//IdeaProjects//HelloWorld//src//test//Features",
        glue = "StepDefs"
)
public class testRunner {


}
