package com.zsg.huawei._�漰��̬�滮����Ŀ;

import java.util.Scanner;

/**
 * ��̬�滮
 * ���������
 * 1.ƻ������m < n,��ôn-m�����ӶԷ��÷�ʽû��Ӱ��
 * 2.ƻ������m >= n �ַ������������
 *   a.������һ�������ӣ� m��ƻ������n-1��������
 *   b.û�п����ӣ�˵��ÿ������������һ������ͬʱ�е�һ�����߲�Ӱ������m- n��ƻ������n��������
 * @author zsg
 *
 */

public class _9_��ƻ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int apple = sc.nextInt();
			int cup = sc.nextInt();
			int ways = getWays(apple,cup);
			System.out.println(ways);
		}
		sc.close();
	}

	private static int getWays(int apple, int cup) {
		//����״̬���� dp[i][j] b��ʾ��i��ƻ������j�����ӵķ���
		int[][] dp = new int[apple+1][cup +1];
		//�߽�����
		for(int i = 0; i <= apple; i++) {
			dp[i][0] = 1;
			dp[i][1] = 1;
		}
		for(int j = 0; j <= cup; j++) {
			dp[0][j] = 1;
			dp[1][j] = 1;
		}
		//״̬ת�Ʒ���
		for(int i = 2; i <= apple; i++) {
			for(int j = 2; j <= cup; j++) {
				if(i < j) {
					dp[i][j] = dp[i][j - 1];
				}else {
					dp[i][j] = dp[i - j][j] + dp[i][j -1];
				}
			}
		}
		return dp[apple][cup];
	}

}
