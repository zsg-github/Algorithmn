package com.zsg.huawei.offer;
/**
 * 小数点表示任意字符 . \\.表示任意小数本身
 * 表示数值的字符串遵循的：A[.[B]][e|EC] 或者 .B[e|EC]
 */
import java.util.Scanner;
public class _表示数值的字符串 {
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
