package com.zsg.huawei.offer;
/**
 * �ȷֱ������������ĳ���
 * Ȼ��ͳһ������������ָ��һ����ʱ������ʣ�µĳ�����ͬ
 * û����һ���ڵ���ж��Ƿ����
 * @author Lenovo
 *
 */
public class _��������ĵ�һ�������ڵ� {
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
		//��������
		ListNode curp = longHead;
		while(step >0) {
			curp = curp.next;
			step --;
		}
		longHead = curp; 
		//һ����
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
