package com.section2;

public class FirstLamda {

	public static void main(String[] args) {
		// Without Anonymous class
		MyRunnable mr = new MyRunnable();		
		Thread tr1=  new Thread(mr);
		tr1.start();
		
		// With Anonymous class
		
		Thread ar = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread Executed2");				
			}			
		});
		ar.start();
		
		//Lambda		
		Thread lb = new Thread(() -> System.out.println("Thread Executed3")	);
		lb.start();

	}

}
