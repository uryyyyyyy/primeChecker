package com.example.io;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SystemNumberReader implements NumberReader{

	private final Logger logger = Logger.getLogger("SystemNumberLoader");

	@Override
	public List<Integer> readAll(List<String> inputs){		
		checkAboveMaxValue(inputs);
		List<Integer> resultList = new ArrayList<Integer>(inputs.size());
		int counter = 0;
		try{
			for(String input : inputs){
				System.out.println(input);
				int inputInt = Integer.valueOf(input);
				resultList.add(inputInt);
				counter++;
			}
		}catch(NumberFormatException e) {
			e.printStackTrace();
			logger.info(counter+1 + "個目の入力値 " + inputs.get(counter) + " はint型に変換できません");
		}
		return resultList;
	}

	private void checkAboveMaxValue(List<String> args) {
		if(args.size() == Integer.MAX_VALUE){
			logger.warning("入力値が多すぎます。Integer.MAX_VALUE以降は切り捨てます。");
		}
	}

	//	@Override
	//	public int read(List<String> args, int index) {
	//		// TODO Auto-generated method stub
	//		return 0;
	//	}

}
