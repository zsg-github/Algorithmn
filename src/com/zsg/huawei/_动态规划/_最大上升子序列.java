package com.zsg.huawei._��̬�滮;
/**
 * ����������У�lis)
 * ����һ��������������У����������������еĳ���(Ҫ���ϸ�����)
 * dp[i]����nums[i]��β������������еĳ��ȣ���ʼֵΪ1
 *
 */
public class _������������� {
	public static void main(String[] args) {
		int[] str = {10,2,2,5,1,7,101,18};
		int m  = lengthOfIS(str);
		System.out.println(m);
		
	}
	static int lengthOfIS(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int[] dp = new int[nums.length];
		int max = dp[0] = 1;
		for(int i = 0; i < dp.length; i++) {
			dp[i] = 1;       //dp[i]����nums[i]��β������������еĳ��ȣ���ʼֵΪ1
			for(int j = 0; j < i;j++) {  //��λ��i֮ǰ��ÿ��Ԫ�ز��������Ԫ�ؽ�β������������еĳ��ȣ�
				if(nums[i] <= nums[j]) continue;  //���֮ǰ��Ԫ�ش���λ��i��Ԫ�أ��򲻹�����������������
				dp[i] = Math.max(dp[i],dp[j] + 1);  //����Ļ��ҵ�λ��i��Ԫ��֮ǰ����������У�����1
			}
			max = Math.max(dp[i], max);
		}
		return max;
	}
		

}
