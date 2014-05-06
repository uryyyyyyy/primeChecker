package com.example.vo;


public class PositiveInt {
	private final int i;

	public PositiveInt(final int i) {
		if(i < 1){
			System.out.println("数字" + i + "は正の整数ではありません");
			throw new NumberFormatException();
		}else{
			this.i = i;
		}
	}

	public int get() {
		return i;
	}
}
