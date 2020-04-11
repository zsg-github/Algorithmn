package _leetcode;
import java.util.TreeMap;

public class _ÉÏÉýÏÂ½µ×Ö·û {
	public static void main(String[] args) {
		System.out.println(sortString("leetcode"));
		
		
		
	}
	 public static String sortString(String s) {
		 if("".equals(s) || s.length() == 1) return s;
		 TreeMap<Character,Integer> map = new TreeMap<>();
		 char[] arr = s.toCharArray();
		 for(char c : arr) {
			 map.put(c, map.getOrDefault(c, 0)+1);
		 }
		 Character[] chArr = map.keySet().toArray(new Character[0]);
		 int[] countArr = new int[chArr.length];
		 for(int i = 0; i  < chArr.length; i++) {
			 countArr[i] = map.get(chArr[i]);
		 }
		 int length = chArr.length;
		 StringBuilder sb = new StringBuilder();
		 while(sb.length() < s.length()) {
			 for(int i = 0; i < length; i++) {
				 if(countArr[i] > 0) {
					 sb.append(chArr[i]);
					 countArr[i] = countArr[i] - 1;
				 }	 
			 }
			 for(int i = length - 1; i >= 0; i--) {
				 if(countArr[i] > 0) {
					 sb.append(chArr[i]);
					 countArr[i] = countArr[i] - 1;
				 }	 
			 }
			 
		 }
		 return sb.toString();
	    }
}
