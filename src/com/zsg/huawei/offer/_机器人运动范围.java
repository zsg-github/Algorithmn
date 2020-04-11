package com.zsg.huawei.offer;

public class _机器人运动范围 {
	public static void main(String[] args) {
		System.out.println(movingCount(3, 3, 3));
		
	}
	 public static int movingCount(int threshold, int rows, int cols)
	    {
		 boolean[][] visited = new boolean[rows][cols];
		 int count = movingCountCore(threshold,rows,cols,0,0,visited);
		 return count;
	        
	    }

	private static int movingCountCore(int threshold, int rows, int cols, 
			int row, int col, boolean[][] visited) {
		int count = 0;
		if(check(threshold,rows,cols,row,col,visited)) {
			visited[row][col] = true;
			count = 1 + movingCountCore(threshold,rows,cols,row+1,col,visited)
			+ movingCountCore(threshold,rows,cols,row,col-1,visited)
			//rows错误导致
			+movingCountCore(threshold,rows,cols,row -1,col,visited)
			+movingCountCore(threshold,rows,cols,row,col + 1,visited);
		}
		return count;
	}

	private static boolean check(int threshold, int rows, int cols, int row, int col, boolean[][] visited) {
		if(row >= 0 && row < rows && col>= 0 && col < cols
				&& sum(row,col) <= threshold && ! visited[row][col] ) {
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
