package com.zsg.huawei._2_20;

import java.util.Scanner;

public class _32_�������һ��ż����ӽ����������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			int count =  n / 2;
			int primerNumber1 = count;
			int primerNumber2 = count;
			for(int i = 0; i < count; i++) {
				if(isPrimerNumber(primerNumber1) && isPrimerNumber(primerNumber2)) {
					break;
				}
				primerNumber1 --;
				primerNumber2 ++;
			}
			//������ͬ����������һ��С�ڵ��� n/2
//			for(int i =1; i <= n/2; i++) {  //���ں�һ��Ҫ��
//				if(isPrimerNumber(i) && isPrimerNumber(n -i)) {
//					//�������i�������������������
//					primerNumber1 = i;
//					primerNumber2 = n-i;
//				}
//			}
			//s�����ҪС����ǰ��
			System.out.println(primerNumber1+"\n"+primerNumber2);
			
		}
		scanner.close();
	}
	
	//�ж�һ����֪��ʱ����
	public static Boolean isPrimerNumber(int in) {
		if(in == 1 || in == 2) {
			return true;
		}
		for(int i= 2; i < in/2; i++) {
			if(in % i == 0) {
				return false;
			}
		}
		return true;
	}

}
