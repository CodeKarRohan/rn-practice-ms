package com.jda.jira.Examples.db.repo;

import java.io.Serializable;

public class CodeMasterId implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String colName;
	
	private String codVal;
	
	public CodeMasterId()
	{
		
	}

	public CodeMasterId(String colName, String codVal) {
		
		this.colName = colName;
		this.codVal = codVal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codVal == null) ? 0 : codVal.hashCode());
		result = prime * result + ((colName == null) ? 0 : colName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeMasterId other = (CodeMasterId) obj;
		if (codVal == null) {
			if (other.codVal != null)
				return false;
		} else if (!codVal.equals(other.codVal))
			return false;
		if (colName == null) {
			if (other.colName != null)
				return false;
		} else if (!colName.equals(other.colName))
			return false;
		return true;
	}
	
	
	

}
