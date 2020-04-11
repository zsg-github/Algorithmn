package com.zsg.huawei.offer;

import java.util.Collections;
import java.util.HashMap;

public class Integer包装类 {
	public static void main(String[] args) {
//		//Integer与new Integer不会相等
//		Integer a = 100;
//		Integer b = new Integer(100);
//		System.out.println(a == b); //false
//		System.out.println(a.equals(b)); //true;
//		//两个都是非new出来的Integer，如果数在-128到127之间，则是true,否则为false
//		//如果不在该区间，则会通过new调用包装类的构造方法来创建对象
//		Integer a1 = 200;
//		Integer b1 = 200;
//		System.out.println(a1==b1);
//		//int和Integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比
//		//基本数据类型如何比较大小
		String str = " ";
		//可变字符串
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
//		//装箱和拆箱
//		String s = "123";
//		System.out.println(Integer.parseInt(s));
//		System.out.println(Integer.parseInt(s, 10));
//		System.out.println(Integer.valueOf(s, 10));
//		Integer in = 12;
//		System.out.println(in.intValue());
		byte[] bs = "m".getBytes();
		System.out.println(bs[0]);
		System.out.println(bs.length);
		byte[] bss = "我是".getBytes();
		System.out.println(bss[0] +" " + bss[1]);
		System.out.println(bss.length);
		String s = "我AB";
		char[] ch = s.toCharArray();
		for(char i : ch) {
			System.out.println((i+"").getBytes().length);
			System.out.println(i);
		}
		
	}

}
