package _1_�ַ�������;

import java.util.HashSet;
import java.util.Scanner;
/**
 * ����ʱ��57ms
 * @author zsg
 *
 */
public class _31_�ַ�����ͳ�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		HashSet<String> set = new HashSet<>();  //����setȥ��
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=0 && str.charAt(i) <= 127) {
				set.add(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(set.size());	
	}

}
