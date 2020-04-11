package com.zsg.huawei.每周一道算法题;

import java.util.Scanner;
import java.util.TreeMap;

public class _重复字符按序输出 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			/**
			 * 异常 
			 */
			if (str == null || str.length() == 0) 
	            System.out.println("字符串异常");
			//定义Treemap存放字符和个数
			TreeMap<Character,Integer> map = new TreeMap<>();
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			for(Character c : map.keySet()) {
				if(map.get(c) > 1) {
					System.out.println(c +" " + map.get(c));
				}
			}
			
		}
		sc.close();
	}

}
