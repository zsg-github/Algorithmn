package _leetcode;

public class _解码字母到整数的映射 {
	public static void main(String[] args) {
		//System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
		System.out.println(freqAlphabets("123"));
		System.out.println(freqAlphabets("26#"));
	}
	public static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		int indexStr = 0;
		while(indexStr < s.length()) {
			if(indexStr + 2 < s.length() 
					&& s.charAt(indexStr + 2) == '#') {
				int num = Integer.parseInt(s.substring(indexStr,indexStr+2));
				sb.append((char) (num - 1 + 'a'));
				indexStr = indexStr + 3;
			}else {
				int n = Integer.parseInt(s.charAt(indexStr)+"");
				sb.append((char) (n+'a'-1));
				indexStr ++;
			}
    }
		return sb.toString();
}

}
