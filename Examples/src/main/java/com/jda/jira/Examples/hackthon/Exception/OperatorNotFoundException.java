package com.jda.jira.Examples.hackthon.Exception;

public class OperatorNotFoundException extends Exception{
	
	public OperatorNotFoundException(String message)
	{
		super(message+" not found.");
	}

}
