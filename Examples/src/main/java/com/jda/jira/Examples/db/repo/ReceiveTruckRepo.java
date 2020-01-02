package com.jda.jira.Examples.db.repo;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.db.entity.ReceiveTruck;



@Component
public interface ReceiveTruckRepo extends Repository<ReceiveTruck, String> {
	
List<ReceiveTruck> findAll();
List<ReceiveTruck> findByTrknum(String trknum);

}
