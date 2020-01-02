package com.jda.jira.Examples.moca.command.cmdsrc.beans;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class ListWebCodeDescriptionEntity {
	
	private String colnam;
	private String coldsc;
	private String codval;
	private String short_dsc;
	private String lngdsc;
	private String srtseq;
	private String rqdflg;
	private String locale_id;
	public String getColnam() {
		return colnam;
	}
	public void setColnam(String colnam) {
		this.colnam = colnam;
	}
	public String getColdsc() {
		return coldsc;
	}
	public void setColdsc(String coldsc) {
		this.coldsc = coldsc;
	}
	public String getCodval() {
		return codval;
	}
	public void setCodval(String codval) {
		this.codval = codval;
	}
	public String getShort_dsc() {
		return short_dsc;
	}
	public void setShort_dsc(String short_dsc) {
		this.short_dsc = short_dsc;
	}
	public String getLngdsc() {
		return lngdsc;
	}
	public void setLngdsc(String lngdsc) {
		this.lngdsc = lngdsc;
	}
	public String getSrtseq() {
		return srtseq;
	}
	public void setSrtseq(String srtseq) {
		this.srtseq = srtseq;
	}
	public String getRqdflg() {
		return rqdflg;
	}
	public void setRqdflg(String rqdflg) {
		this.rqdflg = rqdflg;
	}
	public String getLocale_id() {
		return locale_id;
	}
	public void setLocale_id(String locale_id) {
		this.locale_id = locale_id;
	}
	
	public ListWebCodeDescriptionEntity()
	{
		
	}
	
	public ListWebCodeDescriptionEntity(String colnam, String coldsc, String codval, String short_dsc, String lngdsc,
			String srtseq, String rqdflg, String locale_id) {
		super();
		this.colnam = colnam;
		this.coldsc = coldsc;
		this.codval = codval;
		this.short_dsc = short_dsc;
		this.lngdsc = lngdsc;
		this.srtseq = srtseq;
		this.rqdflg = rqdflg;
		this.locale_id = locale_id;
	}
	
	
	
	
  

}
