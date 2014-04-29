package com.example.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.io.NumberReader;
import com.example.io.NumberWriter;
import com.example.io.SystemNumberReader;
import com.example.io.SystemNumberWriter;
import com.example.prime.PrimeCounter;
import com.example.prime.PrimeCounterImpl;

public class Main {

	public static void main(String[] args) {
		try{
			final long startTime = System.currentTimeMillis();

			System.out.println("入力値");
			List<Integer> inputs = load(args);
			List<Integer> outputs = execute(inputs);
			System.out.println("出力値");
			write(outputs);

			final long endTime = System.currentTimeMillis();
			System.out.println(endTime - startTime + "ms かかりました。");
		}catch(Exception e){
			System.out.println("エラーです。ログを確認してください。");
		}
	}

	private static void write(List<Integer> intList) {
		NumberWriter output = new SystemNumberWriter();
		output.writeAll(intList);
	}

	private static List<Integer> execute(final List<Integer> inputs) {
		final List<Integer> resultList = new ArrayList<Integer>(inputs.size());
		for (Integer num : inputs) {
			PrimeCounter logic = new PrimeCounterImpl();//PrimeCounterImpl2もあるよ
			int result = logic.countPrimeNumber(num);
			resultList.add(result);
		}
		return resultList;
	}

	private static List<Integer> load(final String[] args) {
		final NumberReader input = new SystemNumberReader();
		final List<String> list= Arrays.asList(args);
		return input.readAll(list);
	}

}
