package com.zsg.huawei.offer;

public class _������ {
	 public static int cutRope(int target) {
		 if(target <2) return 0;
		 if(target ==2) return 1;
		 if(target ==3) return 2;
		 //״̬����
		 int[] dp = new int[target+1];
		 //�߽�����
		 dp[0] = 0;
		 dp[1] = 1;
		 dp[2] = 2;
		 dp[3] = 3;
		 dp[4] = 4;
		 //ת�Ʒ���
		 for(int i = 5; i <= target; i++) {
			 int max = 0;
			 for(int j = 0; j <= i / 2; j++) {
				 int temp = dp[j]*dp[i -j];
				 if(temp > max) max = temp;
			 }
			 dp[i] = max;
		 }
		 return dp[target];
	    }

}
