package com.zsg.huawei._��̬�滮;
/**
 * ��̬�滮
 * ״̬���壺dp[i]����nums[i]��β��������������к�(nums����������)
 *���磺
 *
 */
public class _������������к� {
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
