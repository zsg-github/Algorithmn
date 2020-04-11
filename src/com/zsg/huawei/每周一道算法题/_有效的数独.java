package com.zsg.huawei.ÿ��һ���㷨��;

import java.util.Scanner;

public class _��Ч������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int[][] board = new int[9][9];
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					board[i][j] =sc.nextInt();
				}
			}
			boolean flag = isValidSudoKu(board);
			System.out.println(flag);
		}
		sc.close();
	}
	static boolean isValidSudoKu(int[][] board) {
		//����Ϊ10���ܴ��9��rows[i][j]��ʾ���±�Ϊi��λ�ô��j
		boolean[][] rows = new boolean[9][10];
		boolean[][] cols = new boolean[9][10];
		boolean[][] boxs = new boolean[9][10];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j ++) {
				int num = board[i][j];
				if(num == 0) continue;
				if(rows[i][num]) return false;
				if(cols[j][num]) return false;
				//��������= (�� / 3) * 3 + �� / 3
				int boxIndex = (i / 3) * 3 + j / 3;
				if(boxs[boxIndex][num]) return false;
				rows[i][num]= true;
				cols[j][num] = true;
				boxs[boxIndex][num] = true;	
			}
		}
		return true;
	}

}
