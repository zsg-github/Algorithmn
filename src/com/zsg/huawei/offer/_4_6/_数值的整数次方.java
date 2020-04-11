package com.zsg.huawei.offer._4_6;

public class _数值的整数次方 {
	public static void main(String[] args) {
		System.out.println(Power(0,-1));
	}
	
	public static double Power(double base, int exponent) {
		//double数字高进度之间的相等
		if(equal(base,0.0) && exponent < 0) return 0.0;
		if(base == 0) return 0.0;
		if(exponent == 0) return 1.0;
		boolean flag = false;
		if(exponent < 0) flag = true;
		int exp = Math.abs(exponent);
		double result = powerWithUnsingn(base,exp);
//		while(exp > 0) {
//			result = result * base;
//			exp --;
//		}
		if(flag) result = 1 / result;
		return result;
	}

	private static double powerWithUnsingn(double base, int exponent) {
		if(exponent == 1) return base;
		if(exponent == 0) return 1;
		double result = powerWithUnsingn(base,exponent >>1); //除以2 是>>1
		result = result * result;
		if((exponent % 2) == 1 ) {
			result = result * base;
		}
		return result;
	}

	private static boolean equal(double base, double d) {
		if(Math.abs(base - d) < 0.00001) return true;
		return false;
	}
}
