package com.example.checkUtil;

import java.util.logging.Logger;


public class NumberFormatChecker {
	private static final Logger logger = Logger.getLogger("NumberFormatChecker");
	private static final String NPE = "null desu";
	private static final String negativeError = "mainasu desu";
	
	public static void checkNotNull (Integer number) throws NumberFormatException{
		if(number == null){
			logger.warning(NPE);
			throw new NumberFormatException();
		}
	}
	
	public static void checkNotNegative (Integer number) throws NumberFormatException{
		if(number < 0){
			logger.warning(negativeError + " -> " + number);
			throw new NumberFormatException();
		}
	}
}
