package com.zsg.huawei._2_26;

import java.util.Scanner;

public class _56_¾ä×ÓÄæÐò {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		String[] strArray = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i = strArray.length -1; i >0 ;i--) {
			sb.append(strArray[i]+" ");
		}
		sb.append(strArray[0]);
		System.out.println(sb.toString());	
	}
}
