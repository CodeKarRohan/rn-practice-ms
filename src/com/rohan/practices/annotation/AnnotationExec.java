package com.rohan.practices.annotation;

import java.util.Map;

import com.rohan.practices.Exceptions.JsonSerializeException;
import com.rohan.practices.code.Car;

public class AnnotationExec {
	
	public static void main(String[] args) throws JsonSerializeException
	{
		Car car = new Car();
		car.setCarManufature("ROHAN");
		car.setCarName("TOYPTA");
		car.setCarType("INT");
		car.setId(123);
		
		JsonSerializer ser = new JsonSerializer();
		System.out.println(ser.serialize(car));
		//car = null;
		//System.out.println(ser.serialize(car));
	}
	
	
	public void tryStream(List<Integer> lis)
	{
		lis.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

}
