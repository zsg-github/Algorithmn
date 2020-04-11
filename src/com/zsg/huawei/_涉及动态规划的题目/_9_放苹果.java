package com.zsg.huawei._涉及动态规划的题目;

import java.util.Scanner;

/**
 * 动态规划
 * 分两种情况
 * 1.苹果数量m < n,那么n-m个盘子对放置方式没有影响
 * 2.苹果数量m >= n 又分两种情况讨论
 *   a.至少有一个空盘子： m个苹果分在n-1个盘子里
 *   b.没有空盘子：说明每个盘子至少有一个，把同时有的一个拿走不影响结果即m- n个苹果放在n个盘子上
 * @author zsg
 *
 */

public class _9_放苹果 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int apple = sc.nextInt();
			int cup = sc.nextInt();
			int ways = getWays(apple,cup);
			System.out.println(ways);
		}
		sc.close();
	}

	private static int getWays(int apple, int cup) {
		//定义状态数组 dp[i][j] b表示有i个苹果放在j个盘子的方法
		int[][] dp = new int[apple+1][cup +1];
		//边界条件
		for(int i = 0; i <= apple; i++) {
			dp[i][0] = 1;
			dp[i][1] = 1;
		}
		for(int j = 0; j <= cup; j++) {
			dp[0][j] = 1;
			dp[1][j] = 1;
		}
		//状态转移方程
		for(int i = 2; i <= apple; i++) {
			for(int j = 2; j <= cup; j++) {
				if(i < j) {
					dp[i][j] = dp[i][j - 1];
				}else {
					dp[i][j] = dp[i - j][j] + dp[i][j -1];
				}
			}
		}
		return dp[apple][cup];
	}

}
