package _1_�ַ�������;

import java.math.BigInteger;
import java.util.Scanner;

public class _26_������������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String c1 = scanner.next();
			String c2 = scanner.next();
			BigInteger big1 = new BigInteger(c1);
			BigInteger big2= new BigInteger(c2);
			System.out.println(big1.add(big2));
		}
		scanner.close();
	}

}
