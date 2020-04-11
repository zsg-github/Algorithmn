package com.zsg.huawei._2_27;

import java.util.Scanner;
/**
 * ����ʹ��ArrayList���ݽṹ��ʵ�֣�add(int index,int element)remove(int index)indexOf(int element)
 * @author zsg
 *
 */

public class _63_�ӵ���������ɾ��һ��ָ���Ľڵ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int firstKey = sc.nextInt();
			LinkedList list = new LinkedList();
			list.add(0, firstKey);
			for(int i = 1; i < m;i++) {
				int val = sc.nextInt();  //����Ľڵ�
				int preVal = sc.nextInt(); //�嵽�ĸ��ڵ�ĺ���
				int preIndex = list.indexOf(preVal); 
				list.add(preIndex+1, val);
			}
			int removeVal = sc.nextInt();
			//ɾ���ڵ�
			list.remove(removeVal);
			//��ӡ����
			StringBuilder str = new StringBuilder();
			LinkedList.ListNode node=list.node(0);
			while(node != null) {
				str.append(node.key + " ");
				node  = node.next;
			}
			System.out.println(str.toString());
		}
		sc.close();
	}

}

class LinkedList {
	ListNode first;
	int size = 0;
	class ListNode {
		int key;
		ListNode next;
		public ListNode(int m,ListNode next) {
			this.key = m;
			this.next = next;
		}
	}
	
	public void add(int index, int element) {	
		if (index == 0) {
			first = new ListNode(element, first);
		} else {
			ListNode prev = node(index - 1);
			prev.next = new ListNode(element, prev.next);
		}
		size++;
	}
	
	public ListNode node(int index) {
		ListNode node = first;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}	
	public void remove(int key) {
		int index = indexOf(key);
		ListNode node = first;
		if (index == 0) {
			first = first.next;
		} else {
			ListNode prev = node(index - 1);
			node = prev.next;
			prev.next = node.next;
		}
		size--;
	}
	
	public int indexOf(int key) {
		ListNode node = first;
		for (int i = 0; i < size; i++) {
			if (node.key == key) return i;
				node = node.next;
			}
		return -1;

	}
}
