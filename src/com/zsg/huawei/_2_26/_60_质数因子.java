package com.zsg.huawei._2_26;

import java.util.Scanner;

public class _60_质数因子 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long input = sc.nextLong();
			System.out.println(getPrimerFactors(input));
		}
		sc.close();
	}
	
	public static String getPrimerFactors(long input) {
		StringBuilder str = new StringBuilder();
		while(input != 1) {
			for(int i = 2; i <= input; i++) {
				if(input % i == 0) {
					input = input / i;
					str.append(i + " ");
					break;
				}
			}
			
		}
		return str.toString();
	}

}
