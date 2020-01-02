package com.jda.jira.Examples.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jda.jira.Examples.db.entity.ReceiveLine;
import com.jda.jira.Examples.db.entity.ReceiveTruck;
import com.jda.jira.Examples.db.keys.ReceiveLinePrimKey;
import com.jda.jira.Examples.db.repo.ReceiveLineRepo;
import com.jda.jira.Examples.impl.InboundShipmentLineControllerImpl;

@RestController
@RequestMapping("/api/v1/inboundShipment")
public class InboundShipmentLineController {
	
	@Autowired
	ReceiveLineRepo receiveLineRepo;
	
	@Autowired
	InboundShipmentLineControllerImpl inboundShipmentLineControllerImpl;
	
	 @GetMapping("/line")
	 public List<ReceiveLine> getAllInboundShipment() {
	   return receiveLineRepo.findAll();
	 }
	
	 
	 @GetMapping("/line/trknum/{trknum}")
	 public List<ReceiveLine> getEmployeeById(@PathVariable(value = "trknum") String trkNumber)
	   throws Exception {
	  System.out.println("Trknumber is "+trkNumber);	 
	 List<ReceiveLine> receiveLines = receiveLineRepo.findByPrimKeyTrknum(trkNumber);
	// return receiveLineRepo.findByPrimKey(new ReceiveLinePrimKey("01QA", "----","SUPA Chicago","RCPT0000901","0001","0000",0,"WMD1"));
	 return receiveLines;
	  
	 }
	
	 @GetMapping("/line/receiveKey/{rcvkey}")
	 public List<ReceiveLine> getReceiveLinesByReceiveKey(@PathVariable(value = "rcvkey") String receiveKey)
	   throws Exception {
	  System.out.println("receiveKey is "+receiveKey);	 
	 List<ReceiveLine> receiveLines = receiveLineRepo.findByRcvkey(receiveKey);
	 inboundShipmentLineControllerImpl.DoSomething();
	  return receiveLines;
	 }

}
