package com.example.io;

import java.util.List;

public class SystemNumberWriter implements NumberWriter{

	@Override
	public void writeAll(List<Integer> list) {
		for (Integer i : list) {
			System.out.println(i);
		}
	}

//	@Override
//	public void write(List<Integer> list, int index) {
//		Integer str = list.get(index);
//		System.out.println(str);
//	}
}
