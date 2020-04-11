package _leetcode;

import java.util.Scanner;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * @author Lenovo
 *
 */
public class _可删除一个字符验证回文串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			boolean isValidPalindrome = validPalindrome(str);
			System.out.println(isValidPalindrome);
		}
		sc.close();
	}
	 public static boolean validPalindrome(String s) {
		 int start = 0;
		 int end = s.length() - 1;
		 char[] arr = s.toCharArray();
		 for(int i = 0; i < arr.length / 2; i++) {
			 if(arr[start] != arr[end]) {
				return isvalidPd(arr,start+ 1,end) || isvalidPd(arr,start,end-1); 
			 }
			 start ++;
			 end --;
		 }
		 
		return true;

	}
	private static boolean isvalidPd(char[] arr,int start, int end) {
		while(start < end) {
			if(arr[start++] != arr[end--]) {
				return false;
			}
		}
		return true;
	}
	
	
}
