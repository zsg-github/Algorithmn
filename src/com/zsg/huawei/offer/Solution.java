package com.zsg.huawei.offer;

public class Solution {
	public static void main(String[] args) {
		System.out.println(movingCount(5, 10, 10));
	}
 
    public static int movingCount(int threshold, int rows, int cols) {
        int flag[][] = new int[rows][cols]; //记录是否已经走过
        return helper(0, 0, rows, cols, flag, threshold);
    }
 
    private static int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
    	int count = 0;
        if (check(threshold,rows,cols,i,j,flag)) {
        	flag[i][j] = 1;
        	count = helper(i -1, j, rows, cols, flag, threshold)
        			+ helper(i, j +1, rows, cols, flag, threshold)
        			+ helper(i + 1, j, rows, cols, flag, threshold)
        			+ helper(i , j-1, rows, cols, flag, threshold)
        			+ 1;
        }
        return count;
    }
    private static boolean check(int threshold, int rows, int cols, int row, int col, int[][] flag) {
		if(row >= 0 && row < rows && col>= 0 && col < cols
				&& sum(row,col) <= threshold && flag[row][col] != 1) {
			return true;
		}
		return false;
	}
 
    private static int sum(int row, int col) {
		int sum = 0;
		while(row > 0) {
			sum = sum + row % 10;
			row = row / 10;
		}
		while(col > 0) {
			sum = sum + col % 10;
			col = col / 10;
		}
		return sum;
	}
}