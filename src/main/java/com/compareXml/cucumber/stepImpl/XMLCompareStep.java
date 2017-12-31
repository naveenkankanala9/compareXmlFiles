package com.compareXml.cucumber.stepImpl;

import java.util.List;

import com.compareXml.model.FirstFile;
import com.compareXml.model.OutputFile;
import com.compareXml.model.SecondFile;

@SuppressWarnings("unchecked")
public abstract class XMLCompareStep {
	
	private List<FirstFile> firstFileList;
	
	private List<SecondFile> secondFileList;
	
	private List<OutputFile> outputFileList;
	
	
	public void parseFileToFirstFile(String filePath){
		this.firstFileList = XMLCompareStepUtil.parseXmlToList(filePath, FirstFile.class);
	}
	
	public void parseFileToSecondFile(String filePath){
		this.secondFileList = XMLCompareStepUtil.parseXmlToList(filePath, SecondFile.class);
	}
	
	public void compare(){
		
	}
	
	public void saveOutputList(String filePath){
		XMLCompareStepUtil.writeMarksToFile(filePath, outputFileList);
	}

	public List<FirstFile> getFirstFileList() {
		return firstFileList;
	}

	public void setFirstFileList(List<FirstFile> firstFileList) {
		this.firstFileList = firstFileList;
	}

	public List<SecondFile> getSecondFileList() {
		return secondFileList;
	}

	public void setSecondFileList(List<SecondFile> secondFileList) {
		this.secondFileList = secondFileList;
	}

	public List<OutputFile> getOutputFileList() {
		return outputFileList;
	}

	public void setOutputFileList(List<OutputFile> outputFileList) {
		this.outputFileList = outputFileList;
	}
	
	
}
