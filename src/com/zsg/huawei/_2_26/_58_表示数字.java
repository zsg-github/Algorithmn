package com.zsg.huawei._2_26;
import java.util.Scanner;

public class _58_表示数字 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			char[] arr = str.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] - '0' >= 0) && (arr[i] - '0' <= 9)) { // 判断为数字
				    sb.append("*" + arr[i] + "*");  //两边都加上*
				 } else
				  sb.append(arr[i]);
			 }
			System.out.println(sb.toString().replace("**", "")); //两个数字中间有** 替换掉
		}
		sc.close();
	}
}
