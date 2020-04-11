package _leetcode;

public class _长按键入 {
	public static void main(String[] args) {
		System.out.println(isLongPressedName("alex","aalaeex"));
		System.out.println(isLongPressedName2("alex","aalaeex"));
	}
	public static boolean isLongPressedName(String name, String typed) {
		if(name.equals(typed)) return true;
		char[] arr = name.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char ch : arr) {
			sb.append(ch);
			sb.append("{1,}");	
		}
		return typed.matches(sb.toString());
    }
	//为考虑出现其他字符
	public static boolean isLongPressedName2(String name, String typed) {
		char[] c1 = name.toCharArray();
		char[] c2 = typed.toCharArray();
		
		int p1 = 0, p2 = 0;
		while (p1 < c1.length && p2 < c2.length) {
			if (c1[p1] == c2[p2]) {
				p1++;
			}
			p2++;
		}

		return p1 == c1.length;
	    }

}
