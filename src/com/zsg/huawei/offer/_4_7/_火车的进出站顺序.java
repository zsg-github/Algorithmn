package com.zsg.huawei.offer._4_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _火车的进出站顺序 {
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
            res.add(new ArrayList<>(tmp));  //引用传递，如果不生成一个新的对象存放这个值，下次对递归将改变这个值，
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            tmp.add(nums[i]);
            backtrack(res, nums, tmp, visited);
            //恢复现场
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }
    public static boolean IsPopOrder(Integer [] pushA,Integer[] popA) {
		//数组为空的情况
		if(pushA.length == 0 || popA.length == 0) return false;
		//弹出序列popA的下标索引
		int popIndex = 0;
		//辅助栈
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < pushA.length; i++) {
			//循环将pushA中的元素压入栈中，压入栈中的元素和popIndex对应的popA中的元素相比
			stack.push(pushA[i]);
			//若相等则出栈，不相等继续入栈
			while(!stack.isEmpty() && stack.peek() == popA[popIndex]) {
				stack.pop();
				popIndex++;
			}	
		}
		//最后若辅助栈为空则表示出栈序列正确
		return stack.isEmpty();
	}
	
	


}
