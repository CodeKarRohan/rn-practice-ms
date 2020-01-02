package com.jda.jira.Examples.db.keys;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ReceiveLinePrimKey implements Serializable {
	
	private String trknum;
	private String client_id;
	private String supnum;
	private String invnum;
	private String invlin;
	private String invsln;
	private Integer seqnum;
	private String wh_id;
	
	public ReceiveLinePrimKey()
	{
		
	}

	public ReceiveLinePrimKey(String trknum, String client_id, String supnum, String invnum, String invlin,
			String invslin, Integer seqnum, String wh_id) {
		super();
		this.trknum = trknum;
		this.client_id = client_id;
		this.supnum = supnum;
		this.invnum = invnum;
		this.invlin = invlin;
		this.invsln = invslin;
		this.seqnum = seqnum;
		this.wh_id = wh_id;
	}
	

	public String getTrknum() {
		return trknum;
	}

	public void setTrknum(String trknum) {
		this.trknum = trknum;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getSupnum() {
		return supnum;
	}

	public void setSupnum(String supnum) {
		this.supnum = supnum;
	}

	public String getInvnum() {
		return invnum;
	}

	public void setInvnum(String invnum) {
		this.invnum = invnum;
	}

	public String getInvlin() {
		return invlin;
	}

	public void setInvlin(String invlin) {
		this.invlin = invlin;
	}

	public String getInvsln() {
		return invsln;
	}

	public void setInvsln(String invsln) {
		this.invsln = invsln;
	}

	public Integer getSeqnum() {
		return seqnum;
	}

	public void setSeqnum(Integer seqnum) {
		this.seqnum = seqnum;
	}

	public String getWh_id() {
		return wh_id;
	}

	public void setWh_id(String wh_id) {
		this.wh_id = wh_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client_id == null) ? 0 : client_id.hashCode());
		result = prime * result + ((invlin == null) ? 0 : invlin.hashCode());
		result = prime * result + ((invnum == null) ? 0 : invnum.hashCode());
		result = prime * result + ((invsln == null) ? 0 : invsln.hashCode());
		result = prime * result + ((seqnum == null) ? 0 : seqnum.hashCode());
		result = prime * result + ((supnum == null) ? 0 : supnum.hashCode());
		result = prime * result + ((trknum == null) ? 0 : trknum.hashCode());
		result = prime * result + ((wh_id == null) ? 0 : wh_id.hashCode());
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
		ReceiveLinePrimKey other = (ReceiveLinePrimKey) obj;
		if (client_id == null) {
			if (other.client_id != null)
				return false;
		} else if (!client_id.equals(other.client_id))
			return false;
		if (invlin == null) {
			if (other.invlin != null)
				return false;
		} else if (!invlin.equals(other.invlin))
			return false;
		if (invnum == null) {
			if (other.invnum != null)
				return false;
		} else if (!invnum.equals(other.invnum))
			return false;
		if (invsln == null) {
			if (other.invsln != null)
				return false;
		} else if (!invsln.equals(other.invsln))
			return false;
		if (seqnum == null) {
			if (other.seqnum != null)
				return false;
		} else if (!seqnum.equals(other.seqnum))
			return false;
		if (supnum == null) {
			if (other.supnum != null)
				return false;
		} else if (!supnum.equals(other.supnum))
			return false;
		if (trknum == null) {
			if (other.trknum != null)
				return false;
		} else if (!trknum.equals(other.trknum))
			return false;
		if (wh_id == null) {
			if (other.wh_id != null)
				return false;
		} else if (!wh_id.equals(other.wh_id))
			return false;
		return true;
	}
	
	
	

}
