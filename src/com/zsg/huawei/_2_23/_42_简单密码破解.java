package com.zsg.huawei._2_23;

import java.util.Scanner;

public class _42_简单密码破解 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String passWord = getPassWord(str);
			System.out.println(passWord);
		}
		sc.close();
	}
	
	public static String getPassWord(String str) {
		if(str.length() > 100) return "密码过长";
		StringBuilder passWord = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char c;
			if(ch >= 'A' && ch <= 'Z') {
				if(ch == 'Z') {
					c = 'a';
				}else {
					c =(char) (ch + ('a' - 'A') + 1);
				}
				//在 Java 中 char 就是一个整数
				//c = (char) (Character.toLowerCase(ch) + 1);
			}else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if(ch >= 'w') {
					c= '9';
				}else if(ch >= 't') {
					c = '8';
				}else if(ch >= 'p') {
					c = '7';
				}else if(ch >= 'm') {
					c = '6';
				}else if(ch >= 'j') {
					c = '5';
				}else if(ch >= 'g') {
					c = '4';
				}else if(ch >= 'd') {
					c = '3';
				}else {
					c = '2';
				}
			}else {
				//数字和其他的符号都不做变换
				c = str.charAt(i);
			}
			passWord.append(c);
		}
		
		return passWord.toString();  //StringBuilder转String
	}
	
}
