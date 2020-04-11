package com.zsg.huawei._动态规划;
/**
 * 动态规划
 * 状态定义：dp[i]是以nums[i]结尾的最大连续子序列和(nums是整个序列)
 *比如：
 *
 */
public class _最大连续子序列和 {
	public static void main(String[] args) {
		
	}
	public static int maxSubArray2(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int dp = nums[0];
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			if(dp <= 0) {
				dp = nums[i];
			}else {
				dp =  + nums[i];
			}
			max = Math.max(dp, max);
		}
		return max;
	}
	public static int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int max = 0;
		for(int i = 0; i < dp.length; i++) {
			int prev = dp[i -1];
			if(prev <= 0) {
				dp[i] = nums[i];
			}else {
				dp[i] = prev + nums[i];
			}
			max = Math.max(dp[i], max);
		}
		return max;
	}
}
