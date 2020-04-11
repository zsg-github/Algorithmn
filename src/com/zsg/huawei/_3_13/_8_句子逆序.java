package com.zsg.huawei._3_13;

import java.util.Scanner;
import java.util.Stack;

public class _8_¾ä×ÓÄæÐò {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			System.out.println(sb.toString());
		}
		sc.close();
	}

}
