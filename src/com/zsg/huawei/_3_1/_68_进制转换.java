package com.zsg.huawei._3_1;

import java.util.Scanner;

public class _68_½øÖÆ×ª»» {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			
			int value = Integer.parseInt(str.substring(2),16);
			System.out.println(value);
			
			
			
			char[] ch = str.toCharArray();
			int count = 0;
			for(int i = 2; i <  ch.length;i++) {
				int num =0;
				if(ch[i] >= '0' && ch[i] <= '9') {
					num = ch[i] - '0';
				}else {
					 num = ch[i] - 'A' + 10;
				}
				count = count * 16 + num;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
