package com.zsg.huawei.offer;

import java.util.Scanner;

public class _和为S的数字 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int sum = sc.nextInt();
			int[] arr = new int[m];
			for(int i = 0; i < m; i++) {
				arr[i] = sc.nextInt();
			}
			int[][] cp = new int[m/2][2];
			int start = 0;
			int end = arr.length - 1;
			int index = 0;
			while(start < end) {
				if(arr[start] + arr[end] == sum) {
					cp[index][0] = start;
					cp[index][1] = end;
					index++;
					start++;
					end --;
					break;
				}else if(arr[start] + arr[end] < sum) {
					start ++;
					break;
				}else if(arr[start] + arr[end] > sum) {
					end --;
				}
				
			}
			if(arr.length > 1) {
				int minValue = cp[0][0] * cp[0][1];
				int position = 0;
				for(int i =1; i < cp.length; i++) {
					if(cp[i][0] * cp[i][1] < minValue) {
						position = i;
					}
				}
				System.out.println(arr[cp[position][0]] +" " + arr[cp[position][1]]);
				
			}else {
				System.out.println("-1");
			}
		}
		sc.close();
	}

}
