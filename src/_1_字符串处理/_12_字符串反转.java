package _1_�ַ�������;
import java.util.Scanner;

public class _12_�ַ�����ת {
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
	
	//����ջ���Ƚ����
}
