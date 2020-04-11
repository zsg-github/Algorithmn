package com.zsg.huawei._2_20;

import java.util.Scanner;

public class _33_公共子串计算 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str1 = scanner.next();
			String str2 = scanner.next();
			int count = solveString(str1,str2);
			System.out.println(count);
		}
		scanner.close();	
	}
	
	public static int solveString(String str1,String str2) {
		if(str1.length() < str2.length()) {
			String temp = str2;
			str2 = str1;
			str1 = temp;
		}
		for(int i = str2.length(); i > 0; i--) {
			for(int j = 0; j <= str2.length() - i; j++) {
				if(str1.contains(str2.subSequence(j, i + j)))
					return i;
			}
		}
		return 0;
	}

}
