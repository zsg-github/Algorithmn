package _leetcode;

import java.util.Scanner;

/**
 * ����һ���ǿ��ַ��� s�����ɾ��һ���ַ����ж��Ƿ��ܳ�Ϊ�����ַ�����
 * @author Lenovo
 *
 */
public class _��ɾ��һ���ַ���֤���Ĵ� {
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
