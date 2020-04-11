package com.zsg.huawei._2_26;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _59_œﬂ–‘≤Â÷µ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<TreeMap<Integer,Integer>> list = new ArrayList<>();
			int preKey = sc.nextInt();
			int preValue = sc.nextInt();
			TreeMap<Integer,Integer> map1 = new TreeMap<>();
			map1.put(preKey, preValue);
			list.add(map1);
			for(int i = 1; i < m; i++) {
				int key = sc.nextInt();
				int value = sc.nextInt();
				if(key == preKey) continue;
				int gap = key - preKey;
				TreeMap<Integer,Integer> map = new TreeMap<>();
				if(gap > 1) {
					int num = (value - preValue) / gap;
					for(int j = 1; j < gap; j++) {
						map.put(preKey + j, preValue+ num * j);
					}
					map.put(key, value);
				}else{
					map.put(key, value);
				}
				list.add(map);
				preKey = key;
				preValue = value;
			}
			for(Map<Integer,Integer> map : list) {
				for(Integer key : map.keySet()) {
					System.out.println(key + " " + map.get(key));
				}
			}
		
		}
		sc.close();
	}
	

}
