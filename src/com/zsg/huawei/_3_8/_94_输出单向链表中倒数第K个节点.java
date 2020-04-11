package com.zsg.huawei._3_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 利用头插法构造反向链表，倒数第几个就是从头开始算第K个
 * @author Lenovo
 *
 */
public class _94_输出单向链表中倒数第K个节点 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int size = sc.nextInt();
			List<Integer> arrList = new ArrayList<>();
			for(int i = 0; i < size; i++) {
				arrList.add(sc.nextInt());
			}
			int m = sc.nextInt();
			if(m == 0) { //异常处理
				System.out.println(0);
			}else {
				
				System.out.println(arrList.get(size - m));
				
			}
		}
		sc.close();
	}

}
