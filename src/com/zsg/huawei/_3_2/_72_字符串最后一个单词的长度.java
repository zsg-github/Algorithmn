package com.zsg.huawei._3_2;

import java.util.Scanner;

public class _72_�ַ������һ�����ʵĳ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
//			String[] arr = str.split(" ");
//			int length = arr[arr.length -1].length();
			int length  = str.length()- 1 - str.lastIndexOf(' ');
			System.out.println(length);
		}
		sc.close();
	}
}
