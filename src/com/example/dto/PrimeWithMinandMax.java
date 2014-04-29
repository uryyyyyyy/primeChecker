package com.example.dto;

public class PrimeWithMinandMax {
	
	private final int referedNumber;
	private final int minMaxPrime;
	private final int maxMinPrime;
	
	public PrimeWithMinandMax(int referedNumber, int minMaxPrime,
			int maxMinPrime) {
		super();
		this.referedNumber = referedNumber;
		this.minMaxPrime = minMaxPrime;
		this.maxMinPrime = maxMinPrime;
	}

	public int getReferedNumber() {
		return referedNumber;
	}

	public int getMinMaxPrime() {
		return minMaxPrime;
	}

	public int getMaxMinPrime() {
		return maxMinPrime;
	}
	
	

}
