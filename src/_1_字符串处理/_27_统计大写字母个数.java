package _1_字符串处理;

import java.util.Scanner;

public class _27_统计大写字母个数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.next();
			int count = 0;
			for(int i=0; i< str.length();i++) {
				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					count ++;
				}
			}
			System.out.println(count);
			
		}
		scanner.close();
	}

}
