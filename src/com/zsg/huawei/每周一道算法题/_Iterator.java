package com.zsg.huawei.ÿ��һ���㷨��;

import java.util.ArrayList;
import java.util.Iterator;

public class _Iterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("1");
		list.add("2");
		for(String s : list) {
			System.out.println(s);
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}

}
