package com.zsg.huawei._�漰��̬�滮����Ŀ;

import java.util.Scanner;

public class _57_���������ַ����е�������Ӵ� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			//�ȱȽϳ��϶̵��ַ���
			if(str1.length() > str2.length()) {
				String temp = str1;
				str1 = str2;
				str2 = temp;
			}
			System.out.println(getSubString(str1,str2));
		}
		sc.close();
	}
	
	//�ڶ̵��ַ����Ͻ�ȡ���е��ַ���ȥƥ�䳤���ַ���
	public static String getSubString(String str1,String str2) {
		String temp;
		for(int i = str1.length(); i > 0; i--) {
			for(int j = 0; j <= str1.length() - i; j++) {
				temp = str1.substring(j,j + i);
				if(str2.contains(temp)) {
					return temp;
				}
			}
		}
		return "û�й����ַ���";
	}
}
