package _leetcode;
//每位都在(2, 5, 6, 9, 0, 1, 8)内，至少一位在(2, 5, 6, 9)内
public class _旋转数字 {
	public static void main(String[] args) {
		System.out.println(rotatedDigits(10));
		
	}
	 public static int rotatedDigits(int N) {
		 int count  = 0;
		 for(int i = 0; i < N; i++) {
			 if(isGood(i,false)) {
				 count ++;
			 }
		 }
		return count;

	    }
	private static boolean isGood(int i, boolean b) {
		if(i == 0) return b;
		int num = i % 10;
		if(num == 4 || num == 7 || num == 3)
		return false;
		if(num == 0 || num == 1 || num == 8) {
			return isGood(i / 10,false);
		}
		return isGood(i / 10,true);
	}

}
