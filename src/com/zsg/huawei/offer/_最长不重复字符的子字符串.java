package com.zsg.huawei.offer;
import java.util.Scanner;
public class _����ظ��ַ������ַ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char[] chArr = str.toCharArray();
			//����һ����������µ��ַ���λ��
			int[] indexArr = new int[26];
			for(int i = 0; i < 26; i++) {
				indexArr[i] = -1;
			}
			int maxLen = 1;
			//����״̬dp[i]Ϊ��λ��Ϊi��β���ַ���������ظ�����
			int[] dp = new int[chArr.length];
			//�߽�ֵ
			dp[0] = 1;
			indexArr[chArr[0]-'a'] = 0;
			//״̬ת�Ʒ���
			for(int i =1; i < chArr.length; i++) {
				int ch = chArr[i] -'a';
				if(indexArr[ch] == -1) {
					dp[i] = dp[i-1] +1;
				}else { //��i���ַ�֮ǰ���ֹ�
					//������ͬ�ַ��ľ���
					int d = i - indexArr[ch];
					if(d <= dp[i -1]) {
						dp[i] = d;
					}else {
						dp[i] = dp[i-1] + 1;
					}
					
				}
				//��ǳ��ֹ����ַ�
				indexArr[ch] = i;
				if(dp[i] > maxLen) {
					maxLen = dp[i];
				}
			}
			System.out.println(maxLen);
			
		}
		sc.close();
	}

}
