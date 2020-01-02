package com.jda.jira.Examples.testUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.db.entity.CodeMaster;
import com.jda.jira.Examples.db.repo.CodeMasterRepo;
import com.jda.jira.Examples.db.repo.JiraIssueRepo;

@Component
public class TestForDb {
	
	
	@Autowired
	private CodeMasterRepo codeMasterRepo;
	
	public void testDbSetup()
	{
		
		System.out.println("here is code value");
		System.out.println(codeMasterRepo.findByColName("abccod"));
		
	}
	
	

}
