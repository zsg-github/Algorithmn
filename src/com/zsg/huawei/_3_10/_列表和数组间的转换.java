package com.zsg.huawei._3_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _�б��������ת�� {
	public static void main(String[] args) {
		int num = Integer.parseInt("-1");
		System.out.println(num);
		//������б���ת��
		List<String> list = new ArrayList<>();
		String[] s1 = new String[] {"aa","bb","cc"};
		//����ת�����б�
		list = Arrays.asList(s1);
		//��ת�б�
		Collections.reverse(list);
		//�б�ת�ɳ�����
		/**
		 *  Object[] toArray()
			<T> T[] toArray(T[] a)

		 */
		String[] s = new String[3];
		s = (String[]) list.toArray();
		//�ڶ��ַ�ʽתlist������
		list.toArray(s);
		//list.toArray()�൱��list.toArray(new Object[]);
		System.out.println(s[0]);
		//new String[0]������һ��ģ������ã�ָ���˷�����������ͣ�0��Ϊ�˽�ʡ�ռ䣬��Ϊ��ֻ��Ϊ��˵�����ص�����
		s = list.toArray(new String[0]);
		System.out.println(s[0]);
		List<Integer> nums = new ArrayList<>();
		nums.add(11);
		nums.add(44);
		//Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer
		//Integer[]������Object[]�����ࡣ��Ȼ��Integer�̳���Object,��Integer[]��ֱ�Ӹ�����Object��
		//������������Զ�����ÿ����Ա�ֱ�ת����
		//Integer[] arr = (Integer[])nums.toArray(); ����ת��
		//���Խ������б�ת������������
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
