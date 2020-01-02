package com.jda.jira.Examples.db.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.jda.jira.Examples.db.keys.ReceiveLinePrimKey;

@Entity
@Table(name="rcvlin")
public class ReceiveLine {

	 
	    @EmbeddedId
	    private ReceiveLinePrimKey primKey;
	 
	    private String rcvkey  ;
		private Integer expqty  ;
		private Integer idnqty  ;
		private Integer rcvqty  ;
		private Integer rptqty  ;
		private Integer exp_catch_qty  ;
		private Integer idn_catch_qty  ;
		private Integer rcv_catch_qty  ;
		private String prtnum  ;
		private String orgcod  ;
		private String revlvl  ;
		private String lotnum  ;
		private String rcvsts  ;
		private String frhsta  ;
		private String tohsta  ;
		private String hsttrn  ;
		private Date mandte  ;
		private String retcod  ;
		private Integer edtflg  ;
		private Integer blind_flg  ;
		private String ship_line_id  ;
		private Date moddte  ;
		private String mod_usr_id  ;
		private Integer cnsg_flg  ;
		private String prt_client_id  ;
		private Date expire_dte  ;
		private String inv_attr_str1  ;
		private String inv_attr_str2  ;
		private String inv_attr_str3  ;
		private String inv_attr_str4  ;
		private String inv_attr_str5  ;
		private String inv_attr_str6  ;
		private String inv_attr_str7  ;
		private String inv_attr_str8  ;
		private String inv_attr_str9  ;
		private String inv_attr_str10  ;
		
		@Column(name="inv_attr_int1")
		private Integer inv_attr_Integer1  ;
		@Column(name="inv_attr_int2")
		private Integer inv_attr_Integer2  ;
		@Column(name="inv_attr_int3")
		private Integer inv_attr_Integer3  ;
		@Column(name="inv_attr_int4")
		private Integer inv_attr_Integer4  ;
		@Column(name="inv_attr_int5")
		private Integer inv_attr_Integer5  ;
		private Integer inv_attr_flt1  ;
		private Integer inv_attr_flt2  ;
		private Integer inv_attr_flt3  ;
		private Date inv_attr_dte1  ;
		private Date inv_attr_dte2  ;
		private String cstms_cnsgnmnt_id  ;
		private String sup_lotnum  ;
		private Integer distro_ovrflg  ;
		private String inv_attr_str11  ;
		private String inv_attr_str12  ;
		private String inv_attr_str13  ;
		private String inv_attr_str14  ;
		private String inv_attr_str15  ;
		private String inv_attr_str16  ;
		private String inv_attr_str17  ;
		private String inv_attr_str18  ;
		private Date init_rcv_dte  ;
		private String cstms_typ  ;
		private String cstms_vat_cod  ;
		private String cstms_cmmdty_cod  ;
		private String dflt_orgcod  ;
		private Integer dty_stmp_trk_flg  ;
		private Integer cstms_cst  ;
		private String cstms_crncy  ;
		private String ref1  ;
		private String ref2  ;
		private String ref3  ;
		
