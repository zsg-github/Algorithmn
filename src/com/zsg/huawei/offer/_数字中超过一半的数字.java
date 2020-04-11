package com.zsg.huawei.offer;

import java.util.Arrays;
import java.util.Scanner;

public class _数字中超过一半的数字 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			//方法一直接排序取中间的那个数
//			Arrays.sort(arr);
//			System.out.println(arr[arr.length/2]);
			//计数法
			//判断没有大于一半的数组
			System.out.println(MoreThanHalfNum_Solution(arr));
		}
		
	}
	public static int MoreThanHalfNum_Solution(int [] arr) {
        int result = arr[0];
		int times= 1;
		for(int i =1; i < arr.length; i++) {
			if(arr[i] == result) {
				times ++;
			}else {
				times--;
			}
			if(times == 0) {
				result = arr[i];
				times = 1;
			}
		}
		//检验这个数是否是大于一半的数
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == result) {
				count++;
			}
		}
		if(count > arr.length / 2) {
			return result;
		}
		return 0;
    }

}
