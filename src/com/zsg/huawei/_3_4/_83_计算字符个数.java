package com.zsg.huawei._3_4;

import java.util.Scanner;

public class _83_¼ÆËã×Ö·û¸öÊý {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String str2 = sc.next();
			char[] ch = str2.toCharArray();
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(Character.toLowerCase(ch[0]) == str.charAt(i) 
						|| Character.toUpperCase(ch[0]) == str.charAt(i)) {
					count ++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
