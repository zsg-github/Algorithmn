package com.zsg.huawei._2_23;

import java.util.Scanner;

public class _43_�ַ������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();  //��Կ,СдΪ��׼
			String str2 = sc.next();
			StringBuilder comp = new StringBuilder();
			StringBuilder encrypt = new StringBuilder();
			//ȥ��
			for(int i= 0; i < str1.length(); i++) {
				if(!comp.toString().contains(str1.charAt(i)+"")) {
					comp.append(str1.charAt(i));
				}
				
			}
			//��ȫ
			for(int i = 0; i < 26; i++) {
				char ch = (char)('a'+i);
				if(!comp.toString().contains(ch+"")) {
					comp.append(ch);
				}
			}
			for(int i = 0; i< str2.length(); i ++) {
				//����str2�ҳ�ÿ���ַ�����ĸ���λ�ã���Сд��ʹ��flag���֪���д
				Boolean flag = false;
				char ch = str2.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					ch = (char)(ch + ('a' - 'A'));
					flag = true;
				}
				int index = ch - 'a';
				//����λ���ҳ���Ӧ��comp�е��ַ�(������Сд)
				char c = comp.toString().charAt(index);
				if(flag) {
					c= Character.toUpperCase(c);
				}
				encrypt.append(c);	
			}
			
			
			System.out.println(encrypt.toString());
		}
		sc.close();
	}
}
