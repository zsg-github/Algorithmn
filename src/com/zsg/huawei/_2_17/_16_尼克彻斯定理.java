package com.zsg.huawei._2_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16_尼克彻斯定理 {
	/**
	 * 解题思路：整数m的立方都可以写成m个连续奇数之和，m的立方除以m的结果i就是这m个数的平均值，即中间值
	 * 由这个中间值往左右找出这m个连续奇数
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            int n = Integer.parseInt(line);
	            getSequeOddNum(n);   
	        }
	}
	
	 public static void getSequeOddNum(int m){   
		 StringBuilder str = new StringBuilder();
	     int aver = m*m;
	     if(aver % 2 ==0) { //中间值aver为偶数
	    	 int min = aver + 1 - m;
	    	 for(int i = 0; i < m-1; i++) {
		    		str.append(min).append("+");
		    		min += 2; 
	    	 }
	    	 str.append(min);
	     }else {
	    	 int min = aver - (m/2)*2;
	    	 for(int i = 0; i < m-1; i++) {
		    		str.append(min).append("+");
		    		min += 2; 
	    	 }
	    	 str.append(min); 
	     }
	     System.out.println(str.toString());
	 }
}
