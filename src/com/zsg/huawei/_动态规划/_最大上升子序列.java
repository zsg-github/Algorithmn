package com.zsg.huawei._动态规划;
/**
 * 最长上升子序列（lis)
 * 给定一个无序的整数序列，求出它最长上升子序列的长度(要求严格上升)
 * dp[i]是以nums[i]结尾的最长上升子序列的长度，初始值为1
 *
 */
public class _最大上升子序列 {
	public static void main(String[] args) {
		int[] str = {10,2,2,5,1,7,101,18};
		int m  = lengthOfIS(str);
		System.out.println(m);
		
	}
	static int lengthOfIS(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int[] dp = new int[nums.length];
		int max = dp[0] = 1;
		for(int i = 0; i < dp.length; i++) {
			dp[i] = 1;       //dp[i]是以nums[i]结尾的最长上升子序列的长度，初始值为1
			for(int j = 0; j < i;j++) {  //找位置i之前的每个元素并且以这个元素结尾的最长上升子序列的长度，
				if(nums[i] <= nums[j]) continue;  //如果之前的元素大于位置i的元素，则不构成上升，则跳过。
				dp[i] = Math.max(dp[i],dp[j] + 1);  //否则的话找到位置i的元素之前的最大子序列，并加1
			}
			max = Math.max(dp[i], max);
		}
		return max;
	}
		

}