		public ReceiveLine()
		{
			
			
		}
		
		
		
		
		public ReceiveLine(ReceiveLinePrimKey primKey, String rcvkey, Integer expqty, Integer idnqty, Integer rcvqty,
				Integer rptqty, Integer exp_catch_qty, Integer idn_catch_qty, Integer rcv_catch_qty, String prtnum,
				String orgcod, String revlvl, String lotnum, String rcvsts, String frhsta, String tohsta, String hsttrn,
				Date mandte, String retcod, Integer edtflg, Integer blind_flg, String ship_line_id, Date moddte,
				String mod_usr_id, Integer cnsg_flg, String prt_client_id, Date expire_dte, String inv_attr_str1,
				String inv_attr_str2, String inv_attr_str3, String inv_attr_str4, String inv_attr_str5,
				String inv_attr_str6, String inv_attr_str7, String inv_attr_str8, String inv_attr_str9,
				String inv_attr_str10, Integer inv_attr_Integer1, Integer inv_attr_Integer2, Integer inv_attr_Integer3,
				Integer inv_attr_Integer4, Integer inv_attr_Integer5, Integer inv_attr_flt1, Integer inv_attr_flt2,
				Integer inv_attr_flt3, Date inv_attr_dte1, Date inv_attr_dte2, String cstms_cnsgnmnt_id,
				String sup_lotnum, Integer distro_ovrflg, String inv_attr_str11, String inv_attr_str12,
				String inv_attr_str13, String inv_attr_str14, String inv_attr_str15, String inv_attr_str16,
				String inv_attr_str17, String inv_attr_str18, Date init_rcv_dte, String cstms_typ, String cstms_vat_cod,
				String cstms_cmmdty_cod, String dflt_orgcod, Integer dty_stmp_trk_flg, Integer cstms_cst,
				String cstms_crncy, String ref1, String ref2, String ref3) {
			super();
			this.primKey = primKey;
			this.rcvkey = rcvkey;
			this.expqty = expqty;
			this.idnqty = idnqty;
			this.rcvqty = rcvqty;
			this.rptqty = rptqty;
			this.exp_catch_qty = exp_catch_qty;
			this.idn_catch_qty = idn_catch_qty;
			this.rcv_catch_qty = rcv_catch_qty;
			this.prtnum = prtnum;
			this.orgcod = orgcod;
			this.revlvl = revlvl;
			this.lotnum = lotnum;
			this.rcvsts = rcvsts;
			this.frhsta = frhsta;
			this.tohsta = tohsta;
			this.hsttrn = hsttrn;
			this.mandte = mandte;
			this.retcod = retcod;
			this.edtflg = edtflg;
			this.blind_flg = blind_flg;
			this.ship_line_id = ship_line_id;
			this.moddte = moddte;
			this.mod_usr_id = mod_usr_id;
			this.cnsg_flg = cnsg_flg;
			this.prt_client_id = prt_client_id;
			this.expire_dte = expire_dte;
			this.inv_attr_str1 = inv_attr_str1;
			this.inv_attr_str2 = inv_attr_str2;
			this.inv_attr_str3 = inv_attr_str3;
			this.inv_attr_str4 = inv_attr_str4;
			this.inv_attr_str5 = inv_attr_str5;
			this.inv_attr_str6 = inv_attr_str6;
			this.inv_attr_str7 = inv_attr_str7;
			this.inv_attr_str8 = inv_attr_str8;
			this.inv_attr_str9 = inv_attr_str9;
			this.inv_attr_str10 = inv_attr_str10;
			this.inv_attr_Integer1 = inv_attr_Integer1;
			this.inv_attr_Integer2 = inv_attr_Integer2;
			this.inv_attr_Integer3 = inv_attr_Integer3;
			this.inv_attr_Integer4 = inv_attr_Integer4;
			this.inv_attr_Integer5 = inv_attr_Integer5;
			this.inv_attr_flt1 = inv_attr_flt1;
			this.inv_attr_flt2 = inv_attr_flt2;
			this.inv_attr_flt3 = inv_attr_flt3;
			this.inv_attr_dte1 = inv_attr_dte1;
			this.inv_attr_dte2 = inv_attr_dte2;
			this.cstms_cnsgnmnt_id = cstms_cnsgnmnt_id;
			this.sup_lotnum = sup_lotnum;
			this.distro_ovrflg = distro_ovrflg;
			this.inv_attr_str11 = inv_attr_str11;
			this.inv_attr_str12 = inv_attr_str12;
			this.inv_attr_str13 = inv_attr_str13;
			this.inv_attr_str14 = inv_attr_str14;
			this.inv_attr_str15 = inv_attr_str15;
			this.inv_attr_str16 = inv_attr_str16;
			this.inv_attr_str17 = inv_attr_str17;
			this.inv_attr_str18 = inv_attr_str18;
			this.init_rcv_dte = init_rcv_dte;
			this.cstms_typ = cstms_typ;
			this.cstms_vat_cod = cstms_vat_cod;
			this.cstms_cmmdty_cod = cstms_cmmdty_cod;
			this.dflt_orgcod = dflt_orgcod;
			this.dty_stmp_trk_flg = dty_stmp_trk_flg;
			this.cstms_cst = cstms_cst;
			this.cstms_crncy = cstms_crncy;
			this.ref1 = ref1;
			this.ref2 = ref2;
			this.ref3 = ref3;
		}




