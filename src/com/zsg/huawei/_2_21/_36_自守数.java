package com.zsg.huawei._2_21;

import java.util.Scanner;

public class _36_������ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int size = 0;
			for(int i = 0; i <= n; i++) {
				if(isAutomorphicNumber(i)) {
					size ++;
				}
			
			}
			System.out.println(size);
		}
		scanner.close();
		
	}
	
	public static Boolean isAutomorphicNumber( int n)
	{
	/*������ʵ�ֹ���*/
		int n2 = n * n;
		while(n > 0) {
			if(n % 10 != n2 % 10) {
				return false;
			}
			n = n / 10;
			n2 = n2 / 10;
		}

	return true;
	}
}
