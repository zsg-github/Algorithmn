package com.zsg.huawei.offer._4_6;

import java.util.Scanner;

public class _股票的最大利润 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n  = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			//寻找数组的最大差
			int min = arr[0];
			int maxCurrent = 0;
			for(int i = 1; i < n; i++) {
				if(arr[i] < min)  
					min = arr[i];
				int value = arr[i] - min;
				if(value > maxCurrent)
					maxCurrent = value;
			}
			System.out.println(maxCurrent);
		}
		sc.close();
	}
	 public int maxProfit(int[] arr) {
		 	//边界值处理
		 	if(arr.length == 0 || arr.length == 1) return 0; 
	        //寻找数组的最大差
				int min = arr[0];
				int maxCurrent = 0;
				for(int i = 1; i < arr.length; i++) {
					if(arr[i] < min)  
						min = arr[i];
					int value = arr[i] - min;
					if(value > maxCurrent)
						maxCurrent = value;
				}
	            return maxCurrent;

	    }
}
