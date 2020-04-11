package com.zsg.huawei._3_10;

import java.util.Scanner;

/**
 *  数字除以2.余数作为二进制数的最右数。商基础除2。类推。
 * @author zsg
 *
 */

public class _求一个数的二进制 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			int count = 0;
			int temp;
//			while(num != 0) {
//				temp = num % 2;
//				//str = temp + str;
//				if(temp == 1) {
//					count ++;
//				}
//				num = num /2;
//			}
			while(num > 0) {
				//把一个整数减去
				count++;
				num = num & (num -1);
			}
			System.out.println(count);
		}
		sc.close();
	}

}
