package com.zsg.huawei.offer;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,0,5,7,2,4,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int target = 6;
		int index =  binarySearch(arr,target);
		System.out.println(index);
	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		int mid  = 0;
		//等于零为了两端边界的值
		while(start <= end) {
			mid = (start + end) / 2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
