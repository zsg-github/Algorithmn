package com.zsg.huawei._2_18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class _23_高精度整数加法 {
	 public static void main(String[] args) {
	        Scanner in=new Scanner(System.in);
	        while(in.hasNext()){
	          String a=in.next();
	          String b=in.next();
	          BigInteger c=new BigInteger(a);
	          BigInteger d=new BigInteger(b);
	          //BigInteger bd = BigInteger.valueOf(10);
	          //数值溢出时采用二进制字符串表示
	          BigInteger e = c.add(d);
	          System.out.println(e);
//	          System.out.println(c.add(d));
//	          BigDecimal big1 = new BigDecimal("100"); 
//	          BigDecimal big2 = new BigDecimal("100");
//	          //大整数相加后生成一个新对象，原来的加数大小不变
//	          System.out.println(big1.add(big2));
//	          System.out.println(big1);
	        }  
	        in.close();
	    }
}
