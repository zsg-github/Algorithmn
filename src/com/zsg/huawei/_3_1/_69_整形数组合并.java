package com.zsg.huawei._3_1;
import java.util.Scanner;
import java.util.TreeSet;

public class _69_整形数组合并 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			TreeSet<Integer> set = new TreeSet<>();
			for(int i = 0; i < m; i++) {
				set.add(sc.nextInt());
			}
			int n = sc.nextInt();
			for(int i = 0; i < n;i++) {
				set.add(sc.nextInt());
			}
			StringBuilder str = new StringBuilder();
			for(int i : set) {
				str.append(i);
			}
			System.out.println(str);
			
		}
		sc.close();
	}

}
