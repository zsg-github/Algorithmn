package com.zsg.huawei.offer;
import java.util.Scanner;
public class _最长不重复字符的子字符串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char[] chArr = str.toCharArray();
			//定义一个数组放最新的字符下位置
			int[] indexArr = new int[26];
			for(int i = 0; i < 26; i++) {
				indexArr[i] = -1;
			}
			int maxLen = 1;
			//定义状态dp[i]为以位置为i结尾的字符串的最大不重复长度
			int[] dp = new int[chArr.length];
			//边界值
			dp[0] = 1;
			indexArr[chArr[0]-'a'] = 0;
			//状态转移方程
			for(int i =1; i < chArr.length; i++) {
				int ch = chArr[i] -'a';
				if(indexArr[ch] == -1) {
					dp[i] = dp[i-1] +1;
				}else { //第i个字符之前出现过
					//两个相同字符的距离
					int d = i - indexArr[ch];
					if(d <= dp[i -1]) {
						dp[i] = d;
					}else {
						dp[i] = dp[i-1] + 1;
					}
					
				}
				//标记出现过的字符
				indexArr[ch] = i;
				if(dp[i] > maxLen) {
					maxLen = dp[i];
				}
			}
			System.out.println(maxLen);
			
		}
		sc.close();
	}

}
