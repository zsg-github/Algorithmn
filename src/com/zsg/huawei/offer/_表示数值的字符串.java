package com.zsg.huawei.offer;
/**
 * С�����ʾ�����ַ� . \\.��ʾ����С������
 * ��ʾ��ֵ���ַ�����ѭ�ģ�A[.[B]][e|EC] ���� .B[e|EC]
 */
import java.util.Scanner;
public class _��ʾ��ֵ���ַ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String string = sc.next();
			String strPat1 = "[\\+\\-]?\\d+(\\.\\d*)?([eE][\\+\\-]?\\d+)?";
			String strPat2 = "[\\+\\-]?\\.\\d+([e|E][\\+\\-]?\\d+)?";
			if(string.matches(strPat1) || string.matches(strPat2)) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		sc.close();
		
	}

}
