package com.zsg.huawei.offer;

import java.util.Scanner;

public class _�滻�ո� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			//�ȼ���ո����
			int blockNum = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ' ') {
					blockNum ++;
				}
			}
			sb.setLength(str.length()+blockNum * 2);
			int oldStrIndex = str.length() -1;
			int newStrIndex = sb.length()-1;
			while(oldStrIndex >=0) {
				if(sb.charAt(oldStrIndex) == ' ') {
					sb.setCharAt(newStrIndex--, '0');
					sb.setCharAt(newStrIndex--, '2');
					sb.setCharAt(newStrIndex--, '%');
				}else {
					sb.setCharAt(newStrIndex, sb.charAt(oldStrIndex));
					newStrIndex --;
				}
				oldStrIndex --;
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}

}
