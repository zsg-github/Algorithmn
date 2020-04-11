package com.zsg.huawei._3_5;


import java.util.Scanner;

/**
 * 
两遍最长递增子序列，第一遍从左往右，第二遍从右往左，然后把两遍动态规划的结果相加，取最大的那个，
比如8 186 186 150 200 160 130 197 200，
第一遍dp的结果是 1 1 1 2 2 1 3 4，
第二遍dp的结果为3 3 2 3 2 1 1 1，那么相加最大是5，所以需要出列的同学
 *
 */

public class _91_合唱队 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			if(num == 2) System.out.println(0);
			int[] nums = new int[num];
			for(int i = 0; i < num; i++) {
				nums[i] = sc.nextInt();
			}
			//正反两次求该数组中每个元素的最长上升子序列
			//定义状态
			int[] dpl = new int[num]; 
			//定义边界
			dpl[0] = 1;
			int max = 1;
			//状态转移方程
			for(int i = 0; i < num; i++) {
				dpl[i] = 1;
				for(int j = 0;j < i; j++) {
					if(nums[j] < nums[i]) {
						dpl[i] = Math.max(dpl[i], dpl[j] + 1);
					}
					max = Math.max(dpl[i], max);
				}
			}
			//右往左遍历
			int[] dpr = new int[num];
			dpr[num -1] = 1;
			int maxr = 1;
			for(int i = num -1; i >=0; i--) {
				dpr[i] = 1;
				for(int j = num - 1; j > i; j--) {
					if(nums[i] <= nums[j]) continue;  //别忘了等于号
					dpr[i] = Math.max(dpr[i], dpr[j] + 1);
					maxr = Math.max(dpr[i], maxr);
				}
			}
		int MaxCount = 0;
		for(int i = 0; i < num; i++) {
			int temp = dpl[i] + dpr[i];
			if(temp > MaxCount) {
				MaxCount = temp;
			}
		}
		System.out.println(num - MaxCount +1);
			
		}
	}

}
