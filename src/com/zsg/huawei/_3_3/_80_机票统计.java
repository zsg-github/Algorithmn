package com.zsg.huawei._3_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _80_»úÆ±Í³¼Æ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
            Map<String,Integer> map = new LinkedHashMap<>();

			for(int i = 0; i < m;i++) {
			  map.put(sc.next(), 0);
			}
			int n = sc.nextInt();
			for(int i = 0; i < n;i++) {
				String candidate  = sc.next();
				if(map.containsKey(candidate)) {
					map.put(candidate, map.get(candidate)+1);
				}	
			}
			int count = 0;
			for(String key:map.keySet()) {
				count = count + map.get(key);
				System.out.println(key + " : " + map.get(key));
			}
			System.out.println("Invalid : " +(n - count));
		}
		sc.close();
	}
}
