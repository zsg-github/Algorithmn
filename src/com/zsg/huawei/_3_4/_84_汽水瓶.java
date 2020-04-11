package com.zsg.huawei._3_4;

import java.util.Scanner;

public class _84_ÆûË®Æ¿ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			int count = 0;
			while(num > 2) {
				 int n = num / 3;
				 int m = num % 3;
				 count = count + n;
				 num = num / 3 + m;
				 if(num == 2) {
					 count = count + 1;
				 }
				 
			}
			
			System.out.println(count);
		}
		sc.close();
	}

}
