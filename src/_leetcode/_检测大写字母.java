package _leetcode;

public class _����д��ĸ {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("sD"));
	}
	 public static boolean detectCapitalUse(String word) {
		 if(word.length() == 1) return true;
		 char seconedChar = word.charAt(1);
		 String subStr = word.substring(2);
		  if(seconedChar >= 'A' && seconedChar <='Z') {
			  //sD�����
			  char firstChar = word.charAt(0);
			  if(firstChar >= 'a' && firstChar <= 'z') return false;
			  return subStr.equals(word.substring(2).toUpperCase());	  
		  }else {
			  return subStr.equals(word.substring(2).toLowerCase());
		  }

	    }

}
