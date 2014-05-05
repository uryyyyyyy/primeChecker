package com.example.io;

import java.util.List;

public interface SystemWriter<T> {

	public void writeAll(List<T> list);
	//public void write(List<Integer> list, int index);
}