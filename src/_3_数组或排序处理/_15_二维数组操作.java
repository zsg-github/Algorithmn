package _3_�����������;

import java.util.Arrays;
import java.util.Scanner;

public class _15_��ά������� {
	public static void main(String[] args) {
		/**
		 * next():ֻ��ȡ����ֱ���ո������ܶ������ɿո����Ÿ����ĵ��ʡ����⣬next()�ڶ�ȡ����󽫹�����ͬһ���С�
		 * (next()ֻ���ո�֮ǰ������,���ҹ��ָ����)
		 * nextLine():��ȡ���룬��������֮��Ŀո�ͳ��س���������з���(������������β)��
		 * ��ȡ�����nextLine()����궨λ����һ�С�
		 */
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		while(scanner.hasNext()) {
			for(int i = 0; i < 10; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			solve(arr);
		}
		//scanner.close();
	}
	
	public static void solve(int[] arr) {
		int[] result = new int[5];
		
		//��ʼ������Ƿ�ɹ������ɹ��򷵻�0�� ���򷵻�-1
		if(arr[0] > 0 && arr[0] <= 10 && arr[1] > 0 && arr[1] < 10) {
			result[0] = 0;
		}else {
			result[0] = -1;
		}
		//���������Ԫ���Ƿ�ɹ�
		if(result[0] == 0 && (arr[2] >= 0 && arr[2] < arr[0] && arr[3] >= 0 && arr[3] < arr[1]) 
				&& (arr[4] >= 0 && arr[4] < arr[0] && arr[5] >= 0 && arr[5] < arr[1]) ) {
			result[1] = 0;
		}else {
			result[1] = -1;
		}
		//����������Ƿ�ɹ�
		if(result[0] == 0 && arr[6] >= 0 && arr[6] < arr[0]) {
			result[2] = 0;
		}else {
			result[2] = -1;
		}
		
		//����������Ƿ�ɹ�
		if(result[0] == 0 && arr[7] >= 0 && arr[7] < arr[1]) {
			result[3] = 0;
		}else {
			result[3] = -1;
		}
		
		//���Ҫ��ѯ���˶��켣�ĵ�Ԫ��ѯ�Ƿ�ɹ�
		if(result[0] == 0 && (arr[8] >= 0 && arr[8] < arr[0] && arr[9] >= 0 && arr[9] < arr[1])){
			result[4] = 0;
		}else {
			result[4] = -1;
		}
		//StringBuilder string = new StringBuilder();
		for(int i : result) {
			System.out.println(i);	
		}
		//return string.toString();	
	}
			

}
