package com.zsg.huawei.每周一道算法题;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _第K大的数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int k = sc.nextInt();
			PriorityQueue<Integer> queue =  new PriorityQueue<>();
			for(int i = 0; i < m; i++) {
				int num = sc.nextInt();
				if(i < k) {
					queue.add(num);
				}else {
					if(num > queue.peek()) {
						queue.poll();
						queue.add(num);
					}
				}
			}
			System.out.println(queue.peek());
		}
		sc.close();
	}

}
