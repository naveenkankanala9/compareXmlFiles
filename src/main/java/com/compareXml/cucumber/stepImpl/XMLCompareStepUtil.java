package com.compareXml.cucumber.stepImpl;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import com.compareXml.model.OutputFile;

@SuppressWarnings("rawtypes")
public class XMLCompareStepUtil {

	public static List parseXmlToList(String filePath, Class className) {
		return null;
	}
	
	public static void writeMarksToFile(String filePath, List<OutputFile> fileList){
		
	}
	
	public <T> List<T> getRecordsFromExcel(Class<T> rowRecord, String fileName, 
			ExcelUploadCriteriaBean excelCriteriaBean) throws ApplicationException {
		return getRecordsFromExcel(rowRecord, new File(fileName), excelCriteriaBean, false);
	}

	private <T> List<T> getRecordsFromExcel(Class<T> rowRecord, File aFile, 
			ExcelUploadCriteriaBean excelCriteriaBean, boolean deleteFile) 
					throws ApplicationException{
		FileInputStream is = null;
		try{
			is = new FileInputStream(aFile);
//			return getRecordsFromExcel(rowRecord, is, excelCriteriaBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
