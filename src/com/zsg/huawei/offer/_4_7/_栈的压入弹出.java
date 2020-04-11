package com.zsg.huawei.offer._4_7;

import java.util.Stack;

public class _栈的压入弹出 {
	public boolean IsPopOrder(int [] pushA,int[] popA) {
		//数组为空的情况
		if(pushA.length == 0 || popA.length == 0) return false;
		//弹出序列popA的下标索引
		int popIndex = 0;
		//辅助栈
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < pushA.length; i++) {
			//循环将pushA中的元素压入栈中，压入栈中的元素和popIndex对应的popA中的元素相比
			stack.push(pushA[i]);
			//若相等则出栈，不相等继续入栈
			while(!stack.isEmpty() && stack.peek() == popA[popIndex]) {
				stack.pop();
				popIndex++;
			}	
		}
		//最后若辅助栈为空则表示出栈序列正确
		return stack.isEmpty();
	}
}
