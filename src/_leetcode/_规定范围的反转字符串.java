package _leetcode;

public class _规定范围的反转字符串 {
	public static void main(String[] args) {
		String str = reverseStr("a", 2);
		System.out.println(str);
	}
	 public static String reverseStr(String s, int k) {
		 StringBuilder sb = new StringBuilder(s);
		 int count = sb.length() / (k * 2);
		 for(int i = 0; i < count; i++) {
			 int start = 2 * k * i;
			 reverseSub(sb,start,start + k-1);
		 }
		 if(sb.length() % (k*2) != 0) {
			 int tailStart = count * 2 * k;
			 int tailLength = sb.length() - tailStart;
			 if(tailLength <= k) {
				 reverseSub(sb,tailStart,sb.length() -1);
			 }else {
				 reverseSub(sb,tailStart,tailStart + k - 1); 
			 }
		 }
		 return sb.toString(); 	 
	    }

	private static void reverseSub(StringBuilder sb, int tailStart, int length) {
		System.out.println(tailStart+" " + length);
		while(tailStart < length) {
			char c = sb.charAt(tailStart);
			sb.setCharAt(tailStart, sb.charAt(length));
			sb.setCharAt(length, c);
			tailStart ++;
			length --;
		}
		
	}

}
