package com.jda.jira.Examples.db.repo;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.db.entity.JiraIssue;

@Component
public interface JiraIssueRepo extends Repository<JiraIssue, Integer>{
	JiraIssue findByIssueNum(Integer issueNum);

}
