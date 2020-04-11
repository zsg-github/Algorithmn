package _leetcode;

public class _罗马数据转数字 {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
	 public static int romanToInt(String s) {
		 char[] arr = s.toCharArray();
		 String roman = "MDCLXVI";
		 int[] value = {1000,500,100,50,10,5,1};
		 int num = 0;
		 for(int i = 0; i < s.length(); i++) {
			int index1 = roman.indexOf(arr[i]);
			if(i == s.length() - 1) {
				num = num + value[index1];
				break;
			}
			int index2 = roman.indexOf(arr[i+1]);
			if(index1 > index2) {
				num = num + value[index2] - value[index1];
				i ++;
			}else {
				num =num + value[index1];
			}
			
		 }
		 return num;
	    }

}
