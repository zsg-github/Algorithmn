package com.zsg.huawei.offer;

import java.util.HashMap;
import java.util.Scanner;

public class _�������ظ����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int[] arr = new int[m];
			for(int i = 0; i < m; i++) {
				arr[i] = sc.nextInt();
			}
			//����������һ���ظ�����
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
