package com.zsg.huawei._2_24;

import java.util.Scanner;

public class _47_���ξ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int start = 1;
			for(int i = 1; i <= n; i++) {
				int temp = start;
				for(int j = i+1; j <= n+1; j++) {
					//��ʱ���һ��
					System.out.print(temp+" ");
					temp = temp + j;
				}
				System.out.println();
				start = start + i;
			}
		}
		sc.close();
	}

}
