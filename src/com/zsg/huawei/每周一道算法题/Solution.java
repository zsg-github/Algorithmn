package com.zsg.huawei.每周一道算法题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
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
        for(Integer in : queue){
            list.add(in);
        }
        Collections.sort(list);
        return list;
    }
}
