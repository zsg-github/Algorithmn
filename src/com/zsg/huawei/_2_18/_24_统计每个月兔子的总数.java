package com.zsg.huawei._2_18;

import java.util.Scanner;

public class _24_ͳ��ÿ�������ӵ����� {
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
	        while(in.hasNext()){
	          String s=in.next();
	          int m = Integer.parseInt(s);
	          int a=1,b=0,c=0;//a:һ������������b����������������c�����������Ӹ���
	          for(int i = 1; i < m; i++) { 
	            c = c + b;
	            b = a;
	            a = c;
	          }
	          System.out.println(a+b+c);
	    }
	    in.close();
	}
}
