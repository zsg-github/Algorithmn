package com.zsg.huawei._2_18;

import java.util.Scanner;
public class _22_µÈ²îÊıÁĞ {
	public static void main(String args[]){
        Scanner in=new Scanner(System.in);
         while (in.hasNext()) {
             int N = in.nextInt();
             if(N < 0) {
            	 System.out.println(-1); 
             }else {
            	 int sum = 0;
            	 sum = N * 2 + (N*(N-1)*3)/2; 
            	 System.out.println(sum);
             } 
           }
         in.close();
         }
}
