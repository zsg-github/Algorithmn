package com.zsg.huawei.每周一道算法题;
/**
 * 回溯法
 */
import java.util.ArrayList;
import java.util.List;

public class _全排列 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> re = permute(nums);
		for(List<Integer> r : re) {
			System.out.println(r);
		}
	}
	
	public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(res, nums, temp, visited);
        return res;

    }

    private static void backtrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp, int[] visited) {
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
	
	
	

}
