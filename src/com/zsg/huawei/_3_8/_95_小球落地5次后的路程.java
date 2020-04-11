package com.zsg.huawei._3_8;

import java.util.Scanner;

public class _95_小球落地5次后的路程 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			float h = sc.nextFloat();
			float s = h;
			for(int i = 0; i< 4;i++) {
				s = s + h;
				h = h /2;
			}
			System.out.println(s);
			System.out.println(h/2);
		}
		sc.close();
	}

}
