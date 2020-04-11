package com.zsg.huawei._2_23;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class 重写字符串加密 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String key = sc.next();
			String data = sc.next();
			//去重和补全
			LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
			for(int i = 0; i < key.length(); i++) {
				map.put(key.charAt(i), 1);
			}
			for(int i = 0; i<26; i++) {
				map.put((char)(i+'a'), 1);
			}
			char[] arr = new char[26];
			int k = 0;
			for(char c : map.keySet()) {
				arr[k++] = c;
			}
			//对明文进行处理
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i< data.length(); i++) {
				char ch = data.charAt(i);
				int index = 0;
				boolean flag = false;
				if(Character.isUpperCase(ch)) {
					index = ch - 'A';
					flag = true;
				}else {
					index = ch - 'a';
				}
				if(flag) {
					sb.append(Character.toUpperCase(arr[index]));
				}else {
					sb.append(arr[index]);
				}
				
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}

}
