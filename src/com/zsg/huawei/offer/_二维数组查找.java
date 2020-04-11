package com.zsg.huawei.offer;

public class _二维数组查找 {
	
	
	 public boolean Find(int target, int [][] array) {
		 int rows = array.length;
		 int cols = array[0].length;
		 //从左上角开始，若target大于当前这个数着舍弃当前行，如target小于当前这个数，则舍弃列
		 int row = 0;
		 int col = cols -1;
		 while(row < rows && col >=0) {
			 if(array[row][col] == target) {
				 return true;
			 }else if(array[row][col] < target){
				 row ++;
			 }else {
				 col --;
			 }
		 }
		 return false;
	    }
}
