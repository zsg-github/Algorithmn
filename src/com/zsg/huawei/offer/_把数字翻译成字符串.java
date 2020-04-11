package com.zsg.huawei.offer;

import java.util.Scanner;

/**
 * ��̬�滮
 * dp[i]��i��ʼ������ַ�������ɵ�����
 * ״̬ת�Ʒ���
 * dp[i-2] = dp[i - 1] + g(i-2,i-1)dp[i]
 *  * @author zsg
 *
 */

public class _�����ַ�����ַ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			int[] arr = new int[str.length()];
			for(int i = 0;i < str.length(); i++) {
				arr[i] = str.charAt(i) - '0';
			}
			if(arr.length == 1 || arr.length == 2) {
				if(arr.length == 1) System.out.println(1);
				else {
					if(Integer.parseInt(arr[arr.length - 2]+""+arr[arr.length -1])<26) {
						System.out.println(2);
					}else {
						System.out.println(1);
					}
				}
				
			}else {
				
				int[] dp = new int[arr.length];
				//�߽����
				dp[arr.length - 1] = 1; //һ���ַ�ֻ��һ�����
				if(Integer.parseInt(arr[arr.length - 2]+""+arr[arr.length -1])<26) {
					dp[arr.length - 2] = 2;
				}else {
					dp[arr.length - 2] = 1;
				}
				//ת�Ʒ���
				int g = 0;
				for(int i = arr.length - 3; i >=0; i--) {
					if(Integer.parseInt(arr[i]+""+arr[i +1]) < 26){
						g = 1;
					}else {
						g = 0;
					}
					dp[i] = dp[i + 1] + g* dp[i +2];
				}
				System.out.println(dp[0]);
			}
		}
		sc.close();
	}

}
