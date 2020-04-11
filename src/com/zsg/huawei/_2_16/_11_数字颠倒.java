package com.zsg.huawei._2_16;

import java.util.Scanner;

public class _11_Êý×Öµßµ¹ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            System.out.println(sb.toString());
        }
		sc.close();
	}
}
