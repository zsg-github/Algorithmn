package com.zsg.huawei._3_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ����ͷ�巨���췴�����������ڼ������Ǵ�ͷ��ʼ���K��
 * @author Lenovo
 *
 */
public class _94_������������е�����K���ڵ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int size = sc.nextInt();
			List<Integer> arrList = new ArrayList<>();
			for(int i = 0; i < size; i++) {
				arrList.add(sc.nextInt());
			}
			int m = sc.nextInt();
			if(m == 0) { //�쳣����
				System.out.println(0);
			}else {
				
				System.out.println(arrList.get(size - m));
				
			}
		}
		sc.close();
	}

}
