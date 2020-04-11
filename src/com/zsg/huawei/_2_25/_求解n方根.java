package com.zsg.huawei._2_25;

import java.util.Scanner;

public class _求解n方根 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double n = sc.nextDouble();
			int  k = sc.nextInt();
			//二分法求解n方根
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
		//精度控制,根在min —— max中间
		while((max - min) > 0.0001) {
			// xn和num每次需初始化
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
		//如上面仍未找到根，则找在误差范围内的
		return min;
	}

}