		public ReceiveLinePrimKey getPrimKey() {
			return primKey;
		}
		public void setPrimKey(ReceiveLinePrimKey primKey) {
			this.primKey = primKey;
		}
		public String getRcvkey() {
			return rcvkey;
		}
		public void setRcvkey(String rcvkey) {
			this.rcvkey = rcvkey;
		}
		public Integer getExpqty() {
			return expqty;
		}
		public void setExpqty(Integer expqty) {
			this.expqty = expqty;
		}
		public Integer getIdnqty() {
			return idnqty;
		}
		public void setIdnqty(Integer idnqty) {
			this.idnqty = idnqty;
		}
		public Integer getRcvqty() {
			return rcvqty;
		}
		public void setRcvqty(Integer rcvqty) {
			this.rcvqty = rcvqty;
		}
		public Integer getRptqty() {
			return rptqty;
		}
		public void setRptqty(Integer rptqty) {
			this.rptqty = rptqty;
		}
		public Integer getExp_catch_qty() {
			return exp_catch_qty;
		}
		public void setExp_catch_qty(Integer exp_catch_qty) {
			this.exp_catch_qty = exp_catch_qty;
		}
		public Integer getIdn_catch_qty() {
			return idn_catch_qty;
		}
		public void setIdn_catch_qty(Integer idn_catch_qty) {
			this.idn_catch_qty = idn_catch_qty;
		}
		public Integer getRcv_catch_qty() {
			return rcv_catch_qty;
		}
		public void setRcv_catch_qty(Integer rcv_catch_qty) {
			this.rcv_catch_qty = rcv_catch_qty;
		}
		public String getPrtnum() {
			return prtnum;
		}
		public void setPrtnum(String prtnum) {
			this.prtnum = prtnum;
		}
		public String getOrgcod() {
			return orgcod;
		}
		public void setOrgcod(String orgcod) {
			this.orgcod = orgcod;
		}
		public String getRevlvl() {
			return revlvl;
		}
		public void setRevlvl(String revlvl) {
			this.revlvl = revlvl;
		}
		public String getLotnum() {
			return lotnum;
		}
		public void setLotnum(String lotnum) {
			this.lotnum = lotnum;
		}
		public String getRcvsts() {
			return rcvsts;
		}
		public void setRcvsts(String rcvsts) {
			this.rcvsts = rcvsts;
		}
		public String getFrhsta() {
			return frhsta;
		}
		public void setFrhsta(String frhsta) {
			this.frhsta = frhsta;
		}
		public String getTohsta() {
			return tohsta;
		}
		public void setTohsta(String tohsta) {
			this.tohsta = tohsta;
		}
		public String getHsttrn() {
			return hsttrn;
		}
		public void setHsttrn(String hsttrn) {
			this.hsttrn = hsttrn;
		}
		public Date getMandte() {
			return mandte;
		}
		public void setMandte(Date mandte) {
			this.mandte = mandte;
		}
		public String getRetcod() {
			return retcod;
		}
		public void setRetcod(String retcod) {
			this.retcod = retcod;
		}
		public Integer getEdtflg() {
			return edtflg;
		}
		public void setEdtflg(Integer edtflg) {
			this.edtflg = edtflg;
		}
		public Integer getBlind_flg() {
			return blind_flg;
		}
		public void setBlind_flg(Integer blind_flg) {
			this.blind_flg = blind_flg;
		}
		public String getShip_line_id() {
			return ship_line_id;
		}
		public void setShip_line_id(String ship_line_id) {
			this.ship_line_id = ship_line_id;
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
		public Integer getCnsg_flg() {
			return cnsg_flg;
		}
		public void setCnsg_flg(Integer cnsg_flg) {
			this.cnsg_flg = cnsg_flg;
		}
		public String getPrt_client_id() {
			return prt_client_id;
		}
		public void setPrt_client_id(String prt_client_id) {
			this.prt_client_id = prt_client_id;
		}
		public Date getExpire_dte() {
			return expire_dte;
		}
		public void setExpire_dte(Date expire_dte) {
			this.expire_dte = expire_dte;
		}
		public String getInv_attr_str1() {
			return inv_attr_str1;
		}
		public void setInv_attr_str1(String inv_attr_str1) {
			this.inv_attr_str1 = inv_attr_str1;
		}
		public String getInv_attr_str2() {
			return inv_attr_str2;
		}
		public void setInv_attr_str2(String inv_attr_str2) {
			this.inv_attr_str2 = inv_attr_str2;
		}
		public String getInv_attr_str3() {
			return inv_attr_str3;
		}
		public void setInv_attr_str3(String inv_attr_str3) {
			this.inv_attr_str3 = inv_attr_str3;
		}
		public String getInv_attr_str4() {
			return inv_attr_str4;
		}
		public void setInv_attr_str4(String inv_attr_str4) {
			this.inv_attr_str4 = inv_attr_str4;
		}
		public String getInv_attr_str5() {
			return inv_attr_str5;
		}
		public void setInv_attr_str5(String inv_attr_str5) {
			this.inv_attr_str5 = inv_attr_str5;
		}
		public String getInv_attr_str6() {
			return inv_attr_str6;
		}
		public void setInv_attr_str6(String inv_attr_str6) {
			this.inv_attr_str6 = inv_attr_str6;
		}
		public String getInv_attr_str7() {
			return inv_attr_str7;
		}
		public void setInv_attr_str7(String inv_attr_str7) {
			this.inv_attr_str7 = inv_attr_str7;
		}
		public String getInv_attr_str8() {
			return inv_attr_str8;
		}
		public void setInv_attr_str8(String inv_attr_str8) {
			this.inv_attr_str8 = inv_attr_str8;
		}
		public String getInv_attr_str9() {
			return inv_attr_str9;
		}
		public void setInv_attr_str9(String inv_attr_str9) {
			this.inv_attr_str9 = inv_attr_str9;
		}
		public String getInv_attr_str10() {
			return inv_attr_str10;
		}
		public void setInv_attr_str10(String inv_attr_str10) {
			this.inv_attr_str10 = inv_attr_str10;
		}
		public Integer getInv_attr_Integer1() {
			return inv_attr_Integer1;
		}
		public void setInv_attr_Integer1(Integer inv_attr_Integer1) {
			this.inv_attr_Integer1 = inv_attr_Integer1;
		}
		public Integer getInv_attr_Integer2() {
			return inv_attr_Integer2;
		}
		public void setInv_attr_Integer2(Integer inv_attr_Integer2) {
			this.inv_attr_Integer2 = inv_attr_Integer2;
		}
		public Integer getInv_attr_Integer3() {
			return inv_attr_Integer3;
		}
		public void setInv_attr_Integer3(Integer inv_attr_Integer3) {
			this.inv_attr_Integer3 = inv_attr_Integer3;
		}
		public Integer getInv_attr_Integer4() {
			return inv_attr_Integer4;
		}
		public void setInv_attr_Integer4(Integer inv_attr_Integer4) {
			this.inv_attr_Integer4 = inv_attr_Integer4;
		}
		public Integer getInv_attr_Integer5() {
			return inv_attr_Integer5;
		}
		public void setInv_attr_Integer5(Integer inv_attr_Integer5) {
			this.inv_attr_Integer5 = inv_attr_Integer5;
		}
		public Integer getInv_attr_flt1() {
			return inv_attr_flt1;
		}
		public void setInv_attr_flt1(Integer inv_attr_flt1) {
			this.inv_attr_flt1 = inv_attr_flt1;
		}
		public Integer getInv_attr_flt2() {
			return inv_attr_flt2;
		}
		public void setInv_attr_flt2(Integer inv_attr_flt2) {
			this.inv_attr_flt2 = inv_attr_flt2;
		}
		public Integer getInv_attr_flt3() {
			return inv_attr_flt3;
		}
		public void setInv_attr_flt3(Integer inv_attr_flt3) {
			this.inv_attr_flt3 = inv_attr_flt3;
		}
		public Date getInv_attr_dte1() {
			return inv_attr_dte1;
		}
		public void setInv_attr_dte1(Date inv_attr_dte1) {
			this.inv_attr_dte1 = inv_attr_dte1;
		}
		public Date getInv_attr_dte2() {
			return inv_attr_dte2;
		}
		public void setInv_attr_dte2(Date inv_attr_dte2) {
			this.inv_attr_dte2 = inv_attr_dte2;
		}
		public String getCstms_cnsgnmnt_id() {
			return cstms_cnsgnmnt_id;
		}
		public void setCstms_cnsgnmnt_id(String cstms_cnsgnmnt_id) {
			this.cstms_cnsgnmnt_id = cstms_cnsgnmnt_id;
		}
		public String getSup_lotnum() {
			return sup_lotnum;
		}
		public void setSup_lotnum(String sup_lotnum) {
			this.sup_lotnum = sup_lotnum;
		}
		public Integer getDistro_ovrflg() {
			return distro_ovrflg;
		}
		public void setDistro_ovrflg(Integer distro_ovrflg) {
			this.distro_ovrflg = distro_ovrflg;
		}
		public String getInv_attr_str11() {
			return inv_attr_str11;
		}
		public void setInv_attr_str11(String inv_attr_str11) {
			this.inv_attr_str11 = inv_attr_str11;
		}
		public String getInv_attr_str12() {
			return inv_attr_str12;
		}
		public void setInv_attr_str12(String inv_attr_str12) {
			this.inv_attr_str12 = inv_attr_str12;
		}
		public String getInv_attr_str13() {
			return inv_attr_str13;
		}
		public void setInv_attr_str13(String inv_attr_str13) {
			this.inv_attr_str13 = inv_attr_str13;
		}
		public String getInv_attr_str14() {
			return inv_attr_str14;
		}
		public void setInv_attr_str14(String inv_attr_str14) {
			this.inv_attr_str14 = inv_attr_str14;
		}
		public String getInv_attr_str15() {
			return inv_attr_str15;
		}
		public void setInv_attr_str15(String inv_attr_str15) {
			this.inv_attr_str15 = inv_attr_str15;
		}
		public String getInv_attr_str16() {
			return inv_attr_str16;
		}
		public void setInv_attr_str16(String inv_attr_str16) {
			this.inv_attr_str16 = inv_attr_str16;
		}
		public String getInv_attr_str17() {
			return inv_attr_str17;
		}
		public void setInv_attr_str17(String inv_attr_str17) {
			this.inv_attr_str17 = inv_attr_str17;
		}
		public String getInv_attr_str18() {
			return inv_attr_str18;
		}
		public void setInv_attr_str18(String inv_attr_str18) {
			this.inv_attr_str18 = inv_attr_str18;
		}
		public Date getInit_rcv_dte() {
			return init_rcv_dte;
		}
		public void setInit_rcv_dte(Date init_rcv_dte) {
			this.init_rcv_dte = init_rcv_dte;
		}
		public String getCstms_typ() {
			return cstms_typ;
		}
		public void setCstms_typ(String cstms_typ) {
			this.cstms_typ = cstms_typ;
		}
		public String getCstms_vat_cod() {
			return cstms_vat_cod;
		}
		public void setCstms_vat_cod(String cstms_vat_cod) {
			this.cstms_vat_cod = cstms_vat_cod;
		}
		public String getCstms_cmmdty_cod() {
			return cstms_cmmdty_cod;
		}
		public void setCstms_cmmdty_cod(String cstms_cmmdty_cod) {
			this.cstms_cmmdty_cod = cstms_cmmdty_cod;
		}
		public String getDflt_orgcod() {
			return dflt_orgcod;
		}
		public void setDflt_orgcod(String dflt_orgcod) {
			this.dflt_orgcod = dflt_orgcod;
		}
		public Integer getDty_stmp_trk_flg() {
			return dty_stmp_trk_flg;
		}
		public void setDty_stmp_trk_flg(Integer dty_stmp_trk_flg) {
			this.dty_stmp_trk_flg = dty_stmp_trk_flg;
		}
		public Integer getCstms_cst() {
			return cstms_cst;
		}
		public void setCstms_cst(Integer cstms_cst) {
			this.cstms_cst = cstms_cst;
		}
		public String getCstms_crncy() {
			return cstms_crncy;
		}
		public void setCstms_crncy(String cstms_crncy) {
			this.cstms_crncy = cstms_crncy;
		}
		public String getRef1() {
			return ref1;
		}
		public void setRef1(String ref1) {
			this.ref1 = ref1;
		}
		public String getRef2() {
			return ref2;
		}
		public void setRef2(String ref2) {
			this.ref2 = ref2;
		}
		public String getRef3() {
			return ref3;
		}
		public void setRef3(String ref3) {
			this.ref3 = ref3;
		}
	 
	 
}
