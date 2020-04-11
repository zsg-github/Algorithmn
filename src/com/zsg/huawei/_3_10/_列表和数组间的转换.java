package com.zsg.huawei._3_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _列表和数组间的转换 {
	public static void main(String[] args) {
		int num = Integer.parseInt("-1");
		System.out.println(num);
		//数组和列表间的转换
		List<String> list = new ArrayList<>();
		String[] s1 = new String[] {"aa","bb","cc"};
		//数组转换成列表
		list = Arrays.asList(s1);
		//反转列表
		Collections.reverse(list);
		//列表转成成数组
		/**
		 *  Object[] toArray()
			<T> T[] toArray(T[] a)

		 */
		String[] s = new String[3];
		s = (String[]) list.toArray();
		//第二种方式转list成数组
		list.toArray(s);
		//list.toArray()相当于list.toArray(new Object[]);
		System.out.println(s[0]);
		//new String[0]就是起一个模板的作用，指定了返回数组的类型，0是为了节省空间，因为它只是为了说明返回的类型
		s = list.toArray(new String[0]);
		System.out.println(s[0]);
		List<Integer> nums = new ArrayList<>();
		nums.add(11);
		nums.add(44);
		//Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer
		//Integer[]并不是Object[]的子类。虽然，Integer继承自Object,但Integer[]的直接父类是Object。
		//解决方案，可以对数组每个成员分别转化：
		//Integer[] arr = (Integer[])nums.toArray(); 错误转换
		//可以将整形列表转换成整形数组
		Integer[] arr = nums.toArray(new Integer[0]);
		System.out.println(arr[0]);
		Integer[] n = {1,2,3};
	    String[] str= {"qq"};            
	    System.out.println(str.getClass().getName());            
	    System.out.println(n.getClass().getName());
	    ArrayList<String> l=new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            l.add(""+i);
        }
         
        String[] array= (String[]) list.toArray();
        System.out.println(array);
	}

	
}
