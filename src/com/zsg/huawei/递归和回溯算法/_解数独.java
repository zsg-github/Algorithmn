package com.zsg.huawei.�ݹ�ͻ����㷨;

import java.util.Scanner;

public class _������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int[][] board = new int[9][9];
			boolean[][] rows = new boolean[9][10];
			boolean[][] cols = new boolean[9][10];
			boolean[][] boxs = new boolean[9][10];
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					int num = sc.nextInt();
					board[i][j] =num;
					if(num >0 && num < 10) {
						rows[i][num]= true;
						cols[j][num] = true;
						//��������= (�� / 3) * 3 + �� / 3
						int boxIndex = (i / 3) * 3 + j / 3;
						boxs[boxIndex][num] = true;
					}
				}
			}
			// �ݹ鳢��������� 
			solveSoDoKu(board,0,rows,cols,boxs);
			//������
			for(int row =0; row < 9; row++) {
				for(int col = 0; col < 9; col ++) {
					System.out.print(board[row][col] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
	static boolean solveSoDoKu(int[][] board,int n,boolean[][] rows,
			boolean[][] cols, boolean[][] boxs) {
		if(n == 81) return true;
		int row = n /9;
		int col = n % 9;
		if(board[row][col] == 0) {
			int k = row / 3 * 3 + col /3;
			for(int num = 1; num <= 9; num++) {
				//��������
				if(! (rows[row][num] || cols[col][num] || boxs[k][num])) {
					board[row][col] = num;
					rows[row][num]= true;
					cols[col][num] = true;
					boxs[k][num] = true;
					if(solveSoDoKu(board, n+1, rows,cols,boxs)) return true;
					//����
					board[row][col] = 0;
					rows[row][num]= false;
					cols[col][num] = false;
					boxs[k][num] = false;
					
				}
				
			}
			
		}else {
			return solveSoDoKu(board, n+1, rows,cols,boxs);
		}
		return false;
		
	}
}
