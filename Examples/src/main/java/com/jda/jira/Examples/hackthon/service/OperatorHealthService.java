package com.jda.jira.Examples.hackthon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jda.jira.Examples.hackthon.beans.OperatorHealth;
import com.jda.jira.Examples.hackthon.entity.OperatorHealthTab;

@Service
public interface OperatorHealthService {
	
    OperatorHealth getOperatorHealth(String oprName) throws Exception;
    List<OperatorHealth> getOperatorHealth() throws Exception;
    OperatorHealthTab createOperator(OperatorHealthTab operator) throws Exception;   
 
}
