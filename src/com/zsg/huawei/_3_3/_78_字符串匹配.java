package com.zsg.huawei._3_3;

import java.util.Scanner;

public class _78_×Ö·û´®Æ¥Åä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			String flag = "true";
			for(int i = 0;i < str1.length();i++) {
				if(!str2.contains(str1.charAt(i)+"")) {
					flag = "false";
					break;
				}else {
					flag = "true";
				}
			}
			System.out.println(flag);
		}
		sc.close();
	}

}
