package com.zsg.huawei.�ݹ�ͻ����㷨;

import java.util.Scanner;

public class _���� {
		public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  while(sc.hasNext()) {
			   int m = sc.nextInt();
			   int n = sc.nextInt();
			   int[] arr = new int[m];
			   for(int i =0; i < m; i++) {
			    arr[i] = sc.nextInt();
			   }
			   int max =0;
			   for(int j = 0; j < arr.length; j++) {
				     int t = arr[j];
				     int temp =0;
				   for(int i = 0; i < arr.length; i ++) {
					   if(arr[i] == t) {
						   temp++;
						   
					   }else {
						   int a = arr[i] | n;
						   if(a == t) {
							   temp ++;
						   }
						   
					   }
					   if(temp > max) {
						   max = temp;
					   }
					   
				   }
			   }
			 System.out.println(max);
		}
		sc.close();
	 }			
	
}
