package com.zsg.huawei.ÿ��һ���㷨��;

import java.util.Scanner;
import java.util.Stack;

public class _��Ч������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if( c == ')' || c == ']' || c== '}') {
					if(stack.size() == 0) {
						flag = false;
						break;
					}else {
						char ch = stack.peek();
						if(ch == '(') {
							if(c != ')') flag = false;
						}else if(ch == '[') {
							if(c != ']') flag = false;
						}else {
							if(c != '}') flag = false;
						}
						stack.pop();
					}
				}else {
					stack.add(c);
				}
			}
			if(flag && stack.size() ==0) {
				System.out.println("������Ч");
			}else {
				System.out.println("��Ч����");
			}
		}
		sc.close();
	}
}
