package com.zsg.huawei.�ݹ�ͻ����㷨;

import java.util.ArrayList;
import java.util.List;

public class _�����㷨 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		ArrayList<Integer> list = new ArrayList<>();
		int n = nums.length;
		int[] visited = new int[n];
		backStrack(n,list, visited,nums); //���ô���
	}
	static void backStrack(int n, ArrayList<Integer> list,int[] visited,int[] nums) {
		if(list.size() == n) {
			System.out.println(list);
			return;
		}
		for(int i = 0; i< n; i++) {
			if(visited[i] == 1) {
				continue;
			}
			visited[i] = 1;
			list.add(nums[i]);
			backStrack(n,list,visited,nums);
			visited[i] = 0;
			list.remove(list.size() - 1);
			
		}
	}
}
