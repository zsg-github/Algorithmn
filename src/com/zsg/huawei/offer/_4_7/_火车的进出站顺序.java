package com.zsg.huawei.offer._4_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _�𳵵Ľ���վ˳�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			Integer[] pushArr = new Integer[n];
			for(int i = 0; i < n; i++) {
				pushArr[i] = sc.nextInt();
			}
			List<List<Integer>> re = permute(pushArr);
			for(List<Integer> r : re) {
				Integer[] popArr = r.toArray(new Integer[0]);
				if(IsPopOrder(pushArr,popArr)) {
					String str = "";
					for(int i = 0; i < r.size();i++) {
						str = str + r.get(i) + " ";
					}
					System.out.println(str);
				}
			}
			
		}
		sc.close();
	}
	
	public static List<List<Integer>> permute(Integer[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(res, nums, temp, visited);
        return res;

    }

    private static void backtrack(List<List<Integer>> res, Integer[] nums, ArrayList<Integer> tmp, int[] visited) {
        if (tmp.size() == nums.length) {
        	//res.add(tmp);
            res.add(new ArrayList<>(tmp));  //���ô��ݣ����������һ���µĶ��������ֵ���´ζԵݹ齫�ı����ֵ��
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            tmp.add(nums[i]);
            backtrack(res, nums, tmp, visited);
            //�ָ��ֳ�
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }
    public static boolean IsPopOrder(Integer [] pushA,Integer[] popA) {
		//����Ϊ�յ����
		if(pushA.length == 0 || popA.length == 0) return false;
		//��������popA���±�����
		int popIndex = 0;
		//����ջ
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < pushA.length; i++) {
			//ѭ����pushA�е�Ԫ��ѹ��ջ�У�ѹ��ջ�е�Ԫ�غ�popIndex��Ӧ��popA�е�Ԫ�����
			stack.push(pushA[i]);
			//��������ջ������ȼ�����ջ
			while(!stack.isEmpty() && stack.peek() == popA[popIndex]) {
				stack.pop();
				popIndex++;
			}	
		}
		//���������ջΪ�����ʾ��ջ������ȷ
		return stack.isEmpty();
	}
	
	


}
