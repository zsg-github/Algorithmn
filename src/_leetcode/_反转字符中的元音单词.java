package _leetcode;

public class _��ת�ַ��е�Ԫ������ {
	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}
	public static String reverseVowels(String s) {
		StringBuilder sb = new StringBuilder(s);
		int start = 0;
		int end = sb.length() - 1;
		while(start < end) {
			while(start < end) {
				//ע������������� ��Сд
				char ch = Character.toLowerCase(sb.charAt(start));
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' 
						|| ch == 'u') {
					break;
				}
				start ++;
				
			}
			while(start < end) {
				char ch = Character.toLowerCase(sb.charAt(end));
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' 
						|| ch == 'u') {
					break;
				}
				end--;
				
			}
			if(start<end) {
				char ch =sb.charAt(start);
				sb.setCharAt(start, sb.charAt(end));
				sb.setCharAt(end, ch);
				start ++;
				end --;	
			}
		}
		return sb.toString();
    }

}
