package com.wizz.stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = { "com.wizz.stepdefination" }, plugin = {
		"html:target" }, monochrome = true)
public class TestRunner {

}
