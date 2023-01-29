package com.section7;

public class TailOptimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Regular recursion
	// if you pass 4 following are execution steps
	// 4 * reFact(3)
	// 3 * reFact(2)
	// 2 * reFact(1)
	// 1
	// 1 
	// 1*2
	// 2*3
	// 4*6
	//24
	// It keeps holding on to the stack
	// This can lead to stack over flow in case of input large values
	
	public static long reFact(int n) {
		if(n<=1) 
			return 1;
		else
			return n * reFact(n-1);
	}
	
	// a is accumulator and it doesn't hold the value on stack for providing
	// product
	// recursiveReFact(3, 4*1)
	// recursiveReFact(2, 4*3)
	// recursiveReFact(1, 12*2)
	// 24
	// Stack overflow exception won;t occur in this scenario
	
	public static long recursiveReFact(int n, int a) {
		if(n<=1)
			return a;
		return recursiveReFact(n-1, n*a);
	}
}
