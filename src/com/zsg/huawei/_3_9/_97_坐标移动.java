package com.zsg.huawei._3_9;

import java.util.Scanner;

public class _97_×ø±êÒÆ¶¯ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] arr = str.split(";");
			int X = 0; //xÖá
			int Y = 0; //yÖá
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].matches("^[ASDW]{1}[0-9]{1,2}")) {
					char direct = arr[i].charAt(0);
					String step = arr[i].substring(1);
					int len = Integer.parseInt(step);
					if(direct == 'A') X = X - len;
					if(direct == 'D') X = X + len;
					if(direct == 'S') Y = Y - len;
					if(direct == 'W') Y = Y + len;
 				}
			}
			System.out.println(X + "," + Y);
		}
		sc.close();
		
	}

}
