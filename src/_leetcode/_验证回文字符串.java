package _leetcode;

import java.util.Scanner;

/**
 * ����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���
ʾ�� 1:
����: "A man, a plan, a canal: Panama"
���: true
ʾ�� 2:
����: "race a car"
���: false
 * @author Lenovo
 *
 */
public class _��֤�����ַ��� {
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
