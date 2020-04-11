package com.zsg.huawei._2_20;

import java.util.Scanner;

public class _34_矩阵乘法 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int row1 = scanner.nextInt();
			int colRow = scanner.nextInt();
			int col2 = scanner.nextInt();
			
			int[][] A = new int[row1][colRow];
			int[][] B = new int[colRow][col2];
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < colRow; j++) {
					A[i][j] = scanner.nextInt();
					
				}
			}
			for(int i = 0; i < colRow; i++) {
				for(int j = 0; j < col2; j++) {
					B[i][j] = scanner.nextInt();
					
				}
			}
			//开始相乘
			int[][] result = new  int[row1][col2];
			//行
			for(int m = 0; m < row1; m++) {
				for(int n = 0; n < col2; n++) {
					int cij = 0;
					for(int i = 0; i < colRow; i++) {
						cij = cij + A[m][i] * B[i][n];
					}
					result[m][n] = cij;			
				}
			}
			//输出
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < col2;j++) {   //列
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
	

}
