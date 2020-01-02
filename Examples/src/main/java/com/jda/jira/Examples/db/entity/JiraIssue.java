package com.jda.jira.Examples.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="jiraissue")
public class JiraIssue implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="pkey")
	private String pkey;
	
	 @Id
	 @Column(name="ID")
	 private Integer id;

	 @Column(name="PROJECT")
	 private Integer project;
	 
	 @Column(name="REPORTER")
	 private String reporter;
	 
	 @Column(name="ASSIGNEE")
	 private String assignee;
	 
	 @Column(name="issuetype")
	 private String issuetype;
	 
	 @Column(name="SUMMARY")
	 private String summary;
	 
	 @Column(name="DESCRIPTION")
	 private String description;
	 
	 @Column(name="ENVIRONMENT")
	 private String environment;
	 
	 @Column(name="PRIORITY")
	 private String priority;
	 
	 @Column(name="RESOLUTION")
	 private String resolution;
	 
	 @Column(name="issuestatus")
	 private String issueStatus;
	 
	 @Column(name="CREATED")
	 @Temporal(TemporalType.TIMESTAMP)
	 private java.util.Date created;
	 
	 @Column(name="UPDATED")
	 @Temporal(TemporalType.TIMESTAMP)
	 private java.util.Date updated;

	 @Column(name="DUEDATE")
	 @Temporal(TemporalType.TIMESTAMP)
	 private java.util.Date dueDate;

	 @Column(name="RESOLUTIONDATE")
	 @Temporal(TemporalType.TIMESTAMP)
	 private java.util.Date resolutionDate;
    
	 @Column(name="VOTES")
	 private Integer votes;
	 
	 @Column(name="WATCHES")
	 private Integer watches;
	 
	 @Column(name="TIMEORIGINALESTIMATE")
	 private Integer timeOrgEstimate;
	 
	 @Column(name="TIMEESTIMATE")
	 private Integer timeEstimated;
	 
	 @Column(name="TIMESPENT")
	 private Integer timeSpent;
	 
	 @Column(name="WORKFLOW_ID")
	 private Integer workFlowID;
	 
	 @Column(name="SECURITY")
	 private Integer security;
	 
	 @Column(name="FIXFOR")
	 private Integer fixFor;
	 
	 @Column(name="COMPONENT")
	 private Integer component;
	 
	 @Column(name="issuenum")
	 private Integer issueNum;
	 
	 @Column(name="CREATOR")
	 private String creator;

	public String getPkey() {
		return pkey;
	}

	public void setPkey(String pkey) {
		this.pkey = pkey;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProject() {
		return project;
	}

	public void setProject(Integer project) {
		this.project = project;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getIssuetype() {
		return issuetype;
	}

	public void setIssuetype(String issuetype) {
		this.issuetype = issuetype;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public java.util.Date getCreated() {
		return created;
	}

	public void setCreated(java.util.Date created) {
		this.created = created;
	}

	public java.util.Date getUpdated() {
		return updated;
	}

	public void setUpdated(java.util.Date updated) {
		this.updated = updated;
	}

	public java.util.Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(java.util.Date dueDate) {
		this.dueDate = dueDate;
	}

	public java.util.Date getResolutionDate() {
		return resolutionDate;
	}

	public void setResolutionDate(java.util.Date resolutionDate) {
		this.resolutionDate = resolutionDate;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public Integer getWatches() {
		return watches;
	}

	public void setWatches(Integer watches) {
		this.watches = watches;
	}

	public Integer getTimeOrgEstimate() {
		return timeOrgEstimate;
	}

	public void setTimeOrgEstimate(Integer timeOrgEstimate) {
		this.timeOrgEstimate = timeOrgEstimate;
	}

	public Integer getTimeEstimated() {
		return timeEstimated;
	}

	public void setTimeEstimated(Integer timeEstimated) {
		this.timeEstimated = timeEstimated;
	}

	public Integer getTimeSpent() {
		return timeSpent;
	}

	public void setTimeSpent(Integer timeSpent) {
		this.timeSpent = timeSpent;
	}

	public Integer getWorkFlowID() {
		return workFlowID;
	}

	public void setWorkFlowID(Integer workFlowID) {
		this.workFlowID = workFlowID;
	}

	public Integer getSecurity() {
		return security;
	}

	public void setSecurity(Integer security) {
		this.security = security;
	}

	public Integer getFixFor() {
		return fixFor;
	}

	public void setFixFor(Integer fixFor) {
		this.fixFor = fixFor;
	}

	public Integer getComponent() {
		return component;
	}

	public void setComponent(Integer component) {
		this.component = component;
	}

	public Integer getIssueNum() {
		return issueNum;
	}

	public void setIssueNum(Integer issueNum) {
		this.issueNum = issueNum;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
  
    
    

}
