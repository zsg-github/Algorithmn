package com.zsg.huawei.ÿ��һ���㷨��;

import java.util.Comparator;
import java.util.PriorityQueue;
public class _�ϲ�K���������� {
	public ListNode mergeKList(ListNode[] lists) {
		//����һ����С��
		PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {
			public int compare(ListNode o1,ListNode o2) {
				return o1.val - o2.val;
			}
		});
		//��������׸��ڵ�
		for(ListNode node : lists) {
			heap.offer(node);
		}
		//ѭ����С���ѶѶ�Ԫ��ȡ����Ȼ���ȡ���Ľڵ��������һ���ڵ��Ž�ȥ��
		ListNode head =  new ListNode(0);
		ListNode cur = head;
		while(!heap.isEmpty()) {
			ListNode n = heap.poll();
			cur.next = n;
			cur = cur.next;
			//Ȼ���ȡ���Ľڵ��������һ���ڵ��Ž�ȥ��
			if(n.next != null) {
				heap.offer(n.next);
			}
		}
		return head.next;
	}
}
