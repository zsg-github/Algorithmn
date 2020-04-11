package com.zsg.huawei._��̬�滮;
/**
 * 
 * @author zsg
 *
 */

public class _����01���� {
	public static void main(String[] args) {
		int[] values = {6,3,5,4,6};
		int[] weights = {2,2,6,5,4};
		int capacity = 10;
		System.out.println(maxValue(values,weights,capacity));
	}
	
	static int maxValue(int[] values,int[] weights,int capacity) {
		if(values.length == 0 || values.length == 0 || capacity <= 0) return 0;
		//dp[i][j]����ѡ ��Ʒ������iʱ�����������Ϊjʱ���ļ�ֵ������
		int[][] dp = new int[values.length+1][capacity + 1];
		for(int i = 1; i <= values.length; i++) {
			for(int j = 1; j<= capacity; j++) {
				if(j < weights[i - 1]) {
					dp[i][j] = dp[i - 1][j];
				}else {
					dp[i][j] = Math.max(
							dp[i - 1][j],
							values[i - 1]+ dp[i -1][j - weights[i -1]]);
				}
			}
		}
		return dp[values.length][capacity];
	}

}
