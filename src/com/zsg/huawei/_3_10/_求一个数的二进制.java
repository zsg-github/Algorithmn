package com.zsg.huawei._3_10;

import java.util.Scanner;

/**
 *  ���ֳ���2.������Ϊ�������������������̻�����2�����ơ�
 * @author zsg
 *
 */

public class _��һ�����Ķ����� {
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
				//��һ��������ȥ
				count++;
				num = num & (num -1);
			}
			System.out.println(count);
		}
		sc.close();
	}

}
