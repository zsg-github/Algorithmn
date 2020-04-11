package com.zsg.huawei._动态规划;

import java.util.Scanner;
/**
dp[i][j]思想：求解状态转移方程式：dp[i][j]表示：第一个i表示第一个字符串长度为i时与第二个字符串长度为j进行字符串相似度匹配，
给出初始化条件：dp[0][0]=0;dp[0][j]=j;dp[i][0]=i;
 */

public class _计算字符串的相似度 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println("1/"+(calculateStringDistance(str1,str2)+1));
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
