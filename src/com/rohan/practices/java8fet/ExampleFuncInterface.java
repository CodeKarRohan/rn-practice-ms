package com.rohan.practices.java8fet;


@FunctionalInterface
public interface ExampleFuncInterface {
	int doTheOpr(int a, int b);
	
	public default void printDef()
	{
		System.out.println("this is defult method");
	}
	
	public static void printStat()
	{
		System.out.println("this is static method");
	}
	

}
