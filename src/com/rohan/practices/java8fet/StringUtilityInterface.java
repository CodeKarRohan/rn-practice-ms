package com.rohan.practices.java8fet;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class StringUtilityInterface {
	
	Predicate<String> StringValidityCheck = (String inputStr) -> {
		return (null == inputStr ? false : (inputStr.length() > 0 ? true : false));
	};
	
	Function<String, Integer> StringToInteger = (String inputStr) -> {
		inputStr = inputStr.replaceFirst("[a-z A-Z]", "");
		return Integer.parseInt(inputStr);
	};
	
	Function<String, String> StrToUpperCase = (String inputStr) -> {
		return inputStr.toUpperCase();
	};
	
	UnaryOperator<String> toUpperCase = (String inp) ->{
		return inp.toUpperCase();
	};
	
	BinaryOperator<String> concatStr = (String m1, String m2) -> {
		return m1+m2;
	};
	
	Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
	
	Consumer<Integer> consumer = (value) -> System.out.println(value);
}
 