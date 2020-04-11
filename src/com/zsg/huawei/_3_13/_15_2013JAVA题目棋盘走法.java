package com.zsg.huawei._3_13;

import java.util.Scanner;

public class _15_2013JAVA题目棋盘走法 {
	private static int nums =0;
	private static int m =0;
	private static int n =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			 m = sc.nextInt();
			 n = sc.nextInt();
			 nums = 0;
			 track(0,0);
			System.out.println(nums);
		}
		sc.close();
	}

	private static void track(int i, int j) {
		if(i == m && j == n) {
			nums++;
		}
		if(i <= m) {
			track(i+1,j);
		}
		if(j <= n) {
			track(i,j+1);
		}
	}

}
