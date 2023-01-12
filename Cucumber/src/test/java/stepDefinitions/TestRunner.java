package test.java.stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Cucumber/src/test/resources/Features/deleteProductAndReview.feature" ,plugin = {"pretty"}, glue = {"stepDefinitions"})

public class TestRunner {

}

