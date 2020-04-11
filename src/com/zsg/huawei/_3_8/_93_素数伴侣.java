package com.zsg.huawei._3_8;

import java.util.Arrays;
import java.util.Scanner;

public class _93_ËØÊı°éÂÂ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			String[] arr = new String[m];
			for(int i = 0; i < m; i++) {
				arr[i] = sc.nextLine();
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
