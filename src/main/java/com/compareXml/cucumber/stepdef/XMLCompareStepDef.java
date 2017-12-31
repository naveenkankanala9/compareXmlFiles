package com.compareXml.cucumber.stepdef;

import com.compareXml.cucumber.stepImpl.XMLCompareStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class XMLCompareStepDef extends XMLCompareStep {

	@Given("^Input xml firstFile filePath \"([^\"]*)\"$")
	public void input_xml_firstFile_filePath(String filePath) throws Throwable {
		parseFileToFirstFile(filePath);
	}

	@Given("^Input xml secondFile filePath \"([^\"]*)\"$")
	public void input_xml_secondFile_filePath(String filePath) throws Throwable {
	    parseFileToSecondFile(filePath);
	}

	@When("^Compare two files for redundants$")
	public void compare_two_files_for_redundants() throws Throwable {
	    compare();
	}

	@Then("^Save Output to filePath \"([^\"]*)\"$")
	public void save_Output_to_filePath(String filePath) throws Throwable {
	    saveOutputList(filePath);
	}

}
