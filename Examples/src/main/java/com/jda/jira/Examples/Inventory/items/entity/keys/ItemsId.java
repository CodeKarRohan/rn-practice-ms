package com.jda.jira.Examples.Inventory.items.entity.keys;


import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prtmst database table.
 * 
 */
@Embeddable
public class ItemsId implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String prtnum;

	@Column(name="wh_id_tmpl")
	private String whIdTmpl;

	@Column(name="prt_client_id")
	private String prtClientId;

	public ItemsId() {
	}
	public String getPrtnum() {
		return this.prtnum;
	}
	public void setPrtnum(String prtnum) {
		this.prtnum = prtnum;
	}
	public String getWhIdTmpl() {
		return this.whIdTmpl;
	}
	public void setWhIdTmpl(String whIdTmpl) {
		this.whIdTmpl = whIdTmpl;
	}
	public String getPrtClientId() {
		return this.prtClientId;
	}
	public void setPrtClientId(String prtClientId) {
		this.prtClientId = prtClientId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemsId)) {
			return false;
		}
		ItemsId castOther = (ItemsId)other;
		return 
			this.prtnum.equals(castOther.prtnum)
			&& this.whIdTmpl.equals(castOther.whIdTmpl)
			&& this.prtClientId.equals(castOther.prtClientId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.prtnum.hashCode();
		hash = hash * prime + this.whIdTmpl.hashCode();
		hash = hash * prime + this.prtClientId.hashCode();
		
		return hash;
	}
}
