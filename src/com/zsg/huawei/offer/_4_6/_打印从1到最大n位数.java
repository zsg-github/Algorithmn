package com.zsg.huawei.offer._4_6;

import java.util.Scanner;

/**
 * ���Ǵ���
 * @author Lenovo
 *
 */
public class _��ӡ��1�����nλ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n < 1) {
				break;
			}
			int[] number = new int[n];
			int index = 0;
			int length = n; //�ݹ��������
			print1ToMax(number,index, length);
			
		}
		sc.close();
	}

	private static void print1ToMax(int[] number, int index, int length) {
		if(index == length) {
			printNumber(number);
			return;
		}
		for(int i = 0; i < 10; i++) {
			number[index] = i;
			print1ToMax(number,index + 1,length);
		}
		
	}

	private static void printNumber(int[] number) {
		boolean flag = false;
		String str= "";
		for(int i = 0; i < number.length ;i ++) {
			if(number[i] != 0) flag = true; 
			if(flag) {
				while(i < number.length) {
					str  = str + number[i];
					i++;
				}
				System.out.println(str);
				return;
			}
		}

		
	}

}
