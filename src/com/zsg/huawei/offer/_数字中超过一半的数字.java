package com.zsg.huawei.offer;

import java.util.Arrays;
import java.util.Scanner;

public class _�����г���һ������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			//����һֱ������ȡ�м���Ǹ���
//			Arrays.sort(arr);
//			System.out.println(arr[arr.length/2]);
			//������
			//�ж�û�д���һ�������
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
		//����������Ƿ��Ǵ���һ�����
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
