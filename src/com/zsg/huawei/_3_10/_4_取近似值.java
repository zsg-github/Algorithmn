package com.zsg.huawei._3_10;

import java.util.Scanner;

public class _4_取近似值 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
//			String str = sc.next();
//			String[] arr = str.split("\\.");
//			float num = Float.parseFloat(arr[0]);
//			int m = arr[1].charAt(0) - '0';
//			if(m >= 5) {
//				num = num + 1;
//			}
			float f = sc.nextFloat();
			int num = (int) (f+0.5);
			System.out.println(num); //保留整数部分
		}
		sc.close();
	}

}
