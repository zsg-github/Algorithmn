package com.zsg.huawei._2_24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _46_称砝码 {
	
	public static int fama(int n, int[] weight, int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		//先放第一种砝码，做基础,包括零
		for(int i = 0; i <= nums[0];i++) {
			set.add(i * weight[0]);
		} 
		//从第二种砝码开始
        for(int i = 1; i < n; i++){
        	//set集合转list
            List<Integer> list = new ArrayList<Integer>(set);
            //从第一个砝码开始
            for(int j = 1; j <= nums[i]; j++){
            	//从list中已有的种类加上当前砝码的不同组合
            	for(int k = 0; k < list.size(); k++){
            		set.add(list.get(k) + j * weight[i]);
            }
        }
    }
        return set.size();
	}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] weight = new int[n];
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                weight[i] = in.nextInt();
            }
            for(int i = 0; i < n; i++){
                nums[i] = in.nextInt();
            }
            System.out.println(fama(n, weight, nums));
        }
        in.close();
    }

}
