package com.zsg.huawei.offer;

public class _·´×ªÁ´±í {
	public ListNode ReverseList(ListNode head) {
		if(head == null) return null;
		if(head.next == null) return head;
		ListNode newHead = null;
		while(head != null) {
			ListNode temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
		}
		return newHead;
    }

}
