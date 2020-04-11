package _1_字符串处理;

import java.util.HashSet;
import java.util.Scanner;
/**
 * 运行时间57ms
 * @author zsg
 *
 */
public class _31_字符个数统计 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		HashSet<String> set = new HashSet<>();  //利用set去重
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=0 && str.charAt(i) <= 127) {
				set.add(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(set.size());	
	}

}
