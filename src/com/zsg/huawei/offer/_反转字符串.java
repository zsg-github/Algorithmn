package com.zsg.huawei.offer;

import java.util.Scanner;

public class _反转字符串 {
	public static void main(String[] args) {
		//原地反转
		//1.先反转整个字符串，2再反转单个字符串
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			//先反转整个字符串
			reverse(sb,0,str.length() - 1);
			//以分隔符反转单词
			int start = 0;
			int end = 0;
			for(int i = 0; i< sb.length(); i++) {
				if(sb.charAt(i) == ' ') {
					end = i - 1;
					reverse(sb,start,end);
					start = i + 1;
				}else if(i == sb.length() -1){
					reverse(sb,start,i);
				}
			}
			System.out.println(sb.toString());
			
		}
		sc.close();
	}
	
	static  void reverse(StringBuilder sb,int start, int end) {
		while(start < end) {
			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			start++;
			end --;
		}
	}

}
