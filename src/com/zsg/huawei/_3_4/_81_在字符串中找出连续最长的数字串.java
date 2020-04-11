package com.zsg.huawei._3_4;

import java.util.Scanner;

public class _81_在字符串中找出连续最长的数字串 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			if("".equals(str)){
				System.out.println("");
				break;
			}
			//按非数字的字符进行分割
			String[] nums = str.split("[^0-9]{1,}");
			if(nums.length == 0) {
				System.out.println("");
				break;
			}
			int max = 0;
			//先找到最大长度
			for(int i = 0;i < nums.length;i++) {
				if(max < nums[i].length()) {
					max = nums[i].length();
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < nums.length;i++) {
				if(nums[i].length() == max) {
					sb.append(nums[i]);
				}
			}
			System.out.println(sb.toString() + ","+max);
			
		}
		sc.close();
	}

}
