package com.zsg.huawei.offer;

import java.util.Scanner;

public class _不用运算符号的加减 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = 0;
			int carry = 0;
			while(num2 != 0) {
//				num1 = num1 ^ num2;  减法
//				num2 = (num1 & num2) << 1;	
				sum = num1 ^ num2;
				carry = (num2 & num1) << 1;
				num1 = sum;
				num2 = carry;
			}
			System.out.println(num1);
		}
		sc.close();
	}

}
