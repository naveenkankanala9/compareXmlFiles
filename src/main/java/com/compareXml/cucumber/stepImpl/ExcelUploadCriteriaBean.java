package com.compareXml.cucumber.stepImpl;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class ExcelUploadCriteriaBean {

	private Map<String, String> titleAttributes;
	
	public ExcelUploadCriteriaBean(){
		this.titleAttributes = new HashMap<>();
	}
	
	public Map<String, String> getTitleAttributes(){
		return titleAttributes;
	}
	
	public void setTitleAttributes(Map<String, String> titleAtttributes){
		this.titleAttributes = titleAtttributes;
	}
	
	public Map<String, String> getTitlesInLowerCase(){
		Map<String, String> titles = new HashMap<>();
		if(!isEmpty(titleAttributes)){
			for(String key : titleAttributes.keySet()){
				String val = titleAttributes.get(key);
				titles.put(key.toLowerCase(), val);
			}
		}
		return titles;
	}

	private boolean isEmpty(Object object) {
		if(object == null){
			return true;
		}
		if(object instanceof Collection){
			return ((Collection) object).isEmpty();
		}
		return false;
	}
}
