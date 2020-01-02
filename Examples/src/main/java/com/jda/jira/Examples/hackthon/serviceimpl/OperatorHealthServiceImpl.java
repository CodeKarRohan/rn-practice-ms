package com.jda.jira.Examples.hackthon.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jda.jira.Examples.hackthon.beans.Constants;
import com.jda.jira.Examples.hackthon.beans.OperatorHealth;
import com.jda.jira.Examples.hackthon.entity.OperatorHealthTab;
import com.jda.jira.Examples.hackthon.repository.OperatorHealthTabRepo;
import com.jda.jira.Examples.hackthon.service.OperatorHealthService;
import com.jda.jira.Examples.hackthon.utility.HealthCalculation;
import com.jda.jira.Examples.hackthon.utility.Validator;

@Service
public class OperatorHealthServiceImpl implements OperatorHealthService {

	@Autowired
	OperatorHealthTabRepo operatorHealthTabRepo;

	@Override
	public OperatorHealth getOperatorHealth(String oprName) throws Exception {
		if (null == oprName || oprName.length() <= 0) {
			return null;
		}
		OperatorHealthTab oprTab = operatorHealthTabRepo.findByUserName(oprName);
		return this.wrapTheData(oprTab);

	}
	

	@Override
	public List<OperatorHealth> getOperatorHealth() throws Exception {
		List<OperatorHealthTab> oprTabList = operatorHealthTabRepo.findAll();
		return this.wrapTheData(oprTabList);
	}

	
	
	
	
	private List<OperatorHealth> wrapTheData(List<OperatorHealthTab> oprTab) throws Exception
	{
		List<OperatorHealth> oprHlt = new ArrayList<>();
		
		if( oprTab == null || oprTab.size() <= 0)
		{
			return null;
		}
		
		//write wrapper code here
		for(OperatorHealthTab opr  : oprTab)
		{
			OperatorHealth oprh = new OperatorHealth();
			oprh.setOperatorName(opr.getUserName());
			oprh.setBodyTemprature(opr.getBodyTemprature());
			oprh.setLowBp(opr.getBpLow());
			oprh.setHighBp(opr.getBpHigh());
			oprh.setOxygenSat(opr.getOxygenSaturation());
			oprh.setPulseRate(opr.getPulseRate());
			oprh.setRecordedDate(opr.getRecordDate());
			oprh.setHealth(Constants.healthMap.get(opr.getHealthCondition()));
			oprh.setStressFactor(opr.getStressFactor());
			if(opr.getId() != null)
			oprh.setId(opr.getId());
			oprHlt.add(oprh);
		}
		
		return oprHlt;
		
	}

	private OperatorHealth wrapTheData(OperatorHealthTab opr) throws Exception
	{
		
		
		if( opr == null)
		{
			return null;
		}
		
		//write wrapper code here
		OperatorHealth oprh = new OperatorHealth();
		oprh.setOperatorName(opr.getUserName());
		oprh.setBodyTemprature(opr.getBodyTemprature());
		oprh.setLowBp(opr.getBpLow());
		oprh.setHighBp(opr.getBpHigh());
		oprh.setOxygenSat(opr.getOxygenSaturation());
		oprh.setPulseRate(opr.getPulseRate());
		oprh.setRecordedDate(opr.getRecordDate());
		oprh.setHealth(Constants.healthMap.get(opr.getHealthCondition()));
		oprh.setStressFactor(opr.getStressFactor());
		if(opr.getId() != null)
		oprh.setId(opr.getId());
			
		return oprh;
		
	}

	@Override
	public OperatorHealthTab createOperator(OperatorHealthTab oprh) throws Exception {
	
		System.out.println("inside method");
		if (!Validator.validateOperatorTab(oprh).isEmpty())
		{
			System.out.println("inside validateOperatorTab block ");
			return null;
		}
		System.out.println("after l check method");
		try {
		int healthcheck = HealthCalculation.calculateHealth(wrapTheData(oprh));
		oprh.setHealthCondition(healthcheck);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		System.out.println("inside healthcheck block ");
		
		if(oprh.getRecordDate() == null)
		{
			java.util.Date date=new java.util.Date();  
			oprh.setRecordDate(date);
			System.out.println("set date  healthcheck block ");
		}
		System.out.println("sent object "+oprh);
		
		OperatorHealthTab oldtab = operatorHealthTabRepo.findByUserName(oprh.getUserName());
		
		if(oldtab != null)
		{
			oprh.setId(oldtab.getId());
		}
		System.out.println("after id  ");
		OperatorHealthTab nOpr = operatorHealthTabRepo.save(oprh);
		System.out.println("after save ");
		return nOpr;
	}
}
