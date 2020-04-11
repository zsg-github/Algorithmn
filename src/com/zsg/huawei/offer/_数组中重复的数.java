package com.zsg.huawei.offer;

import java.util.HashMap;
import java.util.Scanner;

public class _数组中重复的数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int[] arr = new int[m];
			for(int i = 0; i < m; i++) {
				arr[i] = sc.nextInt();
			}
			//数组中任意一个重复的数
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int i = 0; i < arr.length; i++) {
				if(map.containsKey(arr[i])) {
					System.out.println(arr[i]);
					break;
				}else {
					map.put(arr[i], 1);
				}
			}
		}
		sc.close();
	}
}
