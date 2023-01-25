package com.section5;

import java.util.function.Function;

public class ConstructorReferencePractice {

	public static void main(String[] args) {
		Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
		Runnable task1 = () -> System.out.println("Task 1 executed");
		Runnable task2 = () -> System.out.println("Task 2 excuted");
		
		Thread t1=threadGenerator.apply(task1);
		Thread t2=threadGenerator.apply(task2);
		t1.start();
		t2.start();
		
		threadGenerator
	    	.apply(() -> System.out.println("Task3 is executed"))
		    .start();
		
		
		Function<Runnable,Thread> threadGenerator2= Thread :: new;
		
		Runnable task11 = () -> System.out.println("Task11 is executed");
		Runnable task22 = () -> System.out.println("Task22 is executed");
		
		Thread t11= threadGenerator2.apply(task11);
		Thread t22= threadGenerator2.apply(task22);
		t11.start();
		t22.start();
		
		threadGenerator2
		      .apply(() -> System.out.println("Task33 is excuted"))
		      .start();
		
		

	}

}
