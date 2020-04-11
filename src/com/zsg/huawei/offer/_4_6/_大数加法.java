package com.zsg.huawei.offer._4_6;

import java.util.Scanner;
public class _大数加法 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String num1 = sc.next();
			String num2 = sc.next();
			int length = num1.length() > num2.length() ? num1.length() :num2.length();
			if(num1.length() < length) {
				while(num1.length() < length) num1 = '0'+num1;
			}else {
				while(num2.length() < length) num2 = '0'+num2;
			}
			char[] nums1 = num1.toCharArray();
			char[] nums2 = num2.toCharArray();
			int[] result = new int[length];
			boolean overFlow = false; //最高位是否 进位
			int takeOver = 0; //进位
			int sum = 0; // 和
			for(int i = length -1; i >=0; i--) {
				int n1 = nums1[i] - '0';
				int n2 = nums2[i] - '0';
				sum = n1 + n2 + takeOver;
				if(sum >= 10) {
					if(i == 0) overFlow = true;
					takeOver = 1;
					result[i] = sum - 10;
				}else {
					takeOver = 0;  //更新进位
					result[i] = sum;
				}
			}
			StringBuilder sb = new StringBuilder();
			if(overFlow) sb.append(1);
			for(int c : result) {
				sb.append(c);	
			}
			System.out.println(sb.toString());
			
		}
		sc.close();
		
	}

}
