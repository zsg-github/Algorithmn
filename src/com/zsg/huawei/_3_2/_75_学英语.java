package com.zsg.huawei._3_2;

import java.util.Scanner;

/**
 * 每次处理三个数
 * @author zsg
 *
 */
public class _75_学英语 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long num = sc.nextLong();
			String str = getRead(num);
			System.out.println(str);
		}
		sc.close();
	}
	
	static String getRead(long num) {
		if(num == 0) return "zero";
		String[] str1 = {"zero","one","two","three","four","five","six","seven","eight","nine",
				"ten","eleven","twelve","thirteen","fourteem","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] str2 = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String[] str3 = {"thousand","million","billion"};
		String strRead = "";
		int de =0;
		while(num > 0) {
			String str = "";
			int m = (int) num % 1000;
			if(m == 0) continue; 
			if(m <20) {
				str = str1[m];
			}else if(m < 100) {
				int index = m % 10;
				str = str1[index];
				index= m / 10;
				str =str2[index - 2] +" " +str;
				
			}else {
				if(m % 100 < 20) {
				 int index = m % 100;
				 str = str1[index];
				 m  = m / 100;
				 str = str1[m] + " hundred and " + str;
				}else {
					int index = m % 10;
					str = str1[index];
					m= m / 10;
					index = m % 10;
					//数组从twenty开始
					str = str2[index - 2] + " " + str;
					index = m /10;	
					str = str1[index] + " hundred and " + str;		
				}
			}
			strRead = str +" "+ strRead;
			num = num / 1000;
			if(num > 0) {
				strRead =str3[de++] + " " + strRead; 
			}
		}
		//处理zero
		strRead = strRead.replace(" zero", "");
		return strRead;
	}

}

