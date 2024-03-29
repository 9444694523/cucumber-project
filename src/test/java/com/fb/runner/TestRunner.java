package com.fb.runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = ".\\src\\test\\resources",
			glue = "com.Facebook",
			tags = "@Main",
			plugin = {"html:target/index.html","json:target/reports.json"},
			dryRun = false,
			monochrome = true
			)
	public class TestRunner {

	}

