package com.zsg.huawei._动态规划;

public class _打家劫舍 {
	public static void main(String[] args) {
		int[] nums = {1 ,2, 3, 6};
		int value = rob(nums);
		System.out.println(value);
	}
	static int rob(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		if(nums.length ==1) return nums[0];
		//arr[i]表示 从第i号房子往前偷出来的最大金额
		int[] arr = new int[nums.length];
		//边界条件
		arr[0] = nums[1];
		arr[1] = Math.max(nums[0], nums[1]);
		//状态转移方程
		for(int i = 2; i < nums.length; i++) {
			//第i家偷与不偷
			arr[i] = Math.max(nums[i] + arr[i - 2], arr[i - 1]);
		}
		return arr[nums.length -1];
	}

}
