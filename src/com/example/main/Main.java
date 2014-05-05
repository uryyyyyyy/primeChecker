package com.example.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.io.SystemInputNumberReader;
import com.example.io.SystemInputReader;
import com.example.io.SystemWriter;
import com.example.vo.NearestPrimeInts;
import com.example.vo.PositiveInt;

public class Main {

	public static void main(String[] args) {
		try{
			final long startTime = System.currentTimeMillis();

			//参考用コメント まず、入力→計算→出力の大きな流れがあります。
			List<PositiveInt> inputs = load(args);
			List<NearestPrimeInts> outputs = execute(inputs);
			write(outputs);

			final long endTime = System.currentTimeMillis();
			System.out.println(endTime - startTime + "ms かかりました。");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("エラーです。ログを確認してください。");
		}
	}

	private static void write(List<NearestPrimeInts> intList) {
		System.out.println("出力");
		SystemWriter<NearestPrimeInts> output = new SystemWriter<NearestPrimeInts>(){

			@Override
			public void writeAll(List<NearestPrimeInts> list) {
				for (NearestPrimeInts i : list) {
					System.out.println(i.getLargerNum().get() + " " + i.getSmallerNum().get());
				}
			}
		};
		output.writeAll(intList);
	}

	/**
	 * 参考用コメント 
	 * 
	 * @param inputs
	 * @return List<NearestPrimeInts>
	 */
	private static List<NearestPrimeInts> execute(final List<PositiveInt> inputs) {
		final List<NearestPrimeInts> resultList = new ArrayList<NearestPrimeInts>(inputs.size());
		for (PositiveInt i : inputs) {
			resultList.add(new NearestPrimeInts(i));
		}
		return resultList;
	}
	
	/**
	 * 参考用コメント 入力では、標準入力のバリデーションチェックと型安全な形に持っていきます。
	 * 参考用コメント 再利用性を考えて実装しています
	 * 
	 * @param args
	 * @return List<PositiveInt>
	 */
	private static List<PositiveInt> load(final String[] args) {
		System.out.println("入力");
		final SystemInputReader reader = new SystemInputNumberReader();
		//参考用コメント 再利用できそうなのでこのまま使っている。
		List<Integer> list = reader.toInteger(Arrays.asList(args));
		return convertToPositiveInt(list);
	}

	private static List<PositiveInt> convertToPositiveInt(List<Integer> list) {
		List<PositiveInt> results = new ArrayList<PositiveInt>();
		for(Integer i : list){
			results.add(new PositiveInt(i));
		}
		return results;
	}
}
