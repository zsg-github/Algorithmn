package com.zsg.huawei._3_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _88_字符串合并处理 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			String str = str1 + str2;
			char[] arr = str.toCharArray();
			List<Character> listEven = new ArrayList<>();
			List<Character> listOdd = new ArrayList<>();
			for(int i = 0; i < arr.length; i++) {
				char chs = arr[i];
				if(i % 2 == 0) {
					listEven.add(chs);
				}else {
					listOdd.add(chs);
				}
			}
			Object[] ch1 = listEven.toArray();
			Object[] ch2 = listOdd.toArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int len = ch1.length > ch2.length ? ch1.length : ch2.length;
			int i = 0;
			int j = 0;
			StringBuilder s = new StringBuilder();
			while(i  < len) {
				if(i < ch1.length) s.append(ch1[i]);
				if(j < ch2.length) s.append(ch2[j]);
				i++;
				j++;
			}
			//BIT倒序
			char[] ch = s.toString().toCharArray();
			for(int m = 0; m < ch.length; m++) {
				char c = ch[m];
				int in = 0;
				if(c >= '0' && c <= '9') {
					in = c -'0';
					ch[m] = BitReverse(in);
				}else if(c >= 'A' && c <= 'F') {
					in = c -'A' + 10;
					ch[m] = BitReverse(in);
				}else if(c >= 'a' && c <= 'f') {
					in = c -'a' + 10;
					ch[m] = BitReverse(in);
				}
				
			}
			StringBuilder result = new StringBuilder();
			for(char c : ch) {
				result.append(c);
			}
			System.out.println(result);	 
		}
		sc.close();
	}
	
	static char BitReverse(int in) {
		char c;
		String bs = Integer.toBinaryString(in);
		bs = "000" + bs;
		StringBuilder sb = new StringBuilder(bs);
		sb.reverse();
		String temp = sb.substring(0,4);
		int num = Integer.parseUnsignedInt(temp, 2);
		if(num > 9) c = (char) ((num - 10) + 'A');
		else c = (char)(num + '0');
		return c;
		
		
	}

}
