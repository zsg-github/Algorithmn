package com.zsg.huawei._2_23;

import java.util.Scanner;

public class _44_计算字符串的距离 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println(calculateStringDistance(str1,str2));
		}
		sc.close();
	}
	
	public static  int  calculateStringDistance(String expressionA, String expressionB) {
		char[] ch1 = expressionA.toCharArray();
		char[] ch2 = expressionB.toCharArray();
		int m = ch1.length;
		int n = ch2.length;
		//定义转移矩阵
		int[][] dp = new int[m+1][n+1];
		//边界条件
		for(int i = 0; i <= m; i++) {
			dp[i][0] = i;
		}
		for(int j = 0; j <= n; j++) {
			dp[0][j] = j;
		}
		//状态方程
		for(int i = 1; i <= ch1.length;i++) {
			for(int j = 1; j <= ch2.length;j++) {
				//第i个字符对应字符数组ch[i - 1]
				if(ch1[i - 1] == ch2[j - 1]) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					dp[i][j] = Math.min(Math.min(dp[i - 1][j],dp[i][j-1]),dp[i - 1][j - 1])+1;
				}
			}
		}
		return dp[m][n];	
	}

}
