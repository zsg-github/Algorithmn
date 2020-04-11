package com.zsg.huawei.每周一道算法题;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _前K个高频单词 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int k = sc.nextInt();
			String str = sc.next();
			char[] arr = str.toCharArray();
			//定义一个HashMap存放元素和个数、
			Map<Character,Integer> map = new HashMap<>();
			for(int i = 0; i < arr.length; i++) {
				map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
				}
			//使用最小堆进行排序
			PriorityQueue<Character> queue = new PriorityQueue<>(new Comparator<Character>() {

				@Override
				public int compare(Character o1, Character o2) {
					// TODO Auto-generated method stub
					return map.get(o1) - map.get(o2);
				}
				
			});
			for(Character ch : map.keySet()) {
				if(queue.size() < k) {
					queue.offer(ch);
				}else {
					if(map.get(ch) > map.get(queue.peek())) {
						queue.poll();
						queue.offer(ch);
					}
				}
			}
			//从大到小继续排序
			List<Character> list = new ArrayList<>();
			while(!queue.isEmpty()) {
				list.add(0,queue.poll());
			}
			System.out.println(list);
		}
		sc.close();
	}

}
