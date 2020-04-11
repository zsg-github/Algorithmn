package com.zsg.huawei._3_10;

import java.util.Scanner;
import java.util.TreeSet;

public class _100_明明的随机数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			TreeSet<Integer> set = new TreeSet<>();
			for(int i = 0; i < n; i++) {
				set.add(sc.nextInt());
			}
			for(Integer num : set) {
				System.out.println(num);
			}
		}
		sc.close();
	}

}
