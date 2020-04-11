package com.zsg.huawei._3_5;

import java.util.Scanner;

public class _89_×Ö·û´®½âÃÜ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			encryptChar(str1);
			decodeChar(str2);
			
		}
		sc.close();
	}
	
	static void encryptChar(String str) {
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length;i++) {
			char ch = arr[i];
			if(ch >= '0' && ch <= '9') {
				if(ch == '9') {
					arr[i] = '0';
				}else {
					arr[i] = (char) (ch + 1);
				}
				
			}else if(ch >= 'A' && ch <= 'Z') {
				if(ch == 'Z') {
					arr[i] = 'a';
				}else {
					arr[i] = Character.toLowerCase((char) (ch + 1));
				}
				
			}else {
				if(ch == 'z') {
					arr[i] = 'A';
				}else {
					arr[i] = Character.toUpperCase((char) (ch + 1));
				}
				
			}
		}
		StringBuilder s = new StringBuilder();
		for(char i : arr) {
			s.append(i);
		}
		System.out.println(s);
		
	}
	
	static void decodeChar(String str) {
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length;i++) {
			char ch = arr[i];
			if(ch >= '0' && ch <= '9') {
				if(ch == '0') {
					arr[i] = '9';
				}else {
					arr[i] = (char) (ch - 1);
				}
				
			}else if(ch >= 'A' && ch <= 'Z') {
				if(ch == 'A') {
					arr[i] = 'z';
				}else {
					arr[i] = Character.toLowerCase((char) (ch - 1));
				}
				
			}else {
				if(ch == 'a') {
					arr[i] = 'Z';
				}else {
					arr[i] = Character.toUpperCase((char) (ch - 1));
				}
				
			}
		}
		StringBuilder s = new StringBuilder();
		for(char i : arr) {
			s.append(i);
		}
		System.out.println(s);
		
	}
}
