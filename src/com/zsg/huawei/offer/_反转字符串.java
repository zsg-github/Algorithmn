package com.zsg.huawei.offer;

import java.util.Scanner;

public class _��ת�ַ��� {
	public static void main(String[] args) {
		//ԭ�ط�ת
		//1.�ȷ�ת�����ַ�����2�ٷ�ת�����ַ���
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			//�ȷ�ת�����ַ���
			reverse(sb,0,str.length() - 1);
			//�Էָ�����ת����
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
