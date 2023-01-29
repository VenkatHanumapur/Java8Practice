package com.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilter<T> {	
	public static List<Stock> bySymbol(List<Stock> list,String symbol){
		List<Stock> filteredList = new ArrayList<>();
		for (Stock stock : list) {
			if(stock.getSymbol().equals(symbol))
				filteredList.add(stock);
		}
		
		return filteredList;
		
	}
	
	public static List<Stock> byPriceAbove(List<Stock> list,double amount){
		List<Stock> filteredList = new ArrayList<>();
		for (Stock stock : list) {
			if(stock.getPrice()>amount)
				filteredList.add(stock);
		}
		
		return filteredList;
		
	}	
	public  <T> List<T> filter(List<T> list, Predicate<T> predicate){
		List<T> filteredList = new ArrayList<>();
		for (T t : list) {
			  if ( predicate.test(t)){
				  filteredList.add(t);
			   }			
		}
		return filteredList;		
	}
}
