package com.zsg.huawei.每周一道算法题;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * 传入比较器可改变最小堆为最大堆，不够需要重新排序
 * @author zsg
 *
 */

public class _最小堆 {
	public static void main(String[] args) {
		int[] arr = {9,2,8,4,5,6,7};
		PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for(int i = 0 ; i< 3; i++) {
			heap.offer(arr[i]);
		}
		for(int j = 3; j < arr.length; j++) {
			if(arr[j] > heap.peek()) {
				heap.poll();
				heap.offer(arr[j]);
			}
		}
		System.out.println(heap);
	}

}
