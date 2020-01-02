package com.jda.jira.Examples.db.repo;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.db.entity.ReceiveLine;
import com.jda.jira.Examples.db.keys.ReceiveLinePrimKey;

@Component
public interface ReceiveLineRepo extends  Repository<ReceiveLine, ReceiveLinePrimKey> {
	
	List<ReceiveLine> findAll();
	
	List<ReceiveLine> findByPrimKey(ReceiveLinePrimKey primKey);
	List<ReceiveLine> findByPrimKeyTrknum(String trkNum);
	List<ReceiveLine> findByRcvkey(String rcvkey);
	
	
	
	//void findBy(ReceiveLinePrimKey receiveLinePrimKey);
	//findByEmployeeIdentityCompanyId

}
