package com.zsg.huawei._2_24;

import java.util.Scanner;

public class _48_DNA���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			int l = sc.nextInt();
			int maxSize = 0;
			String maxSizeStr = "";
			for(int i = 0; i <= str.length() -l; i++) {  //���׺��Ե��ںţ��Ӵ����ȵĵ����ַ�������
				String sub = str.substring(i, i+l);
				int size = 0;
				for(int j = 0; j < sub.length();j++) {
					if(sub.charAt(j) == 'G' || sub.charAt(j)== 'C') {
						size ++;
					}
				}
				if(size > maxSize) {
					maxSize = size;
					maxSizeStr = sub;	
				}
						
			}
			System.out.println(maxSizeStr);
			
		}
		sc.close();
	}

}
