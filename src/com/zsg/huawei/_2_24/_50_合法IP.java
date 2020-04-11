package com.zsg.huawei._2_24;
import java.util.Scanner;
public class _50_ºÏ·¨IP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] strArray = str.split("\\.");
			Boolean flag = true;
			for(int i = 0; i < strArray.length; i++) {
				if(!strArray[i].matches("\\d{1,3}") || Integer.parseInt(strArray[i]) > 255) {
					flag = false;
					//return;
					break;
				}
			}
			if(flag == true && strArray.length == 4) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
