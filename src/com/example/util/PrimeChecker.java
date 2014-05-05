package com.example.util;

import java.util.logging.Logger;


public class PrimeChecker {
	private static final Logger logger = Logger.getLogger("NumberFormatChecker");
	private static final String NPE = "null desu";
	
	public static void checkNotNull (Integer number) throws NumberFormatException{
		if(number == null){
			logger.warning(NPE);
			throw new NumberFormatException();
		}
	}
	
	public static boolean isPrime(int input){
		for(int i=2; i < input; i++){
			if(input % i == 0){
				return false;
			}
		}
		return true;
	}
}
