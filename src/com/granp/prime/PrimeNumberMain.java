package com.granp.prime;

public class PrimeNumberMain {

	public static void main(String[] args) {
		
//		System.out.println(isPrime(98));
		
		PrimeAlgo myPrime = new PrimeAlgo();
		
		int val = 97;
		boolean isPrime = myPrime.isPrime(val);
		
		System.out.print(isPrime);
	}
	
	
}
