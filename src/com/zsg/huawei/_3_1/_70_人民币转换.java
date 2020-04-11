package com.zsg.huawei._3_1;

import java.util.Scanner;
/**
 * int、unsigned、long、unsigned long 、double的数量级最大都只能表示为10亿，
 * 即它们表示十进制的位数不超过10个，即可以保存所有9位整数。而short只是能表示5位；
 * @author zsg
 *
 */

public class _70_人民币转换 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] arr = str.split("\\.");
			char[] ch = arr[0].toCharArray();
			String[] val = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
			String[] de  =  {"元","拾","佰","仟","万","亿"};
			String[] re = {"分", "角"};
			double  num = Double.parseDouble(arr[0]);
			//StringBuilder RMB = new StringBuilder();
			String rmb = "";
			//一开始将一个数的每一位翻译成大写，如果是整数部分是6001，正翻译成"陆仟零零壹"，
			//后面再统一处理字符串，将"零零"替换成"零"即可
			for(int i = 0; i < ch.length; i++) {
				if( i ==0) {
					int index = (int)num % 10;
					rmb =val[index] + de[0] + rmb;
					num = num / 10;	
				}
				else if( i < 4) {
					int index =(int) num % 10;
					if(index == 0) {
						rmb =val[index]  + rmb;	

					}else {
						rmb =val[index] + de[i] + rmb;	
					}
					num = num / 10;	
				}else if( i ==4){
				    int index = (int) num % 10;
				    rmb = val[index] + "万" + rmb;
				    num = num / 10; 
				}else if(i < 8) {
					 int index = (int) num % 10;
					 if(index == 0) {
						 rmb = val[index]  + rmb;
					 }else {
						 rmb = val[index] + de[i - 4] + rmb; 
					 }
					 num = num / 10;
				}else if( i == 8) {
					int index = (int) num % 10;
				    rmb = val[index] + "亿" + rmb;
				    num = num / 10;
				}else {
					int index = (int) num % 10;
					 rmb = val[index] + de[i - 8] + rmb;
					 num = num / 10;
				}
				
			}
			rmb = rmb.replace("零零", "零");
			
			//这里处理当各位 、万位，亿位为零的情况，101120 我翻译成"壹拾零万壹仟壹佰贰拾零元" 
			//我需要将"零万" "零元"替换成"万""元"就ok
			//处理小于一元 的面值
			if("0".equals(arr[0])) {
				rmb = rmb.replace("零元", "");
				
			}else {
				rmb = rmb.replace("零元", "元");
			}
			rmb = rmb.replace("零万", "万");
			rmb = rmb.replace("零亿", "亿");
			String rem ="";
			//处理小数点后面的数
			if("00".equals(arr[1])) {
				rem = rem + "整";
			}else {
				int m = Integer.parseInt(arr[1]);
				for(int i = 0; i<arr[1].length();i++) {
					int index = m % 10;
					m = m / 10;
					if(index ==0) continue;
					rem =val[index] + re[i] + rem;
				}
			}
			//解决开始位置千百位为零的情况
			if(arr[0].length() > 1) {
				String sub = rmb.substring(0,2);
				if("壹拾".equals(sub)) {
					rmb = "拾" + rmb.substring(2);
				}	
			}

			rmb = "人民币" +rmb + rem;
			System.out.println(rmb);
	}
	}	

}
