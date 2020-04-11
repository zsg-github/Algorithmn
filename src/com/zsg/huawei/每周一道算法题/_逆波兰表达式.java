package com.zsg.huawei.ÿ��һ���㷨��;

import java.util.Stack;

public class _�沨�����ʽ {
	public static void main(String[] args) {
		
	}
	static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for(String token: tokens) {
			if(token == "+" || token == "-" || token =="*" || token =="/") {
				Integer right = stack.pop();
				Integer left = stack.pop();
				stack.push(calculate(left,right,token));
			}else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
	
	static Integer calculate(Integer left,Integer right, String token) {
		switch(token) {
		case "+" : return left + right;
		case "-" : return left - right;
		case "*" : return left * right;
		default: return left / right;
		}
	}

}
