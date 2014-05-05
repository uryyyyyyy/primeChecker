package com.example.util;


public class PrimeChecker {
	
	public static boolean isPrime(int input){
		for(int i=2; i < input; i++){
			if(input % i == 0){
				return false;
			}
		}
		return true;
	}
}
