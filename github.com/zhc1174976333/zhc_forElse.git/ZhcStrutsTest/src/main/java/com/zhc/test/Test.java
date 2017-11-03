package com.zhc.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) throws Exception {
		String ma="µÄÎ¥·¨";
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.println(list != null || list.size() <=0);
		
		
	}

}
