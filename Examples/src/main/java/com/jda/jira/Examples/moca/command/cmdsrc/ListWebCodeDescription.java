package com.jda.jira.Examples.moca.command.cmdsrc;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.moca.command.cmdsrc.beans.ListWebCodeDescriptionEntity;

@Component
public class ListWebCodeDescription {
	   @PersistenceContext
	   private EntityManager em;
	
	@Autowired   
	ListWebCodeDescriptionEntity listWebCodeDescriptionEntity;
	
	public ListWebCodeDescription() {
		
	}

	
	public void exec() throws Exception
	{
		//List<Object[]> results = this.em.createNativeQuery("SELECT a.id, a.firstName, a.lastName, a.version FROM Author a").getResultList();
		System.out.println("Enitity manage is "+em);
		List<Object[]> results = this.em.createNativeQuery("select codmst.colnam colnam,\r\n" + 
				"            les_mls_cat.mls_text coldsc,\r\n" + 
				"            codmst.codval,\r\n" + 
				"            dscmst.short_dsc,\r\n" + 
				"            dscmst.lngdsc,\r\n" + 
				"            codmst.srtseq,\r\n" + 
				"            codmst.rqdflg,\r\n" + 
				"            dscmst.locale_id\r\n" + 
				"       from codmst\r\n" + 
				"  left join dscmst\r\n" + 
				"         on dscmst.colnam = codmst.colnam\r\n" + 
				"        and dscmst.colval = codmst.codval\r\n" + 
				"  left join les_mls_cat\r\n" + 
				"         on les_mls_cat.mls_id = codmst.colnam\r\n" + 
				"        and appl_id = 'LES'\r\n" + 
				"        and frm_id = 'LES'\r\n" + 
				"        and vartn = 'LES'").getResultList();

		System.out.println("results "+results);
		
		results.stream().forEach((record) -> {
	     
	        System.out.println((String) record[1]);
	});
	}
	
	
	
		
	

}
