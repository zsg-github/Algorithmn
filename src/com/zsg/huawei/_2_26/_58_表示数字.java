package com.zsg.huawei._2_26;
import java.util.Scanner;

public class _58_��ʾ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char[] arr = str.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] - '0' >= 0) && (arr[i] - '0' <= 9)) { // �ж�Ϊ����
				    sb.append("*" + arr[i] + "*");  //���߶�����*
				 } else
				  sb.append(arr[i]);
			 }
			System.out.println(sb.toString().replace("**", "")); //���������м���** �滻��
		}
		sc.close();
	}
}
