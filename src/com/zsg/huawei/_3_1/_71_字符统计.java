package com.zsg.huawei._3_1;

import java.util.Scanner;

public class _71_字符统计 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			//定义一个数组存大小写字母，数组，空格
			int[] count = new int[128];
			for(int i = 0; i < ch.length;i++) {
				if( (ch[i] >= 'a' && ch[i] <= 'z') 
				    || (ch[i] >= 'A' && ch[i] <= 'Z') ||(ch[i] >= '0' && ch[i] <= '9')|| ch[i] == ' ') {
					count[(int)ch[i]] ++;
					
				}
			}
				
			int num = count.length;
			StringBuilder s = new StringBuilder();
			while(num > 0) {
				int max = 0;
				int temp = 0;
				for(int i = 0; i< count.length; i++) {
					if(max < count[i]) {
						max = count[i];	
						temp = i;	
					}
				}
				//剩下为零的字符不予统计
				if(count[temp]!=0) {
					s.append((char) temp);	
					count[temp] = 0;
				}
				//已统计的字符个数设置为零
				num --;
			}
			System.out.println(s);
		}
		sc.close();
	}
}
