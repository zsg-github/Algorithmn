package com.zsg.huawei._3_1;

import java.util.Scanner;

public class _66_MP3π‚±ÍŒª÷√ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			String commands = sc.next();
			char[] comArr = commands.toCharArray();
			 moveIndex(num,comArr);
		}
		sc.close();
	}

	private static void moveIndex(int num, char[] comArr) {
		int index = 1;
		int start = 0;
		int end = 4;
		StringBuilder sb = new StringBuilder();
		if(num <= 4) {
			start = 1;
			end = num;
			for(int i = 0; i < comArr.length; i++) {
				if(comArr[i] == 'U') {
					if(index == 1) {
						index = num;
					}else {
						index --;
					}
				}else {
					if(index == num) {
						index = 1;
					}else {
						index ++;
					}
				}
			}
			
			
		}else {
			for(int i = 0; i < comArr.length; i++) {
				if(comArr[i] == 'U') {
					if(index == 1) {
						index = num;
						start = num - 3;
						end = num;
					}else {
						index--;
						if(index < start) {
							start = start - 1;
							end = end - 1;
						}
					}	
				}else {
					if(index == num) {
						index =1;
						start = 1;
						end = 4;
					}else {
						index ++;
						if(index >end) {
							start = start + 1;
							end = end +1;
						}
					}	
					
				}
			}
		}
		for(int i = start; i <= end; i++) {
			sb.append(i+" ");
		}
		sb.append("\n" + index);
		System.out.println(sb.toString());
	}

}
