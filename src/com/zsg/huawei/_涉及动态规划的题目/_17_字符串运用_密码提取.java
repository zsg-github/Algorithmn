package com.zsg.huawei._�漰��̬�滮����Ŀ;
/**
 * 64ms
 */

import java.util.Scanner;

public class _17_�ַ�������_������ȡ {
    
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
     * ��̬�滮
     * @param s
     * @return
     */
    
   public static int lpd(String str) {
	   int len = str.length();
	   char[] ch = str.toCharArray();
	   //����״̬����dp[][]
	   boolean[][] dp = new boolean[len][len];
	   //�߽�����
	   for(int i = 0; i < len; i++) {
		   dp[i][i] = true;
	   }
	   int maxLen = 1;
	   int start = 1;
	   for(int j = 1; j < len; j++) {
		   int curLen = 1;
		   for(int i = 0;i < j; i++) {
			   if(ch[i] == ch[j]) {
				   if( j- i < 3) {  //�ַ���ֻ��2����3���ַ�
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
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
        
        // ö�����г��ȴ��ڵ��� 2 ���Ӵ�
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
        // ��֤�Ӵ� s[left, right] �Ƿ�Ϊ���Ĵ�
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
