package com.zsg.huawei.offer;

public class _����ĵ�����k���ڵ� {
	 public ListNode FindKthToTail(ListNode head,int k) {
		 if(head == null || k == 0) return null;
		//���k������ָ����������������һ���������նˣ����ľ��ǵ���K���ڵ���
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
		 ListNode node = null;  //��һ���պðѴ��������С�ĵ������ų���
		 while(firstCur != null) {
			 firstCur = firstCur.next;
			 //��Ҫ��ǰһ����������
			 node = secondCur;
			 secondCur = secondCur.next;
		 }
		return node;

	    }
}
