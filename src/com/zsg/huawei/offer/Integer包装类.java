package com.zsg.huawei.offer;

import java.util.Collections;
import java.util.HashMap;

public class Integer��װ�� {
	public static void main(String[] args) {
//		//Integer��new Integer�������
//		Integer a = 100;
//		Integer b = new Integer(100);
//		System.out.println(a == b); //false
//		System.out.println(a.equals(b)); //true;
//		//�������Ƿ�new������Integer���������-128��127֮�䣬����true,����Ϊfalse
//		//������ڸ����䣬���ͨ��new���ð�װ��Ĺ��췽������������
//		Integer a1 = 200;
//		Integer b1 = 200;
//		System.out.println(a1==b1);
//		//int��Integer(����new��)�ȣ���Ϊtrue����Ϊ���Integer�Զ�����Ϊint��ȥ��
//		//��������������αȽϴ�С
		String str = " ";
		//�ɱ��ַ���
//		StringBuilder sb = new StringBuilder(str);
//		sb.setLength(12);
//		System.out.println(sb.length());
//		HashMap<Integer,Integer> map = new HashMap<>();
//		map.containsKey(1);
//		map.containsValue(1);
//		map.put(1, 1);
//		map.put(2, 2);
//		Collections.min(map.values());
//		
//		//װ��Ͳ���
//		String s = "123";
//		System.out.println(Integer.parseInt(s));
//		System.out.println(Integer.parseInt(s, 10));
//		System.out.println(Integer.valueOf(s, 10));
//		Integer in = 12;
//		System.out.println(in.intValue());
		byte[] bs = "m".getBytes();
		System.out.println(bs[0]);
		System.out.println(bs.length);
		byte[] bss = "����".getBytes();
		System.out.println(bss[0] +" " + bss[1]);
		System.out.println(bss.length);
		String s = "��AB";
		char[] ch = s.toCharArray();
		for(char i : ch) {
			System.out.println((i+"").getBytes().length);
			System.out.println(i);
		}
		
	}

}
