package _leetcode;

import java.util.Scanner;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。
示例 1:
输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:
输入: "race a car"
输出: false
 * @author Lenovo
 *
 */
public class _验证回文字符串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			boolean flag = isPalindrome(s);
			System.out.println(flag);

		}
		sc.close();
	}
	 public static boolean isPalindrome(String s) {
		 String str = s.replaceAll("[^a-zA-Z0-9]+", "");
		 String strLow = str.toLowerCase();
		 char[] arr = strLow.toCharArray();
		 if(isvalidPd(arr)) {
			 return true;
		 }
		 return false;
	    }
		private static  boolean isvalidPd(char[] arr) {
			int start = 0;
			int end = arr.length - 1;
			while(start < end) {
				if(arr[start++] != arr[end--]) {
					return false;
				}
			}
			return true;
		}

}
