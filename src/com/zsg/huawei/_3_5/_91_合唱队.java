package com.zsg.huawei._3_5;


import java.util.Scanner;

/**
 * 
��������������У���һ��������ң��ڶ����������Ȼ������鶯̬�滮�Ľ����ӣ�ȡ�����Ǹ���
����8 186 186 150 200 160 130 197 200��
��һ��dp�Ľ���� 1 1 1 2 2 1 3 4��
�ڶ���dp�Ľ��Ϊ3 3 2 3 2 1 1 1����ô��������5��������Ҫ���е�ͬѧ
 *
 */

public class _91_�ϳ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			if(num == 2) System.out.println(0);
			int[] nums = new int[num];
			for(int i = 0; i < num; i++) {
				nums[i] = sc.nextInt();
			}
			//�����������������ÿ��Ԫ�ص������������
			//����״̬
			int[] dpl = new int[num]; 
			//����߽�
			dpl[0] = 1;
			int max = 1;
			//״̬ת�Ʒ���
			for(int i = 0; i < num; i++) {
				dpl[i] = 1;
				for(int j = 0;j < i; j++) {
					if(nums[j] < nums[i]) {
						dpl[i] = Math.max(dpl[i], dpl[j] + 1);
					}
					max = Math.max(dpl[i], max);
				}
			}
			//���������
			int[] dpr = new int[num];
			dpr[num -1] = 1;
			int maxr = 1;
			for(int i = num -1; i >=0; i--) {
				dpr[i] = 1;
				for(int j = num - 1; j > i; j--) {
					if(nums[i] <= nums[j]) continue;  //�����˵��ں�
					dpr[i] = Math.max(dpr[i], dpr[j] + 1);
					maxr = Math.max(dpr[i], maxr);
				}
			}
		int MaxCount = 0;
		for(int i = 0; i < num; i++) {
			int temp = dpl[i] + dpr[i];
			if(temp > MaxCount) {
				MaxCount = temp;
			}
		}
		System.out.println(num - MaxCount +1);
			
		}
	}

}
