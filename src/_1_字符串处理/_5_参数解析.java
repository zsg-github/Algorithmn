package _1_字符串处理;

import java.util.Scanner;
import java.util.Stack;

public class _5_参数解析 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			Stack<String> stack = new Stack<>();
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].charAt(arr[i].length() - 1) == '"'){
					String temp = arr[i];
					while(stack.peek().charAt(0) != '"') {
						temp =  stack.peek() +" "+ temp;
						stack.pop();
					}
					temp = stack.peek() +" "+ temp;
					String string = temp.replace(String.valueOf('"'), "");
					stack.pop();
					stack.add(string);
					
				}else {
					stack.add(arr[i]);
				}
				
			}
			System.out.println(stack.size());
			for(String i : stack) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
