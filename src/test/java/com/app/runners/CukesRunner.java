package com.app.runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		//tags = "@shopping",
		features = {"src/test/resourses/com/app/features/shopping.feature"},  
		glue = "com/app/step_defenitions",
		dryRun = false
		)

public class CukesRunner {

}
