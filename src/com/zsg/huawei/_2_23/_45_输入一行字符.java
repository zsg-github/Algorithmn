package com.zsg.huawei._2_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _45_����һ���ַ� {
	public static void main(String[] args) throws IOException {
		//��ȡһ�е��ַ����������ո��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
		String str ="";
		while((str = br.readLine()) != null) {
			int englishCharCount = 0;
			int blankCharCount = 0;
			int numberCharCount = 0;
			int otherCharCount = 0;
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					englishCharCount ++;
				}else if(ch == ' ') {
					blankCharCount ++;
				}else if((ch >= '0' && ch <= '9')) {
					numberCharCount ++;
				}else {
					otherCharCount ++;
				}
			}
			System.out.println(englishCharCount);
			System.out.println(blankCharCount);
			System.out.println(numberCharCount);
			System.out.println(otherCharCount);
		}
	}
}
