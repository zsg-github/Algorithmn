package com.zsg.huawei._3_4;

import java.util.Scanner;

public class _82_�ַ����ָ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			if(str.length() % 8 != 0) {
				str = str + "00000000";
			}
			while(str.length() >= 8) {  //����©�˵���8��ʱ��
				String s = str.substring(0, 8);
				System.out.println(s);
				str = str.substring(8);
			}
		}
		sc.close();
	}

}
