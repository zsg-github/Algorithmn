package com.zsg.huawei.offer;

import java.util.Scanner;

public class _쳲��������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			//�ݹ鷽ʽ
//			int calculate1 = fib1(n);
//			System.out.println(calculate1);
			//��̬�滮
			int calculate2 =fib2(n);
			System.out.println(calculate2);
		}
		sc.close();
	}
	//�ݹ�
	static int fib1(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fib1(n-1) + fib1(n -2);
	}
	//��̬�滮
	static int fib2(int n) {
		//����״̬ dp[i]��ʾi��쳲�������ֵ
		int[] dp = new int[n+1];
		//�߽�����
		dp[0] = 0;
		dp[1] = 1;
		//״̬ת�Ʒ���
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i -1] + dp[i-2];
		}
		return dp[n];
		
	}

}
