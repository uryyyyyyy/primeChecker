package com.example.io;

import java.util.List;

public interface SystemInputReader {
	
	public List<Integer> toInteger(List<String> list)throws NumberFormatException;
	
	//public int read(List<String> list, int index);

}
