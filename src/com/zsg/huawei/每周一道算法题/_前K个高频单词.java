package com.zsg.huawei.ÿ��һ���㷨��;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _ǰK����Ƶ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int k = sc.nextInt();
			String str = sc.next();
			char[] arr = str.toCharArray();
			//����һ��HashMap���Ԫ�غ͸�����
			Map<Character,Integer> map = new HashMap<>();
			for(int i = 0; i < arr.length; i++) {
				map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
				}
			//ʹ����С�ѽ�������
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
			//�Ӵ�С��������
			List<Character> list = new ArrayList<>();
			while(!queue.isEmpty()) {
				list.add(0,queue.poll());
			}
			System.out.println(list);
		}
		sc.close();
	}

}
