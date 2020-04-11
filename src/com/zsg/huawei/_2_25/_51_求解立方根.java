package com.zsg.huawei._2_25;

import java.util.Scanner;

public class _51_求解立方根 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double input = sc.nextDouble();
			//二分查找
			double root = divideSearch(input);
			//牛顿迭代法
			//double root1 = getCubeRoot(input);
			System.out.printf("%.1f",root);
//			System.out.printf("%.1f",root1);
		}
		sc.close();
	}
	
	public static double divideSearch(double input) {
		double x = 1.0;
		for(; Math.abs(x*x*x - input) > 1e-9; x = x - (x*x*x - input)/(3 * x * x));
		return x;
		
	}
	
	public static double getCubeRoot(double input) {
		double min = 0;
		double mid = input /2;
		double max = input;
		while((max - min) > 0.001) {
			if(mid * mid * mid > input) {
				max = mid;
			}else if(mid * mid * mid < input) {
				min = mid;
			}else {
				return mid;	
			}
			mid = (min + max) / 2;
		}
		return min;
	}

}
