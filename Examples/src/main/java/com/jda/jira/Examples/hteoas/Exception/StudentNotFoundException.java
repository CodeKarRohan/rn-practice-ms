package com.jda.jira.Examples.hteoas.Exception;

public class StudentNotFoundException extends Exception{

	public StudentNotFoundException(String message)
	{
		super(message+" not found.");
	}
}
