package com.zsg.huawei._3_3;

import java.util.Scanner;

public class _77_ɾ���ַ����г��ִ������ٵ��ַ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str= sc.nextLine();
			char[] ch = str.toCharArray();
			int[] nums = new int[26];
			for(int i = 0; i < ch.length; i++) {
				nums[ch[i] - 'a'] ++;
			}
			//��С�����ٵ��ַ�
			boolean flag = false;
			for(int i = 1;i<=10;i++) {
				if(flag) break;
				for(int j = 0; j < nums.length; j++) {
					if(nums[j] == i) {
						//���ٵ��ַ�����
						char c = (char) (j + 'a');
						//�ַ��滻�ַ����ַ����滻�ַ���
						str = str.replace(String.valueOf(c), "");
						flag = true;
					}
				}
			}
			System.out.println(str);
		}
		sc.close();
	}

}
