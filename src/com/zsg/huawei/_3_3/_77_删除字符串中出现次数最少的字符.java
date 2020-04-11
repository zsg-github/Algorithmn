package com.zsg.huawei._3_3;

import java.util.Scanner;

public class _77_删除字符串中出现次数最少的字符 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str= sc.nextLine();
			char[] ch = str.toCharArray();
			int[] nums = new int[26];
			for(int i = 0; i < ch.length; i++) {
				nums[ch[i] - 'a'] ++;
			}
			//从小找最少的字符
			boolean flag = false;
			for(int i = 1;i<=10;i++) {
				if(flag) break;
				for(int j = 0; j < nums.length; j++) {
					if(nums[j] == i) {
						//最少的字符次数
						char c = (char) (j + 'a');
						//字符替换字符，字符串替换字符串
						str = str.replace(String.valueOf(c), "");
						flag = true;
					}
				}
			}
			System.out.println(str);
		}
		sc.close();
	}

}
