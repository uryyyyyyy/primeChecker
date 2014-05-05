package com.example.vo;

import static com.example.util.PrimeChecker.isPrime;

public class NearestPrimeInts {
	private final PositiveInt largerPrime;
	//private final PositiveInt inputNum;
	private final PositiveInt smallerPrime;
	
	/**
	 * 参考用コメント このクラスのインスタンスは、
	 * 必ず適切な値（自分より大きい最小の素数と、自分より小さい最大の素数）が入っていることが保証されている。
	 * 
	 * @param inputNum
	 */
	public NearestPrimeInts(PositiveInt inputNum) {
		this.smallerPrime = findSmallerPrime(inputNum);
		this.largerPrime = findLargerPrime(inputNum);
		//this.inputNum = inputNum;
	}

	private PositiveInt findLargerPrime(PositiveInt input) {
		for(int i = input.get()+1; i < Integer.MAX_VALUE; i++){
			if(isPrime(i)){
				return new PositiveInt(i);
			}
		}
		System.out.println(input.get() + "は大きすぎます。");
		throw new NumberFormatException();
	}

	private PositiveInt findSmallerPrime(PositiveInt input) {
		for(int i = input.get()-1; i > 1; i--){
			if(isPrime(i)){
				return new PositiveInt(i);
			}
		}
		System.out.println(input.get() + "より小さい素数はありません。");
		throw new NumberFormatException();
	}

	public PositiveInt getLargerNum() {
		return largerPrime;
	}

//	public PositiveInt getNnormal() {
//		return inputNum;
//	}

	public PositiveInt getSmallerNum() {
		return smallerPrime;
	}

	
}
