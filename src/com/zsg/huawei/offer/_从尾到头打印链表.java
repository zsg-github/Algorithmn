package com.zsg.huawei.offer;

import java.util.ArrayList;

public class _��β��ͷ��ӡ���� {
	  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  ListNode cur = listNode;
	        while(cur != null) {
	        	list.add(0,cur.val);
	        	cur = cur.next;
	        }
	        return list;
	    }

}
