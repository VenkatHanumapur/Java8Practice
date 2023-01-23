package com.section4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Test");
		list1.add("");
		list1.add("Get");
		list1.add("");
		list1.add("TestOne");
		
		Predicate<String> prd= s -> !s.isEmpty();
		
		List<String> fl1=filterList(list1,prd);
		System.out.println(fl1);
		
		Predicate<String> prd1= s -> s.contains("Test");
		
		List<String> wl1 = filterList(list1, prd1);
		
		System.out.println(wl1);
		
		List<Integer> intList1 = List.of(24,54,33,12,89,23);
		Predicate<Integer> intPrd1 = e -> e%2==0;
		
		List<Integer> filterIntList = filterList(intList1, intPrd1);
		System.out.println(filterIntList);
		
		
		

	}

	private static <T> List<T> filterList(List<T> list1,Predicate<T> pr1) {
		List<T> flt1 = new ArrayList<>();
		
		for(T t : list1)
		{
			if(pr1.test(t))
			{
				flt1.add(t);
			}
		}
		return flt1;
	}

}
