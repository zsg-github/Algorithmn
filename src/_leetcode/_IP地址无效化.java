package _leetcode;

public class _IP地址无效化 {
	 public String defangIPaddr(String str) {
		 StringBuilder sb = new StringBuilder(str);
			sb.setLength(str.length()+ 3 * 2);
			int oldStrIndex = str.length() -1;
			int newStrIndex = sb.length()-1;
			while(oldStrIndex >=0) {
				if(sb.charAt(oldStrIndex) == '.') {
					sb.setCharAt(newStrIndex--, ']');
					sb.setCharAt(newStrIndex--, '.');
					sb.setCharAt(newStrIndex--, '[');
				}else {
					sb.setCharAt(newStrIndex, sb.charAt(oldStrIndex));
					newStrIndex --;
				}
				oldStrIndex --;
			}
			return sb.toString();

	    }
	

}
