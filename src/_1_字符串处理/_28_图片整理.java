package _1_字符串处理;

import java.util.Arrays;
import java.util.Scanner;

public class _28_图片整理 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.next();
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String sortResult = new String(arr);
			System.out.println(sortResult);
		}
		scanner.close();
	}

}
