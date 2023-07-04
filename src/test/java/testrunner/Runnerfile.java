package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucmbereport.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		features = {"src/test/resources/features"},
		glue = {"stepdefinition", "hooks"}
		)

public class Runnerfile {

}
