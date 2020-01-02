package com.jda.jira.Examples.hackthon.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.hackthon.entity.OperatorHealthTab;

@Component
public interface OperatorHealthTabRepo extends Repository<OperatorHealthTab, Long>{
	
	List<OperatorHealthTab> findAll();
	
	OperatorHealthTab findByUserName(String userName);
	
	OperatorHealthTab save(OperatorHealthTab opr);
	
	
}
