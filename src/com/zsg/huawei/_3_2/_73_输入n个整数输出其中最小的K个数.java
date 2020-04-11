package com.zsg.huawei._3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _73_输入n个整数输出其中最小的K个数 {
		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        while(sc.hasNext()){
		            int n = sc.nextInt();
		            int k = sc.nextInt();
		            int[] input = new int[n];
		            for(int i=0; i<n; i++) {
		            	input[i] = sc.nextInt();
		            }
		            ArrayList<Integer> list = new ArrayList<>();
		            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
		                public int compare(Integer o1,Integer o2){
		                    return o2 - o1;
		                }
		            });
		            for(int i = 0; i < input.length; i++){
		                if(i < k){
		                   queue.offer(input[i]); 
		                }else{
		                    if(input[i] < queue.peek()){
		                        queue.poll();
		                        queue.offer(input[i]);
		                    }
		                }
		            }
		            //输出为中序遍历，没有顺序
//		            for(Integer in : queue){
//		                list.add(in);
//		            }
//		            Collections.sort(list);
//		            for(Integer s : list) {
//		            	System.out.print(s + " ");
//		            }
//		            //最后需换行
//		            System.out.println();
		            while(!queue.isEmpty()) {
		            	list.add(queue.poll());
		            }
		            for(int i = list.size() - 1; i>0; i--) {
		            	System.out.print(list.get(i)+" ");
		            }
		            System.out.println(list.get(0));
		        }
		        sc.close();
		    }
}
