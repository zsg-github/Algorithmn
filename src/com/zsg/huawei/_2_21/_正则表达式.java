package com.zsg.huawei._2_21;

public class _������ʽ {
	public static void main(String[] args) {
		String str1 = "te?t.[a-z]*\\?";  //����ʾһ��0,1  * 0������
		String str2 = "tt.xls?";
		System.out.println(str2.matches(str1));
		
	}

}
