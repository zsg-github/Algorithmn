package com.zsg.huawei._3_9;

import java.util.ArrayList;

public class grex {
	public static void main(String[] args) {
//		System.out.println("A12".matches("^[ASDW]{1}[0-9]{1,2}"));
//		System.out.println("A2".matches("^[ASDW]{1}[0-9]{1,2}"));
//		System.out.println("1A".matches("[0-9]{1,2}[ASDW]{1}"));
//		System.out.println("1A".matches("[ASDW]{1}[0-9]{1,2}"));
//		String str = "bssassbcssdss";
//		String[] arr = str.split("[s]{1,}");
//		System.out.println(Arrays.toString(arr));
//		//treeSet��ȥ��������
//		Set<Integer> set  = new TreeSet<>();
//		set.add(12);
//		set.add(19);
//		set.add(1);
//		set.add(67);
//		set.add(9);
//		for(Integer i: set) {
//			System.out.println(i);
//		}
		String num = "b";  //ʮ������
		int n  = Integer.parseInt(num,16); //ʮ����ʾ����
		System.out.println(n); // ���11 ʮ����
		String binaryStr = Integer.toBinaryString(n);
		System.out.println(binaryStr);  //��� 1011 ������
		
	}
}
