package com.zsg.huawei._2_25;

import java.util.Scanner;

public class _���n���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double n = sc.nextDouble();
			int  k = sc.nextInt();
			//���ַ����n����
			double x = binarySearch(n,k);
			
			System.out.printf("%.5f",x);
			System.out.println(String.format("%.5f", x));
		}
		sc.close();
	}

	private static double binarySearch(double n, int k) {
		double min = 0;
		double max = n;
		double mid = n /2;
		//���ȿ���,����min ���� max�м�
		while((max - min) > 0.0001) {
			// xn��numÿ�����ʼ��
			double xn = 1;
			int  num = k;
			while(num > 0) {
				xn = xn * mid;
				num --;
			}
			if(xn > n) {
				max = mid;
			}else if(xn < n) {
				min = mid;
			}else {
				return mid;
			}
			mid = (min + max) / 2;
			
		}
		//��������δ�ҵ�������������Χ�ڵ�
		return min;
	}

}
