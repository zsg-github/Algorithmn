package com.zsg.huawei.offer._4_7;

public class _�����������в������� {
	public int GetNumberOfK(int [] array , int k) {
		if(array.length ==0) return -1;
		int first = getFristK(array,k);
		int last = getLastK(array,k);
		if(first > -1 && last >-1) return last - first +1;
		return -1;
	       
    }
	//�ж��м�ֵ�ǲ��ǵ���K,������K��ǰһ��Ԫ�ز�����K�����ҵ���һ��K,������ǰ����ҵ�һ��k
	//���м�һ����С��K�������ң�����K����ǰ��
	private int getFristK(int[] array, int k) {
		int start = 0;
		int end = array.length -1;
		int midIndex = end / 2;
		while(start <= end) {
			if(array[midIndex] == k) {
				if((midIndex > 0 && array[midIndex -1] != k) ||
						midIndex == 0) {
					return midIndex;
				}else {
					end = midIndex - 1;
				}
				
			}else if(array[midIndex ] < k) {
				start = midIndex + 1;
			}else {
				end = midIndex -1;
			}
			midIndex = (start + end) / 2;	
		}
		return -1;
	}

	private int getLastK(int[] array, int k) {
		int start = 0;
		int end = array.length -1;
		int midIndex = end / 2;
		while(start <= end) {
			if(array[midIndex] == k) {
				if((midIndex < array.length -1 && array[midIndex +1] != k) ||
						midIndex == array.length -1) {
					return midIndex;
				}else {
					start = midIndex + 1;
				}
				
			}else if(array[midIndex ] < k) {
				start = midIndex + 1;
			}else {
				end = midIndex -1;
			}
			midIndex = (start + end) / 2;	
		}
		return -1;
	}

}
