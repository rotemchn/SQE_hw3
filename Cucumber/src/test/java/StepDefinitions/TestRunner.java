package test.java.StepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Cucumber/src/test/resources/Features/deleteProductAndReview.feature"},plugin = "pretty")

public class TestRunner {

}

