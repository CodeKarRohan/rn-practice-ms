package com.rohan.practices.java8fet;

import java.util.function.Function;

public class FuncInterfExampl   {
	
	static ExampleFuncInterface ex = (int a, int b) -> {return a+b;};
	static ExampleFuncInterface exMul = (int a, int b) -> {return a*b;};
	static ExampleFuncInterface exMin = (int a, int b) -> {return a-b;};
	static ExampleFuncInterface exGrt = (int a, int b) -> {return (a >b)?1:0;};
	static ExampleFuncInterface exDev = (int a, int b) -> {return a/b;};
	
	public static void main(String[] args)
	{
		int a = 100, b=50;
		System.out.println(FuncInterfExampl.ex.doTheOpr(a,b));
		System.out.println(FuncInterfExampl.exMul.doTheOpr(a,b));
		System.out.println(FuncInterfExampl.exMin.doTheOpr(a,b));
		System.out.println(FuncInterfExampl.exGrt.doTheOpr(a,b));
		System.out.println(FuncInterfExampl.exDev.doTheOpr(a,b));
		
		ex.printDef();
		ExampleFuncInterface.printStat();
		
		
		FuncInterfString dblString = (String s)->{return s+s;};
		//FuncInterfString remVowel = (String s)->{return s.replace("a|e|i||o|u|A|E|I|O|U","");};
		FuncInterfString remVowel = (String s)->{return s.replaceAll("(a|e|i|o|u|A|E|I|O|U)","");};
		FuncInterfString remNonVowel = (String s)->{return s.replaceAll("(a|e|i|o|u|A|E|I|O|U)","");};
		System.out.println(remVowel.doSpecificOpr("rohan"));
		System.out.println(remNonVowel.doSpecificOpr("rohan"));
		
		String s ="rohan12345rtt";
		
		s=s.replaceAll("[^a-z]", "");
		System.out.println(s);
		
		
		Function<Integer, String> f1 =(Integer s12) -> {return s12+"rohan";};
		
		System.out.println(f1.apply(34));
		
		Function<Integer, Integer> doThis =(Integer m) -> {
		
			return m*10;
		};
		
		doThis.apply(10);
		
		
		Function<String, String> StringValidCheck = (String h) -> {
			
		   return ((null == h)?"INVAL":(h.length() > 0?"VAL":"INVAL"));
			
		};
		
		StringValidCheck.apply("ROHAN");
		
		StringUtilityInterface strInf = new StringUtilityInterface();
		System.out.println(strInf.StringValidityCheck.test("rohan"));
		System.out.println(strInf.StringToInteger.apply("rohan1234"));
		System.out.println(strInf.StrToUpperCase.apply("rohanna"));
		
	}
	
	
}
