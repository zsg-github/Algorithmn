package com.zsg.huawei.每周一道算法题;
import com.zsg.huawei.offer.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _List排序 {
	public static void main(String[] args) {
		Integer[] arr = {1 ,5 ,3};
		Arrays.sort(arr);
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
			
		});
		System.out.println(Arrays.toString(arr));
		List<ListNode> list = new ArrayList<>();
		list.add(new ListNode(0));
		list.add(new ListNode(5));
		list.add(new ListNode(3));
		Collections.sort(list,new Comparator<ListNode>() {

			@Override
			public int compare(

					ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o2.val - o1.val;
			}
			
		});
		
		for(ListNode node : list) {
			System.out.println(node.val);
		}
		//
		list.sort(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
			
		});
		for(ListNode node : list) {
			System.out.println(node.val);
		}
	}

}
