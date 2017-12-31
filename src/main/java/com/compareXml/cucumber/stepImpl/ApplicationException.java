package com.compareXml.cucumber.stepImpl;

public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6131790844907664362L;

	public ApplicationException(String message){
		super(message);
	}
	
	public ApplicationException(Throwable throwable){
		super(throwable);
	}
	
	public ApplicationException(String message, Throwable throwable){
		super(message, throwable);
	}
}
