package com.zsg.huawei._3_5;

import java.util.Arrays;
import java.util.Scanner;

public class _90_ÕûÊıÅÅĞò {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int[] nums = new int[m];
			for(int i = 0; i < m; i++) {
				nums[i] = sc.nextInt();
			}
			int type = sc.nextInt();
			Arrays.sort(nums);
			StringBuilder str = new StringBuilder();
			if(type == 0) {
				for(int i = 0; i < m -1; i++) {
					str.append(nums[i] +" ");
				}
				str.append(nums[m-1]);
				
			}else {
				for(int i = m-1; i > 0; i--) {
					str.append(nums[i] +" ");
				}
				str.append(nums[0]);
				
			}
			System.out.println(str);
			
		}
		sc.close();
	}

}
