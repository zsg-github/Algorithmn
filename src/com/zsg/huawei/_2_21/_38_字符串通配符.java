package com.zsg.huawei._2_21;

import java.util.Scanner;

public class _38_×Ö·û´®Í¨Åä·û {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			str1 = str1.replace("?","[0-9a-zA-Z]{1}");
            str1= str1.replace("*","[0-9a-zA-Z]*");
            System.out.println(str2.matches(str1));
		}
		sc.close();
	}
}
