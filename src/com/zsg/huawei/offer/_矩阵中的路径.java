package com.zsg.huawei.offer;

import java.util.Scanner;

public class _矩阵中的路径 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = "abtgsh";
			int m = sc.nextInt();
			int n = sc.nextInt();
			String[][] chArr = new String[m][n];
			for(int i = 0; i< m; i++) {
				for(int j = 0; j < n; j++) {
					chArr[i][j] = sc.next();
				}
			}
			boolean[][] visited = new boolean[m][n];
			int index =0;
			for(int i=0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(hasStringPath(chArr,visited,m,n,i,j,str,index)) {
						System.out.println("true");
					}else {
						System.out.println("false");
					}
				}
			}
		}
	}

	private static boolean hasStringPath(String[][] chArr, boolean[][] visited, int m, int n, int i, int j, String str,
			int index) {
		if(index == str.length()) return true;
		//当前字符在路径上
		boolean hasPath = false;
		//字符串相等判断 equals
		if(i>=0 && i < m && j >=0 && j < n && chArr[i][j].equals(String.valueOf(str.charAt(index)))
				&& !visited[i][j]) {
			//寻找下个一个字符是否相同
			index ++;
			visited[i][j] = true;
			hasPath = hasStringPath(chArr,visited,m,n,i+1,j,str,index) ||
					hasStringPath(chArr,visited,m,n,i-1,j,str,index) ||
					hasStringPath(chArr,visited,m,n,i,j + 1,str,index) ||
					hasStringPath(chArr,visited,m,n,i,j - 1,str,index);
			
		  //判断当前字符的下一个字符是否符合条件，如果不符合则回溯
			if(!hasPath) {
				index--;
				visited[i][j] = false;
			}
			
		}
		return hasPath;
	}


}
