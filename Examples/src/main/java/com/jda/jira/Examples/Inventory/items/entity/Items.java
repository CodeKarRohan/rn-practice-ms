package com.jda.jira.Examples.Inventory.items.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.jda.jira.Examples.Inventory.items.entity.keys.ItemsId;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the prtmst database table.
 * 
 */
@Entity
@Table(name="prtmst")

public class Items implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemsId id;

	private String abccod;

	@Column(name="abs_ordinv_code")
	private String absOrdinvCode;

	@Column(name="abs_ordinv_win")
	private Integer absOrdinvWin;

	@Column(name="age_pflnam")
	private String agePflnam;

	@Column(name="allow_xdktyp_rpl_flg")
	private Integer allowXdktypRplFlg;

	@Column(name="alt_prt_typ")
	private String altPrtTyp;

	@Column(name="attr_dte1")
	private String attrDte1;

	@Column(name="attr_dte2")
	private String attrDte2;

	@Column(name="attr_flt1")
	private String attrFlt1;

	@Column(name="attr_flt2")
	private String attrFlt2;

	@Column(name="attr_flt3")
	private String attrFlt3;

	@Column(name="attr_int1")
	private String attrInt1;

	@Column(name="attr_int2")
	private String attrInt2;

	@Column(name="attr_int3")
	private String attrInt3;

	@Column(name="attr_int4")
	private String attrInt4;

	@Column(name="attr_int5")
	private String attrInt5;

	@Column(name="attr_str1")
	private String attrStr1;

	@Column(name="attr_str10")
	private String attrStr10;

	@Column(name="attr_str11")
	private String attrStr11;

	@Column(name="attr_str12")
	private String attrStr12;

	@Column(name="attr_str13")
	private String attrStr13;

	@Column(name="attr_str14")
	private String attrStr14;

	@Column(name="attr_str15")
	private String attrStr15;

	@Column(name="attr_str16")
	private String attrStr16;

	@Column(name="attr_str17")
	private String attrStr17;

	@Column(name="attr_str18")
	private String attrStr18;

	@Column(name="attr_str2")
	private String attrStr2;

	@Column(name="attr_str3")
	private String attrStr3;

	@Column(name="attr_str4")
	private String attrStr4;

	@Column(name="attr_str5")
	private String attrStr5;

	@Column(name="attr_str6")
	private String attrStr6;

	@Column(name="attr_str7")
	private String attrStr7;

	@Column(name="attr_str8")
	private String attrStr8;

	@Column(name="attr_str9")
	private String attrStr9;

	@Column(name="avg_catch")
	private Integer avgCatch;

	@Column(name="box_pck_flg")
	private Integer boxPckFlg;

	@Column(name="bto_obso_flg")
	private Integer btoObsoFlg;

	@Column(name="bto_subst_prtnum")
	private String btoSubstPrtnum;

	@Column(name="catch_cod")
	private String catchCod;

	@Column(name="catch_untcst")
	private BigDecimal catchUntcst;

	@Column(name="catch_unttyp")
	private String catchUnttyp;

	@Column(name="catch_untwgt")
	private BigDecimal catchUntwgt;

	@Column(name="cnt_thr_cst")
	private BigDecimal cntThrCst;

	@Column(name="cnt_thr_unit")
	private Integer cntThrUnit;

	@Column(name="cntbck_ena_flg")
	private Integer cntbckEnaFlg;

	private BigDecimal cnzamt;

	private Integer cnzflg;

	@Column(name="co_prefix_len")
	private Integer coPrefixLen;

	private String comcod;

	@Column(name="crncy_code")
	private String crncyCode;

	@Column(name="cstms_cmmdty_cod")
	private String cstmsCmmdtyCod;

	@Column(name="cstms_crncy")
	private String cstmsCrncy;

	@Column(name="cstms_cst")
	private Integer cstmsCst;

	@Column(name="cstms_itm_typ")
	private String cstmsItmTyp;

	@Column(name="cstms_vat_cod")
	private String cstmsVatCod;

	private Integer dcfpos;

	@Column(name="dept_cod")
	private String deptCod;

	@Column(name="dflt_orgcod")
	private String dfltOrgcod;

	@Column(name="dsp_prtnum")
	private String dspPrtnum;

	private String dspuom;

	private Integer dtcflg;

	@Column(name="dte_code")
	private String dteCode;

	@Column(name="dte_win_typ")
	private String dteWinTyp;

	private String dtlcfg;

	@Column(name="dty_stmp_trk_flg")
	private Integer dtyStmpTrkFlg;

	private Integer fifwin;

	@Column(name="hazmat_flg")
	private Integer hazmatFlg;

	private String htsnum;

	@Column(name="ignore_con_flg")
	private Integer ignoreConFlg;

	@Column(name="ins_dt")
	private Timestamp insDt;

	@Column(name="ins_user_id")
	private String insUserId;

	private Integer insflg;

	@Column(name="last_upd_dt")
	private Timestamp lastUpdDt;

	@Column(name="last_upd_user_id")
	private String lastUpdUserId;

	@Column(name="lod_tag_encode")
	private String lodTagEncode;

	private String lodlvl;

	@Column(name="lot_fmt_id")
	private String lotFmtId;

	private Integer lotflg;

	private String ltlcls;

	@Column(name="max_catch_qty")
	private BigDecimal maxCatchQty;

	@Column(name="min_catch_qty")
	private BigDecimal minCatchQty;

	@Column(name="mod_usr_id")
	private String modUsrId;

	private Timestamp moddte;

	private String nstcls;

	private String ordinv;

	private Integer orgflg;

	private Integer pakflg;

	@Column(name="parcel_flg")
	private Integer parcelFlg;

	@Column(name="pck_steal_flg")
	private Integer pckStealFlg;

	@Column(name="prc_for_rps_flg")
	private Integer prcForRpsFlg;

	private Integer prdflg;

	@Column(name="prt_disp")
	private String prtDisp;

	@Column(name="prt_disptn")
	private String prtDisptn;

	private Integer prtadjflg;

	private String prtcolor;

	private String prtfam;

	private String prtfit;

	private String prthrcy;

	private String prtsize;

	private String prtstyle;

	private Integer rcvflg;

	private String rcvsts;

	@Column(name="rel_val")
	private BigDecimal relVal;

	@Column(name="rel_val_unt_typ")
	private String relValUntTyp;

	private Integer reopnt;

	private Integer reoqty;

	private Integer revflg;

	private String rptuom;

	private String rsvuom;

	private Integer scfpos;

	private String schedbnum;

	@Column(name="ser_lvl")
	private String serLvl;

	@Column(name="ser_typ")
	private String serTyp;

	@Column(name="shelf_life")
	private Integer shelfLife;

	@Column(name="shelf_timecode")
	private String shelfTimecode;

	@Column(name="shp_res_lot")
	private Integer shpResLot;

	private String stccod;

	private String stkuom;

	@Column(name="sub_tag_encode")
	private String subTagEncode;

	private String subcfg;

	@Column(name="sup_lot_flg")
	private Integer supLotFlg;

	@Column(name="thresh_pck_var")
	private BigDecimal threshPckVar;

	private String timcod;

	@Column(name="time_to_warn_for_exp")
	private Integer timeToWarnForExp;

	private String typcod;

	@Column(name="u_version")
	private Integer uVersion;

	@Column(name="unt_ins_val")
	private BigDecimal untInsVal;

	private BigDecimal untcst;

	private String velzon;

	@Column(name="velzon_recalc_flg")
	private Integer velzonRecalcFlg;

	private String wgtcod;

	@Column(name="wip_prtflg")
	private Integer wipPrtflg;

	public Items() {
	}

	public ItemsId getId() {
		return this.id;
	}

	public void setId(ItemsId id) {
		this.id = id;
	}

	public String getAbccod() {
		return this.abccod;
	}

	public void setAbccod(String abccod) {
		this.abccod = abccod;
	}

	public String getAbsOrdinvCode() {
		return this.absOrdinvCode;
	}

	public void setAbsOrdinvCode(String absOrdinvCode) {
		this.absOrdinvCode = absOrdinvCode;
	}

	public Integer getAbsOrdinvWin() {
		return this.absOrdinvWin;
	}

	public void setAbsOrdinvWin(Integer absOrdinvWin) {
		this.absOrdinvWin = absOrdinvWin;
	}

	public String getAgePflnam() {
		return this.agePflnam;
	}

	public void setAgePflnam(String agePflnam) {
		this.agePflnam = agePflnam;
	}

	public Integer getAllowXdktypRplFlg() {
		return this.allowXdktypRplFlg;
	}

	public void setAllowXdktypRplFlg(Integer allowXdktypRplFlg) {
		this.allowXdktypRplFlg = allowXdktypRplFlg;
	}

	public String getAltPrtTyp() {
		return this.altPrtTyp;
	}

	public void setAltPrtTyp(String altPrtTyp) {
		this.altPrtTyp = altPrtTyp;
	}

	public String getAttrDte1() {
		return this.attrDte1;
	}

	public void setAttrDte1(String attrDte1) {
		this.attrDte1 = attrDte1;
	}

	public String getAttrDte2() {
		return this.attrDte2;
	}

	public void setAttrDte2(String attrDte2) {
		this.attrDte2 = attrDte2;
	}

	public String getAttrFlt1() {
		return this.attrFlt1;
	}

	public void setAttrFlt1(String attrFlt1) {
		this.attrFlt1 = attrFlt1;
	}

	public String getAttrFlt2() {
		return this.attrFlt2;
	}

	public void setAttrFlt2(String attrFlt2) {
		this.attrFlt2 = attrFlt2;
	}

	public String getAttrFlt3() {
		return this.attrFlt3;
	}

	public void setAttrFlt3(String attrFlt3) {
		this.attrFlt3 = attrFlt3;
	}

	public String getAttrInt1() {
		return this.attrInt1;
	}

	public void setAttrInt1(String attrInt1) {
		this.attrInt1 = attrInt1;
	}

	public String getAttrInt2() {
		return this.attrInt2;
	}

	public void setAttrInt2(String attrInt2) {
		this.attrInt2 = attrInt2;
	}

	public String getAttrInt3() {
		return this.attrInt3;
	}

	public void setAttrInt3(String attrInt3) {
		this.attrInt3 = attrInt3;
	}

	public String getAttrInt4() {
		return this.attrInt4;
	}

	public void setAttrInt4(String attrInt4) {
		this.attrInt4 = attrInt4;
	}

	public String getAttrInt5() {
		return this.attrInt5;
	}

	public void setAttrInt5(String attrInt5) {
		this.attrInt5 = attrInt5;
	}

	public String getAttrStr1() {
		return this.attrStr1;
	}

	public void setAttrStr1(String attrStr1) {
		this.attrStr1 = attrStr1;
	}

	public String getAttrStr10() {
		return this.attrStr10;
	}

	public void setAttrStr10(String attrStr10) {
		this.attrStr10 = attrStr10;
	}

	public String getAttrStr11() {
		return this.attrStr11;
	}

	public void setAttrStr11(String attrStr11) {
		this.attrStr11 = attrStr11;
	}

	public String getAttrStr12() {
		return this.attrStr12;
	}

	public void setAttrStr12(String attrStr12) {
		this.attrStr12 = attrStr12;
	}

	public String getAttrStr13() {
		return this.attrStr13;
	}

	public void setAttrStr13(String attrStr13) {
		this.attrStr13 = attrStr13;
	}

	public String getAttrStr14() {
		return this.attrStr14;
	}

	public void setAttrStr14(String attrStr14) {
		this.attrStr14 = attrStr14;
	}

	public String getAttrStr15() {
		return this.attrStr15;
	}

	public void setAttrStr15(String attrStr15) {
		this.attrStr15 = attrStr15;
	}

	public String getAttrStr16() {
		return this.attrStr16;
	}

	public void setAttrStr16(String attrStr16) {
		this.attrStr16 = attrStr16;
	}

	public String getAttrStr17() {
		return this.attrStr17;
	}

	public void setAttrStr17(String attrStr17) {
		this.attrStr17 = attrStr17;
	}

	public String getAttrStr18() {
		return this.attrStr18;
	}

	public void setAttrStr18(String attrStr18) {
		this.attrStr18 = attrStr18;
	}

	public String getAttrStr2() {
		return this.attrStr2;
	}

	public void setAttrStr2(String attrStr2) {
		this.attrStr2 = attrStr2;
	}

	public String getAttrStr3() {
		return this.attrStr3;
	}

	public void setAttrStr3(String attrStr3) {
		this.attrStr3 = attrStr3;
	}

	public String getAttrStr4() {
		return this.attrStr4;
	}

	public void setAttrStr4(String attrStr4) {
		this.attrStr4 = attrStr4;
	}

	public String getAttrStr5() {
		return this.attrStr5;
	}

	public void setAttrStr5(String attrStr5) {
		this.attrStr5 = attrStr5;
	}

	public String getAttrStr6() {
		return this.attrStr6;
	}

	public void setAttrStr6(String attrStr6) {
		this.attrStr6 = attrStr6;
	}

	public String getAttrStr7() {
		return this.attrStr7;
	}

	public void setAttrStr7(String attrStr7) {
		this.attrStr7 = attrStr7;
	}

	public String getAttrStr8() {
		return this.attrStr8;
	}

	public void setAttrStr8(String attrStr8) {
		this.attrStr8 = attrStr8;
	}

	public String getAttrStr9() {
		return this.attrStr9;
	}

	public void setAttrStr9(String attrStr9) {
		this.attrStr9 = attrStr9;
	}

	public Integer getAvgCatch() {
		return this.avgCatch;
	}

	public void setAvgCatch(Integer avgCatch) {
		this.avgCatch = avgCatch;
	}

	public Integer getBoxPckFlg() {
		return this.boxPckFlg;
	}

	public void setBoxPckFlg(Integer boxPckFlg) {
		this.boxPckFlg = boxPckFlg;
	}

	public Integer getBtoObsoFlg() {
		return this.btoObsoFlg;
	}

	public void setBtoObsoFlg(Integer btoObsoFlg) {
		this.btoObsoFlg = btoObsoFlg;
	}

	public String getBtoSubstPrtnum() {
		return this.btoSubstPrtnum;
	}

	public void setBtoSubstPrtnum(String btoSubstPrtnum) {
		this.btoSubstPrtnum = btoSubstPrtnum;
	}

	public String getCatchCod() {
		return this.catchCod;
	}

	public void setCatchCod(String catchCod) {
		this.catchCod = catchCod;
	}

	public BigDecimal getCatchUntcst() {
		return this.catchUntcst;
	}

	public void setCatchUntcst(BigDecimal catchUntcst) {
		this.catchUntcst = catchUntcst;
	}

	public String getCatchUnttyp() {
		return this.catchUnttyp;
	}

	public void setCatchUnttyp(String catchUnttyp) {
		this.catchUnttyp = catchUnttyp;
	}

	public BigDecimal getCatchUntwgt() {
		return this.catchUntwgt;
	}

	public void setCatchUntwgt(BigDecimal catchUntwgt) {
		this.catchUntwgt = catchUntwgt;
	}

	public BigDecimal getCntThrCst() {
		return this.cntThrCst;
	}

	public void setCntThrCst(BigDecimal cntThrCst) {
		this.cntThrCst = cntThrCst;
	}

	public Integer getCntThrUnit() {
		return this.cntThrUnit;
	}

	public void setCntThrUnit(Integer cntThrUnit) {
		this.cntThrUnit = cntThrUnit;
	}

	public Integer getCntbckEnaFlg() {
		return this.cntbckEnaFlg;
	}

	public void setCntbckEnaFlg(Integer cntbckEnaFlg) {
		this.cntbckEnaFlg = cntbckEnaFlg;
	}

	public BigDecimal getCnzamt() {
		return this.cnzamt;
	}

	public void setCnzamt(BigDecimal cnzamt) {
		this.cnzamt = cnzamt;
	}

	public Integer getCnzflg() {
		return this.cnzflg;
	}

	public void setCnzflg(Integer cnzflg) {
		this.cnzflg = cnzflg;
	}

	public Integer getCoPrefixLen() {
		return this.coPrefixLen;
	}

	public void setCoPrefixLen(Integer coPrefixLen) {
		this.coPrefixLen = coPrefixLen;
	}

	public String getComcod() {
		return this.comcod;
	}

	public void setComcod(String comcod) {
		this.comcod = comcod;
	}

	public String getCrncyCode() {
		return this.crncyCode;
	}

	public void setCrncyCode(String crncyCode) {
		this.crncyCode = crncyCode;
	}

	public String getCstmsCmmdtyCod() {
		return this.cstmsCmmdtyCod;
	}

	public void setCstmsCmmdtyCod(String cstmsCmmdtyCod) {
		this.cstmsCmmdtyCod = cstmsCmmdtyCod;
	}

	public String getCstmsCrncy() {
		return this.cstmsCrncy;
	}

	public void setCstmsCrncy(String cstmsCrncy) {
		this.cstmsCrncy = cstmsCrncy;
	}

	public Integer getCstmsCst() {
		return this.cstmsCst;
	}

	public void setCstmsCst(Integer cstmsCst) {
		this.cstmsCst = cstmsCst;
	}

	public String getCstmsItmTyp() {
		return this.cstmsItmTyp;
	}

	public void setCstmsItmTyp(String cstmsItmTyp) {
		this.cstmsItmTyp = cstmsItmTyp;
	}

	public String getCstmsVatCod() {
		return this.cstmsVatCod;
	}

	public void setCstmsVatCod(String cstmsVatCod) {
		this.cstmsVatCod = cstmsVatCod;
	}

	public Integer getDcfpos() {
		return this.dcfpos;
	}

	public void setDcfpos(Integer dcfpos) {
		this.dcfpos = dcfpos;
	}

	public String getDeptCod() {
		return this.deptCod;
	}

	public void setDeptCod(String deptCod) {
		this.deptCod = deptCod;
	}

	public String getDfltOrgcod() {
		return this.dfltOrgcod;
	}

	public void setDfltOrgcod(String dfltOrgcod) {
		this.dfltOrgcod = dfltOrgcod;
	}

	public String getDspPrtnum() {
		return this.dspPrtnum;
	}

	public void setDspPrtnum(String dspPrtnum) {
		this.dspPrtnum = dspPrtnum;
	}

	public String getDspuom() {
		return this.dspuom;
	}

	public void setDspuom(String dspuom) {
		this.dspuom = dspuom;
	}

	public Integer getDtcflg() {
		return this.dtcflg;
	}

	public void setDtcflg(Integer dtcflg) {
		this.dtcflg = dtcflg;
	}

	public String getDteCode() {
		return this.dteCode;
	}

	public void setDteCode(String dteCode) {
		this.dteCode = dteCode;
	}

	public String getDteWinTyp() {
		return this.dteWinTyp;
	}

	public void setDteWinTyp(String dteWinTyp) {
		this.dteWinTyp = dteWinTyp;
	}

	public String getDtlcfg() {
		return this.dtlcfg;
	}

	public void setDtlcfg(String dtlcfg) {
		this.dtlcfg = dtlcfg;
	}

	public Integer getDtyStmpTrkFlg() {
		return this.dtyStmpTrkFlg;
	}

	public void setDtyStmpTrkFlg(Integer dtyStmpTrkFlg) {
		this.dtyStmpTrkFlg = dtyStmpTrkFlg;
	}

	public Integer getFifwin() {
		return this.fifwin;
	}

	public void setFifwin(Integer fifwin) {
		this.fifwin = fifwin;
	}

	public Integer getHazmatFlg() {
		return this.hazmatFlg;
	}

	public void setHazmatFlg(Integer hazmatFlg) {
		this.hazmatFlg = hazmatFlg;
	}

	public String getHtsnum() {
		return this.htsnum;
	}

	public void setHtsnum(String htsnum) {
		this.htsnum = htsnum;
	}

	public Integer getIgnoreConFlg() {
		return this.ignoreConFlg;
	}

	public void setIgnoreConFlg(Integer ignoreConFlg) {
		this.ignoreConFlg = ignoreConFlg;
	}

	public Timestamp getInsDt() {
		return this.insDt;
	}

	public void setInsDt(Timestamp insDt) {
		this.insDt = insDt;
	}

	public String getInsUserId() {
		return this.insUserId;
	}

	public void setInsUserId(String insUserId) {
		this.insUserId = insUserId;
	}

	public Integer getInsflg() {
		return this.insflg;
	}

	public void setInsflg(Integer insflg) {
		this.insflg = insflg;
	}

	public Timestamp getLastUpdDt() {
		return this.lastUpdDt;
	}

	public void setLastUpdDt(Timestamp lastUpdDt) {
		this.lastUpdDt = lastUpdDt;
	}

	public String getLastUpdUserId() {
		return this.lastUpdUserId;
	}

	public void setLastUpdUserId(String lastUpdUserId) {
		this.lastUpdUserId = lastUpdUserId;
	}

	public String getLodTagEncode() {
		return this.lodTagEncode;
	}

	public void setLodTagEncode(String lodTagEncode) {
		this.lodTagEncode = lodTagEncode;
	}

	public String getLodlvl() {
		return this.lodlvl;
	}

	public void setLodlvl(String lodlvl) {
		this.lodlvl = lodlvl;
	}

	public String getLotFmtId() {
		return this.lotFmtId;
	}

	public void setLotFmtId(String lotFmtId) {
		this.lotFmtId = lotFmtId;
	}

	public Integer getLotflg() {
		return this.lotflg;
	}

	public void setLotflg(Integer lotflg) {
		this.lotflg = lotflg;
	}

	public String getLtlcls() {
		return this.ltlcls;
	}

	public void setLtlcls(String ltlcls) {
		this.ltlcls = ltlcls;
	}

	public BigDecimal getMaxCatchQty() {
		return this.maxCatchQty;
	}

	public void setMaxCatchQty(BigDecimal maxCatchQty) {
		this.maxCatchQty = maxCatchQty;
	}

	public BigDecimal getMinCatchQty() {
		return this.minCatchQty;
	}

	public void setMinCatchQty(BigDecimal minCatchQty) {
		this.minCatchQty = minCatchQty;
	}

	public String getModUsrId() {
		return this.modUsrId;
	}

	public void setModUsrId(String modUsrId) {
		this.modUsrId = modUsrId;
	}

	public Timestamp getModdte() {
		return this.moddte;
	}

	public void setModdte(Timestamp moddte) {
		this.moddte = moddte;
	}

	public String getNstcls() {
		return this.nstcls;
	}

	public void setNstcls(String nstcls) {
		this.nstcls = nstcls;
	}

	public String getOrdinv() {
		return this.ordinv;
	}

	public void setOrdinv(String ordinv) {
		this.ordinv = ordinv;
	}

	public Integer getOrgflg() {
		return this.orgflg;
	}

	public void setOrgflg(Integer orgflg) {
		this.orgflg = orgflg;
	}

	public Integer getPakflg() {
		return this.pakflg;
	}

	public void setPakflg(Integer pakflg) {
		this.pakflg = pakflg;
	}

	public Integer getParcelFlg() {
		return this.parcelFlg;
	}

	public void setParcelFlg(Integer parcelFlg) {
		this.parcelFlg = parcelFlg;
	}

	public Integer getPckStealFlg() {
		return this.pckStealFlg;
	}

	public void setPckStealFlg(Integer pckStealFlg) {
		this.pckStealFlg = pckStealFlg;
	}

	public Integer getPrcForRpsFlg() {
		return this.prcForRpsFlg;
	}

	public void setPrcForRpsFlg(Integer prcForRpsFlg) {
		this.prcForRpsFlg = prcForRpsFlg;
	}

	public Integer getPrdflg() {
		return this.prdflg;
	}

	public void setPrdflg(Integer prdflg) {
		this.prdflg = prdflg;
	}

	public String getPrtDisp() {
		return this.prtDisp;
	}

	public void setPrtDisp(String prtDisp) {
		this.prtDisp = prtDisp;
	}

	public String getPrtDisptn() {
		return this.prtDisptn;
	}

	public void setPrtDisptn(String prtDisptn) {
		this.prtDisptn = prtDisptn;
	}

	public Integer getPrtadjflg() {
		return this.prtadjflg;
	}

	public void setPrtadjflg(Integer prtadjflg) {
		this.prtadjflg = prtadjflg;
	}

	public String getPrtcolor() {
		return this.prtcolor;
	}

	public void setPrtcolor(String prtcolor) {
		this.prtcolor = prtcolor;
	}

	public String getPrtfam() {
		return this.prtfam;
	}

	public void setPrtfam(String prtfam) {
		this.prtfam = prtfam;
	}

	public String getPrtfit() {
		return this.prtfit;
	}

	public void setPrtfit(String prtfit) {
		this.prtfit = prtfit;
	}

	public String getPrthrcy() {
		return this.prthrcy;
	}

	public void setPrthrcy(String prthrcy) {
		this.prthrcy = prthrcy;
	}

	public String getPrtsize() {
		return this.prtsize;
	}

	public void setPrtsize(String prtsize) {
		this.prtsize = prtsize;
	}

	public String getPrtstyle() {
		return this.prtstyle;
	}

	public void setPrtstyle(String prtstyle) {
		this.prtstyle = prtstyle;
	}

	public Integer getRcvflg() {
		return this.rcvflg;
	}

	public void setRcvflg(Integer rcvflg) {
		this.rcvflg = rcvflg;
	}

	public String getRcvsts() {
		return this.rcvsts;
	}

	public void setRcvsts(String rcvsts) {
		this.rcvsts = rcvsts;
	}

	public BigDecimal getRelVal() {
		return this.relVal;
	}

	public void setRelVal(BigDecimal relVal) {
		this.relVal = relVal;
	}

	public String getRelValUntTyp() {
		return this.relValUntTyp;
	}

	public void setRelValUntTyp(String relValUntTyp) {
		this.relValUntTyp = relValUntTyp;
	}

	public Integer getReopnt() {
		return this.reopnt;
	}

	public void setReopnt(Integer reopnt) {
		this.reopnt = reopnt;
	}

	public Integer getReoqty() {
		return this.reoqty;
	}

	public void setReoqty(Integer reoqty) {
		this.reoqty = reoqty;
	}

	public Integer getRevflg() {
		return this.revflg;
	}

	public void setRevflg(Integer revflg) {
		this.revflg = revflg;
	}

	public String getRptuom() {
		return this.rptuom;
	}

	public void setRptuom(String rptuom) {
		this.rptuom = rptuom;
	}

	public String getRsvuom() {
		return this.rsvuom;
	}

	public void setRsvuom(String rsvuom) {
		this.rsvuom = rsvuom;
	}

	public Integer getScfpos() {
		return this.scfpos;
	}

	public void setScfpos(Integer scfpos) {
		this.scfpos = scfpos;
	}

	public String getSchedbnum() {
		return this.schedbnum;
	}

	public void setSchedbnum(String schedbnum) {
		this.schedbnum = schedbnum;
	}

	public String getSerLvl() {
		return this.serLvl;
	}

	public void setSerLvl(String serLvl) {
		this.serLvl = serLvl;
	}

	public String getSerTyp() {
		return this.serTyp;
	}

	public void setSerTyp(String serTyp) {
		this.serTyp = serTyp;
	}

	public Integer getShelfLife() {
		return this.shelfLife;
	}

	public void setShelfLife(Integer shelfLife) {
		this.shelfLife = shelfLife;
	}

	public String getShelfTimecode() {
		return this.shelfTimecode;
	}

	public void setShelfTimecode(String shelfTimecode) {
		this.shelfTimecode = shelfTimecode;
	}

	public Integer getShpResLot() {
		return this.shpResLot;
	}

	public void setShpResLot(Integer shpResLot) {
		this.shpResLot = shpResLot;
	}

	public String getStccod() {
		return this.stccod;
	}

	public void setStccod(String stccod) {
		this.stccod = stccod;
	}

	public String getStkuom() {
		return this.stkuom;
	}

	public void setStkuom(String stkuom) {
		this.stkuom = stkuom;
	}

	public String getSubTagEncode() {
		return this.subTagEncode;
	}

	public void setSubTagEncode(String subTagEncode) {
		this.subTagEncode = subTagEncode;
	}

	public String getSubcfg() {
		return this.subcfg;
	}

	public void setSubcfg(String subcfg) {
		this.subcfg = subcfg;
	}

	public Integer getSupLotFlg() {
		return this.supLotFlg;
	}

	public void setSupLotFlg(Integer supLotFlg) {
		this.supLotFlg = supLotFlg;
	}

	public BigDecimal getThreshPckVar() {
		return this.threshPckVar;
	}

	public void setThreshPckVar(BigDecimal threshPckVar) {
		this.threshPckVar = threshPckVar;
	}

	public String getTimcod() {
		return this.timcod;
	}

	public void setTimcod(String timcod) {
		this.timcod = timcod;
	}

	public Integer getTimeToWarnForExp() {
		return this.timeToWarnForExp;
	}

	public void setTimeToWarnForExp(Integer timeToWarnForExp) {
		this.timeToWarnForExp = timeToWarnForExp;
	}

	public String getTypcod() {
		return this.typcod;
	}

	public void setTypcod(String typcod) {
		this.typcod = typcod;
	}

	public Integer getUVersion() {
		return this.uVersion;
	}

	public void setUVersion(Integer uVersion) {
		this.uVersion = uVersion;
	}

	public BigDecimal getUntInsVal() {
		return this.untInsVal;
	}

	public void setUntInsVal(BigDecimal untInsVal) {
		this.untInsVal = untInsVal;
	}

	public BigDecimal getUntcst() {
		return this.untcst;
	}

	public void setUntcst(BigDecimal untcst) {
		this.untcst = untcst;
	}

	public String getVelzon() {
		return this.velzon;
	}

	public void setVelzon(String velzon) {
		this.velzon = velzon;
	}

	public Integer getVelzonRecalcFlg() {
		return this.velzonRecalcFlg;
	}

	public void setVelzonRecalcFlg(Integer velzonRecalcFlg) {
		this.velzonRecalcFlg = velzonRecalcFlg;
	}

	public String getWgtcod() {
		return this.wgtcod;
	}

	public void setWgtcod(String wgtcod) {
		this.wgtcod = wgtcod;
	}

	public Integer getWipPrtflg() {
		return this.wipPrtflg;
	}

	public void setWipPrtflg(Integer wipPrtflg) {
		this.wipPrtflg = wipPrtflg;
	}

}