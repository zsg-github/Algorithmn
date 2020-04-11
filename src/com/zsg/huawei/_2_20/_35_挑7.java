package com.zsg.huawei._2_20;

import java.util.Scanner;

public class _35_挑7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if(n > 30000) System.out.println("输入的正整数超出规定范围");
			int size = 0;
			for(int i = 7; i <= n; i++) {
				if(i % 7 == 0) {
					size ++;
				}else if(include7(i)){
					size ++;
				}
			}
			System.out.println(size);
		}
		scanner.close();
	}
	
	private static Boolean include7(int i) {
		while(i > 0) {
			if(i % 10 == 7) {
				return true;
			}
			i = i / 10;
		}
		return false;
	}

}
