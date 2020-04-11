package com.zsg.huawei._3_5;

import java.util.Scanner;

/**
 *  mssqrgabgrqssm 不可以用求最长公共子串和字符串反转后对比子字符串的方法。
 * 动态截规划找两字符串的最长公共子串:简单的可以通过。中级的通不过。
 * 需要使用manacher算法
 *
 */
public class _87_密码截取 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			int len = lcs(str);
			System.out.println(len);
		}
		sc.close();
	}
	
	static int lcs(String str) {
		StringBuilder temp = new StringBuilder(str);
		String s = temp.reverse().toString();
		char[] nums1 = str.toCharArray();
		char[] nums2 = s.toCharArray();
		int[][] dp = new int[nums1.length + 1][nums2.length + 1];
		int max = 0;
		for(int i = 1; i <= nums1.length; i++) {
			for(int j = 1; j <= nums2.length;j++) {
				if(nums1[i -1] != nums2[j -1]) continue;
				dp[i][j] = dp[i - 1][j -1] + 1;
				max = Math.max(dp[i][j], max);
			}
		}
		return max;
	}
}
