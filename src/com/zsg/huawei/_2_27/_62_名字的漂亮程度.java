package com.zsg.huawei._2_27;

import java.util.Arrays;
import java.util.Scanner;

public class _62_名字的漂亮程度 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			String[] arr= new String[n];
			for(int i = 0; i < n;i++) {
				arr[i] = sc.next();
			}
			System.out.println(Arrays.toString(arr));
			for(int i = 0;i < arr.length; i++) {
				char[] ch = arr[i].toCharArray();
				int[] count = new int[26];
				int sum = 0;
				int value =26;
				for(int j = 0; j < ch.length;j++) {
					if(ch[j] >= 'a' && ch[j] <= 'z') {
						count[ch[j] - 'a']++;
					}else {
						count[ch[j] - 'A']++;
					}
					
				}
				Arrays.sort(count);
				//我的错误是少个=号
				for(int k = count.length - 1; k >= 0;k--) {
						sum = sum + count[k]*(value--);	
				}
				System.out.println(sum);
			}
			
		}
	}

}
