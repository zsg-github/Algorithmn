package com.zsg.huawei.offer;

import java.util.Arrays;
import java.util.Scanner;

public class �˿����е�˳�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			int[] nums = new int[num];
			for(int i = 0; i < num; i++) {
				String str = sc.next();
				if("j".equals(str)) {
					nums[i] = 11;
				}else if("Q".equals(str)) {
					nums[i] = 12;
				}else if("K".equals(str)) {
					nums[i] = 13;
				}else if("A".equals(str)) {
					nums[i] = 1;
				}else if("Joker".endsWith(str)){
					nums[i] = 0; //0����Joker
				}else {
					nums[i] = Integer.parseInt(str);
				}
				
			}
			System.out.println(isContinuous(nums));
		}
		sc.close();
	}
	
	
	
	 public static boolean isContinuous(int [] numbers) {
		 if(numbers.length == 0) return true;
		 //������
		 Arrays.sort(numbers);
		 //ͳ�ƴ�С������
		 int count = 0;
		 int internal = 0;
		 int preNum =0;
		 boolean first = true;
		 for(int num : numbers) {
			 if(num == 0) count ++;
			 else if(first){
				 preNum = num;
				 first = false;
			 }else {
				 if(preNum == num) return false; //����ͬ���ƿ϶�����˳��
				 internal = internal + (num - preNum -1);
				 preNum = num;
			 }
		 }
		 //ͳ���ܵļ����
		return count >= internal; //���ڵ���

	    }

}
