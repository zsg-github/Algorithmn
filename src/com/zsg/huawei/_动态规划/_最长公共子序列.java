 package com.zsg.huawei._动态规划;
/**
 * 不连续的子序列
 * @author zsg
 *
 */
public class _最长公共子序列 {
	public static void main(String[] args) {
		int len= lcs(new int[] {1,3,5,9,10},new int[] {1,4,9,10});
		System.out.println(len);
	}
	static int lcs(int[] nums1,int[] nums2) {
		if(nums1 == null || nums1.length == 0) return 0;
		if(nums2 == null || nums2.length == 0) return 0;
		int[][] dp = new int[nums1.length + 1][nums2.length +1];
		//边界条件都为零故无需设置默认就行
		for(int i = 1; i <= nums1.length; i++) {
			for(int j = 1; j <= nums2.length; j++) {
				if(nums1[i - 1] == nums2[j - 1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j -1]);
				}
			}
		}
		return dp[nums1.length][nums2.length];
	}
	
}
