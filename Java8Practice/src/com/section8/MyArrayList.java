package com.section8;

import java.util.function.Consumer;

public class MyArrayList<T> {
	
    T[] t; 
	public MyArrayList(T[] t1)
	{
		this.t=t1;
	}
	
	public void forEach(Consumer<T> consumer) {
		for(int i=0;i<t.length;i++) {
			consumer.accept(t[i]);			
		}
	}

}
