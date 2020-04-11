package com.zsg.huawei.offer._4_7;

import java.util.Stack;

public class _ջ��ѹ�뵯�� {
	public boolean IsPopOrder(int [] pushA,int[] popA) {
		//����Ϊ�յ����
		if(pushA.length == 0 || popA.length == 0) return false;
		//��������popA���±�����
		int popIndex = 0;
		//����ջ
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < pushA.length; i++) {
			//ѭ����pushA�е�Ԫ��ѹ��ջ�У�ѹ��ջ�е�Ԫ�غ�popIndex��Ӧ��popA�е�Ԫ�����
			stack.push(pushA[i]);
			//��������ջ������ȼ�����ջ
			while(!stack.isEmpty() && stack.peek() == popA[popIndex]) {
				stack.pop();
				popIndex++;
			}	
		}
		//���������ջΪ�����ʾ��ջ������ȷ
		return stack.isEmpty();
	}
}
