package com.zsg.huawei._3_4;

import java.util.Scanner;

public class _81_���ַ������ҳ�����������ִ� {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			if("".equals(str)){
				System.out.println("");
				break;
			}
			//�������ֵ��ַ����зָ�
			String[] nums = str.split("[^0-9]{1,}");
			if(nums.length == 0) {
				System.out.println("");
				break;
			}
			int max = 0;
			//���ҵ���󳤶�
			for(int i = 0;i < nums.length;i++) {
				if(max < nums[i].length()) {
					max = nums[i].length();
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < nums.length;i++) {
				if(nums[i].length() == max) {
					sb.append(nums[i]);
				}
			}
			System.out.println(sb.toString() + ","+max);
			
		}
		sc.close();
	}

}
