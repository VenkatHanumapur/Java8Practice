package com.section6;

import java.util.Optional;

public class Unwrap {

	public static void main(String[] args) throws IllegalAccessException {
		Integer val = 10;
		
		Optional<Integer> optionalVal = Optional.of(val);
		
		// The get method is risky one and it throws the purpose of Optional
		// If value is null or empty it throws the Exception
		Integer rVal = optionalVal.get();
		
		Optional<Integer> emptyOptional = Optional.empty();
		//If get method is invoked on the  emptyOptional object, it throws
		// NoSuchElement exception
		//Integer emptyVal = emptyOptional.get();
		
		// There are different approaches to solve this issue
		
		//1. isPresent
		Integer val11 = optionalVal.isPresent()? optionalVal.get():0;
		System.out.println(val11);
		Integer val12 = emptyOptional.isPresent()? emptyOptional.get():0;
		System.out.println(val12);
		
		//2.orElse - in this scenario, present object with orElse will be created 
		// irrespective of whether value is present or not. This is a 
		// performance overhead		
		Integer value21 = optionalVal.orElse(0);
		System.out.println(value21);		
		Integer value22= emptyOptional.orElse(0);
		System.out.println(value22);
		
		//3.orElseGet - In this scenario, takes supplier object with orElseGet will be 
		// created only when value is not present.it avoids the
		// performance overhead	happens with the orElse		
		Integer value31 = optionalVal.orElseGet(() -> 0);
		System.out.println(value31);		
		Integer value32= emptyOptional.orElseGet(() -> 0);
		System.out.println(value32);
		
		//orElseThrow -- throws an exception which passed parameter to this method
		//Integer value41 = emptyOptional.orElseThrow(() -> new IllegalAccessException());
		
		//orElseThrow -- throws an exception without passing parameter to this method 
		// This NoSuchELement exception, which is same as get() method
		Integer value51 = emptyOptional.orElseThrow();
		
		

	}

}
