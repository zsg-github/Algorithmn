package com.zsg.huawei._3_4;

import java.util.Scanner;

public class _85_������֤�ϸ���� {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String result = isOk(str);
			System.out.println(result);
		}
		sc.close();
	}
	
	static String isOk(String str) {
		if(str.length() <= 8) return "NG";  //�ҵĴ��󣺳����˸��Ǵ���8
		int upperChars = 0;
		int lowerChars = 0;
		int numbers = 0;
		int otherChars = 0;
		boolean flag = false;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') upperChars = 1;
			else if(ch >= 'a' && ch <= 'z') lowerChars = 1;
			else if(ch >= '0' && ch <= '9') numbers = 1;
			else  otherChars = 1;
			if(upperChars + lowerChars+numbers + otherChars >= 3) {
				flag = true;
				break;
			}
		}
		if(!flag) return "NG";
		//�ж�3���ִ��Ƿ������ ��С��ʼ�жϣ���ΪС�ظ����ַ������ڣ���ľ͸�������
		for(int i = 0; i< str.length() - 3; i++) {
			if(str.substring(i +1).contains(str.substring(i,i+3))) {
				return "NG";
			}
		}
		return "OK";
	}

}
