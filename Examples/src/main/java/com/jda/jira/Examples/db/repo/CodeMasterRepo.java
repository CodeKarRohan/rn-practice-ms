package com.jda.jira.Examples.db.repo;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.db.entity.CodeMaster;

@Component
public interface CodeMasterRepo extends Repository<CodeMaster, CodeMasterId>{

	List<CodeMaster> findByColName(String colName);
	
	
}
