package com.jda.jira.Examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RestController;

import com.jda.jira.Examples.testUtility.TestForDb;

@SpringBootApplication
@ServletComponentScan
@RestController
public class JdaJiraDiggerApplication   {
	
//public class JdaJiraDiggerApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(JdaJiraDiggerApplication.class);
	 
	
	@Autowired
	private TestForDb testForDb;
	
	public static void main(String[] args)  {
		SpringApplication.run(JdaJiraDiggerApplication.class, args);
		
	}
	
	   public void run(String... strings) throws Exception {
	    }
	    
		/*
	@Override
    public void run(String... args) {
		log.info("Starting the application");
		testForDb.testDbSetup();
	}
	*/

}
