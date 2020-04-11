package com.zsg.huawei.每周一道算法题;

import java.util.Comparator;
import java.util.PriorityQueue;
public class _合并K个有序链表 {
	public ListNode mergeKList(ListNode[] lists) {
		//定义一个最小堆
		PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {
			public int compare(ListNode o1,ListNode o2) {
				return o1.val - o2.val;
			}
		});
		//添加链表首个节点
		for(ListNode node : lists) {
			heap.offer(node);
		}
		//循环将小顶堆堆顶元素取出，然后把取出的节点的链表下一个节点存放进去。
		ListNode head =  new ListNode(0);
		ListNode cur = head;
		while(!heap.isEmpty()) {
			ListNode n = heap.poll();
			cur.next = n;
			cur = cur.next;
			//然后把取出的节点的链表下一个节点存放进去。
			if(n.next != null) {
				heap.offer(n.next);
			}
		}
		return head.next;
	}
}
