package com.zsg.huawei._涉及动态规划的题目;
/**
 * 64ms
 */

import java.util.Scanner;

public class _17_字符串运用_密码提取 {
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
           int n = lpd(input);
            System.out.println(n);        
        }
        sc.close();
		
	}
    
    /**
     * 动态规划
     * @param s
     * @return
     */
    
   public static int lpd(String str) {
	   int len = str.length();
	   char[] ch = str.toCharArray();
	   //定义状态数组dp[][]
	   boolean[][] dp = new boolean[len][len];
	   //边界条件
	   for(int i = 0; i < len; i++) {
		   dp[i][i] = true;
	   }
	   int maxLen = 1;
	   int start = 1;
	   for(int j = 1; j < len; j++) {
		   int curLen = 1;
		   for(int i = 0;i < j; i++) {
			   if(ch[i] == ch[j]) {
				   if( j- i < 3) {  //字符串只有2个或3个字符
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   dp[i][j] = true;
				   }else {
					   dp[i][j] = dp[i +1][j - 1];
				   }
			   }else {
				   dp[i][j] = false;
			   }
			   if(dp[i][j]) {
				   curLen = j - i + 1;
				   if(curLen > maxLen) {
					   maxLen = curLen;
					   start = i;
				   }
				   
			   }
		   }
	   }
	   return maxLen;
   }
	public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        String res = s.substring(0, 1);
        
        // 枚举所有长度大于等于 2 的子串
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && valid(s, i, j)) {
                    maxLen = j - i + 1;
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }

    private static boolean valid(String s, int left, int right) {
        // 验证子串 s[left, right] 是否为回文串
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
