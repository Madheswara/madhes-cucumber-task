package com.project2.stepdefenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\et\\eclipse-workspace\\CuProject2\\src\\test\\resources\\Features",
					     glue = "com.project2.stepdefenition",
				   monochrome = true,
					   plugin = "html:target",
					   dryRun = false,
					     tags = {("@flip"),("@amaz")}
					 )
	public class TestRunner {
	
}


