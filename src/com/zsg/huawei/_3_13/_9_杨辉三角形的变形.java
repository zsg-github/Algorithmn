package com.zsg.huawei._3_13;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _9_杨辉三角形的变形 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long nums = sc.nextLong();
			if(nums <=2) {
				System.out.println(-1);
				break;
			}
			List<Integer> list = new LinkedList<>();
			list.add(1);
			list.add(1);
			list.add(1);
			while(nums -2 > 0) {
				list.add(0,0);
				list.add(0,0);
				list.add(0);
				list.add(0);
				List<Integer> temp = new LinkedList<>();
				for(int i = 0; i < list.size() -2; i++) {
					int sun = 0;
					for(int j = i; j <= i + 2; j++) {
						sun = sun +list.get(j);
					}
					temp.add(sun);	
				}
				list.clear();
				list.addAll(temp);
				nums--;
			}
			boolean flag = false;
			int index = 0;
			for(int i = 0; i < list.size();i++) {
				if(list.get(i) % 2 == 0) {
					flag = true;
					index = i;
					break;
				}
			}
			if(flag) {
				System.out.println(index + 1);
			}else {
				System.out.println(-1);
			}
		}
		sc.close();
		
	}

}
