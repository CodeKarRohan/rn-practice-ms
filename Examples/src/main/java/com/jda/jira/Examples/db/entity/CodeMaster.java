package com.jda.jira.Examples.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.jda.jira.Examples.db.repo.CodeMasterId;

@Entity
@Table(name="codmst")
@IdClass(CodeMasterId.class)
public class CodeMaster implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="colnam")
	private String colName;
	
	@Id
	@Column(name="codval")
	private String codVal;
	
	@Column(name="srtseq")
	private Integer sortSeq;
	
	@Column(name="rqdflg")
	private Integer requiredFlag;
	
	@Column(name="grp_nam")
	private String groupName;
	
	@Column(name="img_id")
	private String imageId;

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public String getCodVal() {
		return codVal;
	}

	public void setCodVal(String codVal) {
		this.codVal = codVal;
	}

	public Integer getSortSeq() {
		return sortSeq;
	}

	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
	}

	public Integer getRequiredFlag() {
		return requiredFlag;
	}

	public void setRequiredFlag(Integer requiredFlag) {
		this.requiredFlag = requiredFlag;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	
	@Override
	public String toString() {
		return "CodeMaster [colName=" + colName + ", codVal=" + codVal + ", sortSeq=" + sortSeq + ", requiredFlag="
				+ requiredFlag + ", groupName=" + groupName + ", imageId=" + imageId + "]";
	}
  
	
}
