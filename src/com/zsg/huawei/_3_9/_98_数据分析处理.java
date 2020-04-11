package com.zsg.huawei._3_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * treeSet即可排序又可去重，有序的
 * @author zsg
 *
 */

public class _98_数据分析处理 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			String[] arrI = new String[m];
			for(int i = 0; i < m; i++) {
				arrI[i] = sc.next();
			}
			int n = sc.nextInt();
			Set<Integer> setR = new TreeSet<>();
			for(int i = 0; i < n; i++) {
				setR.add(sc.nextInt());
			}
			//开始遍历arrR
			StringBuilder str = new StringBuilder();
			for(Integer r : setR) {
				int value = 0;
				List<String> list = new ArrayList<>();
				for(int j = 0; j < arrI.length; j++) {
					if(arrI[j].contains(String.valueOf(r))) {
						value ++;
						list.add(j+" "+ arrI[j]);
					}	
				}
				if(value > 0) {
					str.append(" " + r);
					str.append(" " + list.size());
					for(int t = 0; t < list.size(); t++) {
						str.append(" " + list.get(t));
					}
				}
			}
			
			String[] strArray = str.toString().trim().split(" ");
			int count = strArray.length;
			System.out.println(count+ str.toString());
			
			
		}
		sc.close();
	}
}
