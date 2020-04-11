package com.zsg.huawei._2_25;

import java.util.Scanner;
import java.util.TreeMap;
/**
 * 这道题相当于去重排序Treemap再合适不过
 * @author Lenovo
 *
 */
public class _55_合并表记录 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	TreeMap<Integer,Integer> map = new TreeMap<>();
        	for(int i = 0; i < n; i++) {
        		int key = sc.nextInt();
        		int value = sc.nextInt();
        		map.put(key, map.getOrDefault(key, 0) + value);
        	}
        	for(Integer in : map.keySet()) {
        		System.out.println(in+ " " + map.get(in));
        	}
//            Stack<Mapor> stack = new Stack<>();
//            for(int i = 0;i < n; i++){
//                int index = sc.nextInt();
//                int value = sc.nextInt();
//                Mapor map = new Mapor(index,value);
//                
//                if(stack.size() != 0){
//                	Mapor peek = stack.peek();
//                    if(peek.index == map.index){
//                        int temp = peek.value;
//                        stack.pop();
//                        stack.push(new Mapor(index,temp + map.value));
//                    }else {
//                    	stack.push(map);	
//                    }
//                }else{
//                    stack.push(map);
//                }
//            }
//            Stack<Mapor> reverseStack = new Stack<>();
//            while(stack.size() > 0){
//                reverseStack.push(stack.pop());
//            }
//            Mapor mapor = null;
//            while(reverseStack.size() > 0){
//                 mapor = reverseStack.pop();
//                System.out.println(mapor.index +" " +mapor.value);
//            }
        }
        sc.close();
    }

}
//class Mapor {
//	public int index;
//	public int value;
//	public Mapor(int index,int value) {
//		this.index = index;
//		this.value = value;
//	}
//}


