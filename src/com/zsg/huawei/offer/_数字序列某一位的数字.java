package com.zsg.huawei.offer;

import java.util.Scanner;

public class _��������ĳһλ������ {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int num = 10;
			int count = 10;
			if(n < 10) {
				System.out.println(n + 1);
			}
			else {
				while(true) {
					count = count + String.valueOf(num).length();
					if(count >= n) break;
					num ++;	
				}
				if(count == n) {
					System.out.println(num % 10);
				}else {
					//nλ����num��ͷ
					String str = String.valueOf(num);
					int index = n - count +str.length();
					System.out.println(str.charAt(index));
				}

			}
		}
	}

}
