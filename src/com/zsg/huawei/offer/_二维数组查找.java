package com.zsg.huawei.offer;

public class _��ά������� {
	
	
	 public boolean Find(int target, int [][] array) {
		 int rows = array.length;
		 int cols = array[0].length;
		 //�����Ͻǿ�ʼ����target���ڵ�ǰ�������������ǰ�У���targetС�ڵ�ǰ���������������
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
