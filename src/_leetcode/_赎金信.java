package _leetcode;

public class _Êê½ğĞÅ {
	public static void main(String[] args) {
		
	}
	 public boolean canConstruct(String ransomNote, String magazine) {
		 StringBuilder maga = new StringBuilder(magazine);
		 for(int i = 0; i < ransomNote.length(); i++) {
			 char c = ransomNote.charAt(i);
			 int index = maga.indexOf(c+ "");
			 if(index == -1) {
				 return false;
			 }else {
				 maga.deleteCharAt(index);
			 }
		 }
		 return true;
	    }

}
