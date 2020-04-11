package com.zsg.huawei.offer;
public class _有序合并两个有序的链表 {
	public static void main(String[] args) {
		ListNode k1 = new ListNode(1);
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(7);
		k1.next = n1;
		n1.next = n2;
		n2.next = n3;
		ListNode k2 = new ListNode(2);
		ListNode n12 = new ListNode(4);
		ListNode n22 = new ListNode(6);
		k2.next = n12;
		n12.next = n22;
		ListNode head = mergeTwoList(k1,k2);
		ListNode cur =head;
		while(cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
		
	}
	static ListNode mergeTwoList(ListNode k1,ListNode k2) {
		if(k1 == null) return k2;
		if(k2 == null) return k1;
		//虚拟头结点
		ListNode head = new ListNode(0); 
		ListNode cur = head;
		while(k1 != null && k2 != null) {
			if(k1.val <= k2.val) {
				cur.next = k1;
				k1 = k1.next;
			}else {
				cur.next = k2;
				k2 = k2.next;
			}
			cur = cur.next;
		}
		if(k1 == null) {
			cur.next = k2;
		}else {
			cur.next = k1;
		}
		return head.next;
	}
}
