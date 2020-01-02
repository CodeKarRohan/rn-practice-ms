package com.jda.jira.Examples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jda.jira.Examples.db.entity.ReceiveTruck;
import com.jda.jira.Examples.db.keys.ReceiveLinePrimKey;
import com.jda.jira.Examples.db.repo.ReceiveTruckRepo;

@RestController
@RequestMapping("/api/v1")
public class InboundShipmentContoller {
	
	 @Autowired
	 ReceiveTruckRepo receiveTruckRepo;
	 
	 @GetMapping("/inboundshipment")
	 public List<ReceiveTruck> getAllInboundShipment() {
	   return receiveTruckRepo.findAll();
	 }
	 
	 @GetMapping("/inboundshipment/{trknum}")
	 public List<ReceiveTruck> getEmployeeById(@PathVariable(value = "trknum") String trkNumber)
	   throws Exception {
	  System.out.print("Trknumber is "+trkNumber);	 
	  List<ReceiveTruck> receiveTruck = receiveTruckRepo.findByTrknum(trkNumber);
	  
	  return receiveTruck;
	  
	 }
	 
	 
	 

}
