package _leetcode;

public class _最长公共前缀 {
	public static void main(String[] args) {
		String[] str = {"s"};
		System.out.println(longestCommonPrefix(str));
	}
	 public static String longestCommonPrefix(String[] strs) {
		 if(strs.length == 0) return "";
		 if(strs.length == 1) return strs[0];
		 for(int i = 0; i < strs.length; i++) {
			 if("".equals(strs[i])) return "";
		 }
		 int length = 0;
		 boolean  flag = true;
		 while(flag) {
			 char ch = strs[0].charAt(length);
			 for(int i = 0; i <strs.length; i++) {
				 if(length == strs[i].length()) {
					 flag = false;
				 }
				 if(ch != strs[i].charAt(length)) {
					 length --;
					 flag = false;
					 break;
				 }
			 }
			 length ++;	 
		 }
		 return strs[0].substring(0,length);
	 }

}
