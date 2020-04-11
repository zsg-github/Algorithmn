package com.zsg.huawei.offer;

import java.util.Stack;

public class _两个栈实现队列 {
	 	Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	        if(!stack2.isEmpty()){
	            return stack2.pop();
	        }else{
	            if(!stack1.isEmpty()){
	               while(!stack1.isEmpty()){
	                   stack2.push(stack1.pop());
	               }
	            }
	            return stack2.pop();
	        }
	    }
	    public static void main(String[] args) {
	    	_两个栈实现队列 st = new _两个栈实现队列();
	    	st.push(1);
	    	st.push(2);
	    	st.push(3);
	    	st.pop();
	    	st.pop();
	    	st.push(4);
	    	st.pop();
	    	st.push(5);
	    	st.pop();
	    	st.pop();
		}
}
