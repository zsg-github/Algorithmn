package com.zsg.huawei._2_18;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class _25_求最大连续bit数 {
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
	        while(in.hasNext()){
	          String a=in.next();
	          BigInteger b = new BigInteger(a);
	          String str = b.toString(2);
	          System.out.println(str);
	          String[] s = str.split("0");
	          System.out.println(Arrays.toString(s));
	          int maxLen = 0;
	          for(int i = 0;i < s.length;i++) {
	        	  if(s[i].length() > maxLen) {
	        		  maxLen = s[i].length();
	        	  }
	          }
	          System.out.println(maxLen);
	        }
	        in.close();
	}
}
