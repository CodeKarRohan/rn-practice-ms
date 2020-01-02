package com.jda.jira.Examples.hackthon.utility;

import com.jda.jira.Examples.hackthon.entity.OperatorHealthTab;

public class Validator {
	
	public static String validateOperatorTab(OperatorHealthTab tab)
	{
		if(tab.getBodyTemprature() == null)
		{
			System.out.println("Body temprature required.");
			return "Body temprature required.";
			
		}
		
		if(tab.getBpHigh() == null)
		{
			System.out.println("High BP point is required.");
			return "High BP point is required.";
		}
		
		if(tab.getBpLow() ==  null)
		{
			System.out.println("Low BP point is required.");
			return "Low BP point is required.";
		}
		
		if(tab.getPulseRate() ==  null)
		{
			System.out.println("Pulse rate is required.");
			return "Pulse rate is required.";
		}
		
		if(tab.getOxygenSaturation() == null)
		{
			System.out.println( "Oxygen saturation level required.");
			return "Oxygen saturation level required.";
		}
		
		if(tab.getUserName() == null)
		{
			System.out.println("User name is required.");
			return "User name is required.";
		}
		
		return "";
	}

}
