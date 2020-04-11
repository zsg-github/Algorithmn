package com.zsg.huawei._涉及动态规划的题目;

import java.util.Scanner;

public class _57_查找两个字符串中的最长公共子串 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			//先比较出较短的字符串
			if(str1.length() > str2.length()) {
				String temp = str1;
				str1 = str2;
				str2 = temp;
			}
			System.out.println(getSubString(str1,str2));
		}
		sc.close();
	}
	
	//在短的字符串上截取所有的字符串去匹配长的字符串
	public static String getSubString(String str1,String str2) {
		String temp;
		for(int i = str1.length(); i > 0; i--) {
			for(int j = 0; j <= str1.length() - i; j++) {
				temp = str1.substring(j,j + i);
				if(str2.contains(temp)) {
					return temp;
				}
			}
		}
		return "没有公共字符串";
	}
}
