package com.zsg.huawei._动态规划;
/**
 * 连续的
 * dp[i][j]是以str1[i-1][j-1]结尾的最长公共子串长度
 *
 */

public class _最长公共子串 {
	public static void main(String[] args) {
		System.out.println(lcs("ABCD","BABC"));
		
	}
	static int lcs(String str1, String str2) {
		if(str1 == null || str2 == null) return 0;
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		int[][] dp = new int[chars1.length + 1][chars2.length+ 1];
		int max = 0;
		for(int i = 1; i <= str1.length();i++) {
			for(int j = 1; j <= str2.length();j++) {
				if(chars1[i - 1] != chars2[j - 1]) continue;
				dp[i][j] = dp[i -1][j - 1] + 1;
				max = Math.max(dp[i][j], max);
			}
		}
		return max;
	}

}
