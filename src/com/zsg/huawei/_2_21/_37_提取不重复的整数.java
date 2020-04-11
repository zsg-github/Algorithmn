package com.zsg.huawei._2_21;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _37_提取不重复的整数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			StringBuilder sb = new StringBuilder();
//			while(i > 0) {
//				temp = i % 10;
//				if(!Integer.toString(result).contains(temp+"")) {
//					result = result * 10 +temp;
//				}
//				i = i/10;
//			}
			LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
			for(int i = str.length() -1; i>=0; i--) {
				Character ch = str.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			for(Character character : map.keySet()) {
				sb.append(character);
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}
}
