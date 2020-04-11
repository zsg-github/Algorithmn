package com.zsg.huawei._2_23;

import java.util.Scanner;

public class _43_字符串加密 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();  //秘钥,小写为标准
			String str2 = sc.next();
			StringBuilder comp = new StringBuilder();
			StringBuilder encrypt = new StringBuilder();
			//去重
			for(int i= 0; i < str1.length(); i++) {
				if(!comp.toString().contains(str1.charAt(i)+"")) {
					comp.append(str1.charAt(i));
				}
				
			}
			//补全
			for(int i = 0; i < 26; i++) {
				char ch = (char)('a'+i);
				if(!comp.toString().contains(ch+"")) {
					comp.append(ch);
				}
			}
			for(int i = 0; i< str2.length(); i ++) {
				//根据str2找出每个字符在字母表的位置（大小写）使用flag标记知否大写
				Boolean flag = false;
				char ch = str2.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					ch = (char)(ch + ('a' - 'A'));
					flag = true;
				}
				int index = ch - 'a';
				//根据位置找出对应于comp中的字符(保留大小写)
				char c = comp.toString().charAt(index);
				if(flag) {
					c= Character.toUpperCase(c);
				}
				encrypt.append(c);	
			}
			
			
			System.out.println(encrypt.toString());
		}
		sc.close();
	}
}
