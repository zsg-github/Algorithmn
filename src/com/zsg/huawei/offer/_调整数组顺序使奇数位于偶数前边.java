package com.zsg.huawei.offer;

import java.util.Arrays;
import java.util.Scanner;
public class _调整数组顺序使奇数位于偶数前边 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int begin = 0;
			int end = arr.length - 1;
			while(begin < end) {
				while(begin < end) {
					if(arr[begin] % 2 ==0) begin++;
					else break;
				}
				while(begin < end) {
					if(arr[end] % 2 == 1) end --;
					else break;
				}
				if(begin < end) {
					int temp = arr[begin];
					arr[begin] = arr[end];
					arr[end] = temp;
					
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		sc.close();
	}

}
