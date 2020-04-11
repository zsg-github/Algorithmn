package com.zsg.huawei.offer;

import java.util.Scanner;

public class _斐波那契数列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			//递归方式
//			int calculate1 = fib1(n);
//			System.out.println(calculate1);
			//动态规划
			int calculate2 =fib2(n);
			System.out.println(calculate2);
		}
		sc.close();
	}
	//递归
	static int fib1(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fib1(n-1) + fib1(n -2);
	}
	//动态规划
	static int fib2(int n) {
		//定义状态 dp[i]表示i的斐波那契数值
		int[] dp = new int[n+1];
		//边界条件
		dp[0] = 0;
		dp[1] = 1;
		//状态转移方程
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i -1] + dp[i-2];
		}
		return dp[n];
		
	}

}
