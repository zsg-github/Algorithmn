package com.zsg.huawei._2_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _19_百钱买百鸡问题 {
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = "";
	        while ((line = br.readLine()) != null) {
	        	for(int i = 0;i <= 20;i++) {
	        		for(int j = 0; j <= 33;j++) {
	        			if(7*i + 4*j == 100) {
	        				System.out.println(i+" "+j+" "+(100-i-j));
	        			}
	        		}
	        	}
	        }
	}

}
