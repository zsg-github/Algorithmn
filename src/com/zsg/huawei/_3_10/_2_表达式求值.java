package com.zsg.huawei._3_10;
/**
 * 对栈进行迭代遍历是就是从栈底开始for(String s : stack)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _2_表达式求值 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] arr1 = str.split("[\\+\\-\\*/]{1,}");
			//System.out.println(Arrays.toString(arr1));
			String[] arr2 = str.split("[0-9\\(\\)]{1,}");
			//System.out.println(Arrays.toString(arr2));
			ArrayList<String> list = new ArrayList<>();
			list.add(arr1[0]);
			for(int i =1; i < arr2.length; i++) {
				list.add(arr2[i]);
				list.add(arr1[i]);	
			}
			//处理左括号
			ArrayList<String> l = new ArrayList<>();
			for(String s : list) {
				if(s.charAt(0) == '(') {
					for(int i = 0; i < s.length();i++) {
						char ch = s.charAt(i);
						if(ch =='(') {
							l.add("(");
						}else {
							l.add(s.substring(i));
							break;
						}
					}
					
				}else if(s.charAt(s.length() -1) == ')') {
					List<String> temp = new ArrayList<>();
					for(int i = s.length() - 1; i >= 0;i--) {
						char ch = s.charAt(i);
						if(ch ==')') {
							temp.add(0,")");
						}else {
							temp.add(0, s.substring(0,i+1));
							break;
						}
					}
					l.addAll(temp);
				}else {
					l.add(s);
				}
			}
			//开始处理list
			Stack<String> stack = new Stack<>();
			for(int i = 0; i < l.size(); i++) {
				String s = l.get(i);
				if(")".equals(s)) {
					List<String> tempList = new ArrayList<>();
					Stack<String> tempStack = new Stack<>();
					while(stack.peek() != "(") {
						tempStack.add(stack.peek());
						stack.pop();
					}
					stack.pop();
					while(tempStack.size() != 0) {
						tempList.add(tempStack.peek());
						tempStack.pop();
					}
					String st = String.valueOf(processNums(tempList));
					stack.add(st);
				}
				else {
					stack.add(s);
				}
			}
			List<String> temp1 = new ArrayList<>();
			for(String r : stack) {
				temp1.add(r);
			}
			System.out.println(String.valueOf(processNums(temp1)));
			
		}
		sc.close();
	}
	
	//加减乘除计算
	static int processNums(List<String> list) {
		//先算乘除

		for(int i = 1; i < list.size() -1; i++) {
			String s= list.get(i);
			if("*".equals(s)) {
				int a = Integer.parseInt(list.get(i - 1));
				int b = Integer.parseInt(list.get(i+1));
				int c = a * b;
				list.add(i-1,String.valueOf(c));
				list.remove(i);
				list.remove(i);
				list.remove(i);
				i--;
				
			}else if("/".equals(s)){
				int a = Integer.parseInt(list.get(i - 1));
				int b = Integer.parseInt(list.get(i+1));
				int c = a / b;
				list.add(i-1,String.valueOf(c));
				list.remove(i);
				list.remove(i);
				list.remove(i);
				i--;
				
			}
		}
		//再算加减
		for(int i = 1; i < list.size() -1; i++) {
			String s= list.get(i);
			if("+".equals(s)) {
				int a = Integer.parseInt(list.get(i - 1));
				int b = Integer.parseInt(list.get(i+1));
				int c = a + b;
				list.add(i-1,String.valueOf(c));
				list.remove(i);
				list.remove(i);
				list.remove(i);
				i--;
			}else if("-".equals(s)){
				int a = Integer.parseInt(list.get(i - 1));
				int b = Integer.parseInt(list.get(i+1));
				int c = a - b;
				list.add(i-1,String.valueOf(c));
				list.remove(i);
				list.remove(i);
				list.remove(i);
				i--;
				
			}
		}
		return Integer.parseInt(list.get(0));
	}

}
