package com.jda.jira.Examples.hackthon.utility;

import com.jda.jira.Examples.hackthon.beans.OperatorHealth;
import com.jda.jira.Examples.hackthon.configuration.BloodPreassure;
import com.jda.jira.Examples.hackthon.configuration.BodyTemprature;
import com.jda.jira.Examples.hackthon.configuration.OxygenSaturation;
import com.jda.jira.Examples.hackthon.configuration.PulseRate;


public class HealthCalculation {
	
	public static int calculateHealth(OperatorHealth oprHlt)
	{
		//1,2,3
		
		//1 good 2 weak 3 worse
		
		/*
		 * 	public static final int MAX_PULSE = 120;
	      public static final  int MIN_PULSE = 70;
	      public static final int TOLERANCE = 10;
		 */
		//check for pulse
		if(oprHlt.getPulseRate() > PulseRate.MAX_PULSE || oprHlt.getPulseRate() < PulseRate.MIN_PULSE)
		{
			if(oprHlt.getPulseRate() <= PulseRate.MAX_PULSE + PulseRate.TOLERANCE && oprHlt.getPulseRate() >= PulseRate.MIN_PULSE - PulseRate.TOLERANCE)
			{
				return 2;
			}
			return 3;
		}
		
	
		if(oprHlt.getBodyTemprature() > BodyTemprature.BODY_TEMP_CRC_HIGH || oprHlt.getBodyTemprature() < BodyTemprature.BODY_TEMP_CRC_LOW)
		{
			if(oprHlt.getBodyTemprature() <= PulseRate.MAX_PULSE + PulseRate.TOLERANCE && oprHlt.getBodyTemprature() >= PulseRate.MIN_PULSE - PulseRate.TOLERANCE)
			{
				return 2;
			}
			return 3;
		}
		
		if(oprHlt.getLowBp() > BloodPreassure.BP_LOW )
		{
			if(oprHlt.getLowBp()  < BloodPreassure.BP_LOW - BloodPreassure.BP_HIGH )
			{
				return 2;
			}
			return 3;
		}
		
		if(oprHlt.getHighBp() > BloodPreassure.BP_HIGH)
		{
			
			if(oprHlt.getHighBp() < BloodPreassure.BP_HIGH + BloodPreassure.BP_HIGH)
			{
				return 2;
			}
			
			return 3;
		}
		
		if(oprHlt.getOxygenSat() < OxygenSaturation.OXY_SAT_MIN || oprHlt.getOxygenSat() > OxygenSaturation.OXY_SAT_MAX)
		{
			if(oprHlt.getOxygenSat() < OxygenSaturation.OXY_SAT_MAX + OxygenSaturation.TOLERANCE && 
				oprHlt.getOxygenSat() > OxygenSaturation.OXY_SAT_MIN - OxygenSaturation.TOLERANCE )
			{
				return 2;
			}
			return 3;
		}
		
		
		
		return 1;
		
	}

}
