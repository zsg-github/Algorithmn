package com.zsg.huawei._2_21;

public class _正则表达式 {
	public static void main(String[] args) {
		String str1 = "te?t.[a-z]*\\?";  //？表示一个0,1  * 0，任意
		String str2 = "tt.xls?";
		System.out.println(str2.matches(str1));
		
	}

}
