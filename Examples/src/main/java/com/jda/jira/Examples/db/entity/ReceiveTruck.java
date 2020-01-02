package com.jda.jira.Examples.db.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rcvtrk")
public class ReceiveTruck {
	
	@Id
	private String  trknum   ;   
	private String wh_id    ;   
	private String trkref   ;  
	private String trnspt   ; 
	private Integer numpal   ;  
	private Integer numcas   ;  
	private Integer grswgt   ;  
	private Integer frtcst   ; 
	private Date shpdte   ;  
	private Date expdte   ;  
	private Date clsdte   ;  
	private String devcod   ;  
	private Integer lblflg   ;  
	private Date arcdte   ;  
	private String arc_src ;    
	private String trlr_id  ;   
	private Date moddte ;    
	private String mod_usr_id ;   
	private String crncy_code ;   
	private Date lms_plan_dte  ;   
	private Integer lm_goal_seconds ;    
	private String rcvtrk_stat ;    
	private String rec_loc ;    
	private Integer sys_gen_flg  ;    
	private Date last_rcpt_conf_dte ;    
	private String tms_load_id   ; 
	private Integer tms_stop_seq  ;   
	private String tms_source_id  ;   
	private String autoasnrcv_stat   ;
	public String getTrknum() {
		return trknum;
	}
	public void setTrknum(String trknum) {
		this.trknum = trknum;
	}
	public String getWh_id() {
		return wh_id;
	}
	public void setWh_id(String wh_id) {
		this.wh_id = wh_id;
	}
	public String getTrkref() {
		return trkref;
	}
	public void setTrkref(String trkref) {
		this.trkref = trkref;
	}
	public String getTrnspt() {
		return trnspt;
	}
	public void setTrnspt(String trnspt) {
		this.trnspt = trnspt;
	}
	public Integer getNumpal() {
		return numpal;
	}
	public void setNumpal(Integer numpal) {
		this.numpal = numpal;
	}
	public Integer getNumcas() {
		return numcas;
	}
	public void setNumcas(Integer numcas) {
		this.numcas = numcas;
	}
	public Integer getGrswgt() {
		return grswgt;
	}
	public void setGrswgt(Integer grswgt) {
		this.grswgt = grswgt;
	}
	public Integer getFrtcst() {
		return frtcst;
	}
	public void setFrtcst(Integer frtcst) {
		this.frtcst = frtcst;
	}
	public Date getShpdte() {
		return shpdte;
	}
	public void setShpdte(Date shpdte) {
		this.shpdte = shpdte;
	}
	public Date getExpdte() {
		return expdte;
	}
	public void setExpdte(Date expdte) {
		this.expdte = expdte;
	}
	public Date getClsdte() {
		return clsdte;
	}
	public void setClsdte(Date clsdte) {
		this.clsdte = clsdte;
	}
	public String getDevcod() {
		return devcod;
	}
	public void setDevcod(String devcod) {
		this.devcod = devcod;
	}
	public Integer getLblflg() {
		return lblflg;
	}
	public void setLblflg(Integer lblflg) {
		this.lblflg = lblflg;
	}
	public Date getArcdte() {
		return arcdte;
	}
	public void setArcdte(Date arcdte) {
		this.arcdte = arcdte;
	}
	public String getArc_src() {
		return arc_src;
	}
	public void setArc_src(String arc_src) {
		this.arc_src = arc_src;
	}
	public String getTrlr_id() {
		return trlr_id;
	}
	public void setTrlr_id(String trlr_id) {
		this.trlr_id = trlr_id;
	}
	public Date getModdte() {
		return moddte;
	}
	public void setModdte(Date moddte) {
		this.moddte = moddte;
	}
	public String getMod_usr_id() {
		return mod_usr_id;
	}
	public void setMod_usr_id(String mod_usr_id) {
		this.mod_usr_id = mod_usr_id;
	}
	public String getCrncy_code() {
		return crncy_code;
	}
	public void setCrncy_code(String crncy_code) {
		this.crncy_code = crncy_code;
	}
	public Date getLms_plan_dte() {
		return lms_plan_dte;
	}
	public void setLms_plan_dte(Date lms_plan_dte) {
		this.lms_plan_dte = lms_plan_dte;
	}
	public Integer getLm_goal_seconds() {
		return lm_goal_seconds;
	}
	public void setLm_goal_seconds(Integer lm_goal_seconds) {
		this.lm_goal_seconds = lm_goal_seconds;
	}
	public String getRcvtrk_stat() {
		return rcvtrk_stat;
	}
	public void setRcvtrk_stat(String rcvtrk_stat) {
		this.rcvtrk_stat = rcvtrk_stat;
	}
	public String getRec_loc() {
		return rec_loc;
	}
	public void setRec_loc(String rec_loc) {
		this.rec_loc = rec_loc;
	}
	public Integer getSys_gen_flg() {
		return sys_gen_flg;
	}
	public void setSys_gen_flg(Integer sys_gen_flg) {
		this.sys_gen_flg = sys_gen_flg;
	}
	public Date getLast_rcpt_conf_dte() {
		return last_rcpt_conf_dte;
	}
	public void setLast_rcpt_conf_dte(Date last_rcpt_conf_dte) {
		this.last_rcpt_conf_dte = last_rcpt_conf_dte;
	}
	public String getTms_load_id() {
		return tms_load_id;
	}
	public void setTms_load_id(String tms_load_id) {
		this.tms_load_id = tms_load_id;
	}
	public Integer getTms_stop_seq() {
		return tms_stop_seq;
	}
	public void setTms_stop_seq(Integer tms_stop_seq) {
		this.tms_stop_seq = tms_stop_seq;
	}
	public String getTms_source_id() {
		return tms_source_id;
	}
	public void setTms_source_id(String tms_source_id) {
		this.tms_source_id = tms_source_id;
	}
	public String getAutoasnrcv_stat() {
		return autoasnrcv_stat;
	}
	public void setAutoasnrcv_stat(String autoasnrcv_stat) {
		this.autoasnrcv_stat = autoasnrcv_stat;
	} 

}
