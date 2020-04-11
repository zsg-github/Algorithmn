package com.zsg.huawei._3_5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _86_�ҳ��ַ����е�һ������һ�ε��ַ� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			System.out.println(getFirstChar(ch));
			
		}
		sc.close();
	}
	
	 static String getFirstChar(char[] ch) {
		//linkedMap���ڴ洢�������뱣�ֽ����˳���뱻ȡ����˳��һ�µĻ������ȿ���LinkedMap
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		for(Character c : map.keySet()) {
			if(map.get(c) == 1) return String.valueOf(c);	
		}
		return "-1";
	}
	 
	 public int firstUniqChar(String s) {
	        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	        int n = s.length();
	        // build hash map : character and how often it appears
	        for (int i = 0; i < n; i++) {
	            char c = s.charAt(i);
	            count.put(c, count.getOrDefault(c, 0) + 1);
	        }
	        
	        // find the index
	        for (int i = 0; i < n; i++) {
	            if (count.get(s.charAt(i)) == 1) 
	                return i;
	        }
	        return -1;
	    }

}
