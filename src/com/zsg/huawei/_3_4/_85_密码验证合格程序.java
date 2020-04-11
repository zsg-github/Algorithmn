package com.zsg.huawei._3_4;

import java.util.Scanner;

public class _85_密码验证合格程序 {
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
		if(str.length() <= 8) return "NG";  //我的错误：超过八个是大于8
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
		//判断3的字串是否有相等 从小开始判断，因为小重复子字符不存在，大的就更不存在
		for(int i = 0; i< str.length() - 3; i++) {
			if(str.substring(i +1).contains(str.substring(i,i+3))) {
				return "NG";
			}
		}
		return "OK";
	}

}
