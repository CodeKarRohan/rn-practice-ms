package com.jda.jira.Examples.hackthon.controller;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jda.jira.Examples.hackthon.beans.OperatorHealth;
import com.jda.jira.Examples.hackthon.entity.OperatorHealthTab;
import com.jda.jira.Examples.hackthon.serviceimpl.OperatorHealthServiceImpl;


@RestController
@RequestMapping("/api/v1/operator")
public class OperatorHealthController {
	
	@Autowired
	OperatorHealthServiceImpl operatorHealthServiceImpl;
	
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = "/health", produces = "application/json")
	public ResponseEntity<List<OperatorHealth>>  getOperatorsHealth() throws Exception
	{
		List<OperatorHealth> oprHealth = operatorHealthServiceImpl.getOperatorHealth();
		
		if(null == oprHealth || oprHealth.size() <= 0)
		{
			throw new OperationNotSupportedException("Oparators not found.");
		}
		
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("X-Total-Count", 
	    		 oprHealth.size()+"");
	    responseHeaders.set("Access-Control-Expose-Headers", "X-Total-Count");
	 
	    return ResponseEntity.ok()
	      .headers(responseHeaders)
	      .body(oprHealth);
		//Resources resource = new Resources(oprHealth);
		//return oprHealth;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = "/health/operator/{oprUname}", produces = "application/json")
    public  Resource getOperatorHealth(@PathVariable String oprUname) throws Exception
    {
		OperatorHealth oprHealth  = operatorHealthServiceImpl.getOperatorHealth(oprUname);
		
		if(null == oprHealth )
		{
			throw new OperationNotSupportedException("Oparators "+ oprUname+" not found." );
		}
		
		Resource<OperatorHealth> resource = new Resource<OperatorHealth>(oprHealth);
		
		return resource;
    }
	
	
	@PostMapping(path = "/health/operator", consumes = "application/json", produces = "application/json") 
    public Resource createOperator(@RequestBody OperatorHealthTab operatorHealthTab ) throws Exception
    {
		
		System.out.println("hit the api");
		
		OperatorHealthTab operatorHealthTab1  = operatorHealthServiceImpl.createOperator(operatorHealthTab);
      
		System.out.println("after call the api");
		if(null == operatorHealthTab1)
        {
			System.out.println("ad request, please check all values");
        	throw new Exception("Bad request, please check all values.");
        }
	    Resource<OperatorHealthTab> resource = new Resource<OperatorHealthTab>(operatorHealthTab1);
		return resource;
    }
}
