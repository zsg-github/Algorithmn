package com.zsg.huawei.offer;
/**
 * 先分别遍历两个链表的长度
 * 然后统一步伐，即两个指针一起走时两链表剩下的长度相同
 * 没遍历一个节点就判断是否相等
 * @author Lenovo
 *
 */
public class _两个链表的第一个公共节点 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead2 == null || pHead2 ==null) return null;
		int pHead1Length = getLenght(pHead1);
		int pHead2Length =getLenght(pHead2);
		ListNode longHead = pHead1;
		ListNode shortHead = pHead2;
		int step = pHead1Length - pHead2Length;
		if(pHead1Length < pHead2Length) {
			 longHead = pHead2;
			 shortHead = pHead1;
			step = pHead2Length - pHead1Length;
		}
		//长的先走
		ListNode curp = longHead;
		while(step >0) {
			curp = curp.next;
			step --;
		}
		longHead = curp; 
		//一起走
		ListNode longCur = longHead;
		ListNode shortCur = shortHead;
		ListNode targetNode = null;
		while(longCur != null && shortCur != null) {
			if(longCur == shortCur) {
				targetNode = longCur;
				break;
			}
			longCur = longCur.next;
			shortCur =shortCur.next;
		}
		return targetNode;
		 
    }

	private int getLenght(ListNode pHead) {
		ListNode cur = pHead;
		int length = 0;
		while(cur != null) {
			cur = cur.next;
			length ++;
		}
		return length;
	}
	
}
