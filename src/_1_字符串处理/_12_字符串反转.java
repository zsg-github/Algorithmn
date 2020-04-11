package _1_字符串处理;
import java.util.Scanner;

public class _12_字符串反转 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.next();
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			System.out.println(sb.toString());
		}
		scanner.close();
	}
	
	//利用栈的先进后出
}
