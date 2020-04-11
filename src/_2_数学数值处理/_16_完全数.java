package _2_数学数值处理;

import java.util.Scanner;

public class _16_完全数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n < 5) {
				System.out.println(0);
			}
			int countPerNum = 0;
			for(int i = 5; i <=n; i++) {
				int num = 1;
				for(int j =2; j <= i / 2; j++) {
					if(i % j == 0) {
						num = num + j;
					}
				}
				if(num == i) {
					countPerNum++;
				}
			}
			System.out.println(countPerNum);
		}
		sc.close();
	}

}
