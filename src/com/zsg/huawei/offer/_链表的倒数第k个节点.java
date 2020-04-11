package com.zsg.huawei.offer;

public class _链表的倒数第k个节点 {
	 public ListNode FindKthToTail(ListNode head,int k) {
		 if(head == null || k == 0) return null;
		//相隔k的两个指针遍历链表，早出发的一个若到达终端，晚到的就是倒数K个节点了
		 ListNode first = head;
		 ListNode secondCur = head;
		 while(k-1 >0) {
			 first = first.next;
			 k--;
		 }
//		 while(k -1 > 0) {
//			 if(first.next != null) {
//				 first = first.next;
//			 }else {
//				 return null;
//			 }
//			 k--;
//		 }
		 ListNode firstCur = first;
		 ListNode node = null;  //这一步刚好把大于链表大小的倒数给排除了
		 while(firstCur != null) {
			 firstCur = firstCur.next;
			 //需要把前一个数存起来
			 node = secondCur;
			 secondCur = secondCur.next;
		 }
		return node;

	    }
}
