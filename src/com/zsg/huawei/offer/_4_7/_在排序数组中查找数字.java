package com.zsg.huawei.offer._4_7;

public class _在排序数组中查找数字 {
	public int GetNumberOfK(int [] array , int k) {
		if(array.length ==0) return -1;
		int first = getFristK(array,k);
		int last = getLastK(array,k);
		if(first > -1 && last >-1) return last - first +1;
		return -1;
	       
    }
	//判断中间值是不是等于K,若等于K且前一个元素不等于K，则找到第一个K,否则在前半段找第一个k
	//若中间一个数小于K则往后找，大于K则往前找
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
