package com.jda.jira.Examples.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.moca.command.cmdsrc.ListWebCodeDescription;

@Component
public class InboundShipmentLineControllerImpl {
	
	@Autowired
	ListWebCodeDescription listWebCodeDescription;
	
	public void DoSomething()
	{
		System.out.println("I am in the exec method");
		try {
			listWebCodeDescription.exec();
		}catch(Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
		
		
	}

}
