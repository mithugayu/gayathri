package testmeapp;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="sathiya/test.feature",
glue="testmeapp",
plugin="json:target\\jsonReport.json")
public class testrun {

}
