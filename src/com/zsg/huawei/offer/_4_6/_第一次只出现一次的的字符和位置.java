package com.zsg.huawei.offer._4_6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _第一次只出现一次的的字符和位置 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			int index = FirstNotRepeatingChar(str);
			System.out.println(index);
			
		}
		sc.close();
	}
	
	 public static int FirstNotRepeatingChar(String str) {
		 	Map<Character,Integer> map = new LinkedHashMap<>();
		 	for(Character ch : str.toCharArray()) {
		 		map.put(ch, map.getOrDefault(ch, 0) + 1);
		 	}
		 	boolean isExist = false;
		 	char targetChar =' ';
		 	for(Character ch : map.keySet()) {
		 		if(map.get(ch) == 1) {
		 			isExist = true;
		 			targetChar = ch;
		 			break;	
		 		}
		 	}
		 	if(isExist) {
		 		return str.indexOf(targetChar);
		 	}
	        return -1;
	    }

}
