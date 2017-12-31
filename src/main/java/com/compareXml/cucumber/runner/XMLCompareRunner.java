package com.compareXml.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = "com.compareXml.cucumber.stepdef",
		features = "src/main/features",
		tags = {"@Xml", "@Compare"}
		)

public class XMLCompareRunner {

}
