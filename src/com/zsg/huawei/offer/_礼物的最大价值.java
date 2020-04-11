package com.zsg.huawei.offer;

import java.util.Scanner;

public class _礼物的最大价值 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] giftArr = new int[m][n];
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					giftArr[i][j] = sc.nextInt();
				}
			}
			int maxValue = getGiftValue(giftArr);
			System.out.println(maxValue);
		}
		sc.close();
	}

	private static int getGiftValue(int[][] giftArr) {
		// TODO Auto-generated method stub
		if(giftArr.length == 0 || giftArr[0].length == 0) return 0;
		//状态方程
		int[][] maxValue = new int[giftArr.length][giftArr[0].length];
		//边界条件
		//状态转移
		for(int i = 0; i < giftArr.length; i++) {
			for(int j = 0; j < giftArr[0].length; j++) {
				int up = 0;
				int left = 0;
				if(i  > 0) {  //我的错误 ，大于0即可
					up = maxValue[i - 1][j];
				}
				if(j > 0) {
					left = maxValue[i][j - 1];
				}
				maxValue[i][j] = Math.max(up, left) + giftArr[i][j];
			}
		}
		for(int i = 0; i < giftArr.length; i++) {
			for(int j  = 0; j < giftArr[0].length; j++) {
				System.out.print(maxValue[i][j] + " ");
			}
			System.out.println();
		}
		return maxValue[giftArr.length - 1][giftArr[0].length - 1];
	}

}
