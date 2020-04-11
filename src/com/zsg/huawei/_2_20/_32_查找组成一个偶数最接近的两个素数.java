package com.zsg.huawei._2_20;

import java.util.Scanner;

public class _32_查找组成一个偶数最接近的两个素数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int count =  n / 2;
			int primerNumber1 = count;
			int primerNumber2 = count;
			for(int i = 0; i < count; i++) {
				if(isPrimerNumber(primerNumber1) && isPrimerNumber(primerNumber2)) {
					break;
				}
				primerNumber1 --;
				primerNumber2 ++;
			}
			//两个不同的质数总有一个小于等于 n/2
//			for(int i =1; i <= n/2; i++) {  //等于号一定要，
//				if(isPrimerNumber(i) && isPrimerNumber(n -i)) {
//					//保存最大i成立，即两个质数最靠近
//					primerNumber1 = i;
//					primerNumber2 = n-i;
//				}
//			}
			//s输出需要小的在前面
			System.out.println(primerNumber1+"\n"+primerNumber2);
			
		}
		scanner.close();
	}
	
	//判断一个数知否时质数
	public static Boolean isPrimerNumber(int in) {
		if(in == 1 || in == 2) {
			return true;
		}
		for(int i= 2; i < in/2; i++) {
			if(in % i == 0) {
				return false;
			}
		}
		return true;
	}

}
