package com.example.io;

import java.util.List;

public interface NumberReader {
	
	public List<Integer> readAll(List<String> list)throws NumberFormatException;
	
	//public int read(List<String> list, int index);

}
