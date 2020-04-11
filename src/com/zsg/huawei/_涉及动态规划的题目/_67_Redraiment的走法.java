package com.zsg.huawei._涉及动态规划的题目;
import java.util.Scanner;

//算法：最长上升子序列

public class _67_Redraiment的走法 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int count = lengthOfIs(arr);
			System.out.println(count);
		}
		sc.close();
	}	
	static int lengthOfIs(int[] nums) {
		if(nums == null || nums.length ==0) return 0;
		int[] dp = new int[nums.length];
		int max = dp[0] = 1;
		for(int i = 1; i < dp.length; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(nums[i] <= nums[j]) continue;
				dp[i] = Math.max(dp[i],dp[j]+1);
			}
			max = Math.max(dp[i], max);
		}
		return max;
		
	}
}
	
	
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
//			int n = sc.nextInt();
//			int[] arr = new int[n];
//			for(int i = 0; i < n; i++) {
//				arr[i] = sc.nextInt();
//			}
//			int max = 0;
//			//没去重
//			for(int i = 0; i < n - 1; i++) {
//				int temp = 1;
//				List<Integer> list = new ArrayList<>();
//				/**
//				 * 2 2 101 7 15 18 不能跳过101算 2 7 15 18
//				 */
//				int len = arr[i];
//				for(int j = i + 1; j < n;j++) {
//					if(arr[j] > len && !list.contains(len)) {
//						temp ++;
//						list.add(arr[j]);
//						len = arr[j];
//					}
//				}
//				if(temp > max) {
//					max = temp;
//				}
//			}
//			System.out.println(max);
//		}
//		sc.close();
//		
//	}
