package com.zsg.huawei._3_2;

import java.util.Scanner;

public class _74_记负均证 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int count1 = 0;
			int count2 = 0;
			float m = 0;
			String str = sc.nextLine();
			String[] arr =str.split(" ");
			for(int i = 0;i < arr.length; i++) {
				int num = Integer.parseInt(arr[i]);
				if(num < 0) {
					count1++;
				}else {
					count2++;
					m = m + num;
				}	
				
			}
			System.out.println(count1);
			System.out.println(String.format("%.1f", m/count2));
			
		}
		sc.close();
	}

}
