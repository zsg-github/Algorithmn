package com.zsg.huawei._��̬�滮;

public class _��ҽ��� {
	public static void main(String[] args) {
		int[] nums = {1 ,2, 3, 6};
		int value = rob(nums);
		System.out.println(value);
	}
	static int rob(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		if(nums.length ==1) return nums[0];
		//arr[i]��ʾ �ӵ�i�ŷ�����ǰ͵�����������
		int[] arr = new int[nums.length];
		//�߽�����
		arr[0] = nums[1];
		arr[1] = Math.max(nums[0], nums[1]);
		//״̬ת�Ʒ���
		for(int i = 2; i < nums.length; i++) {
			//��i��͵�벻͵
			arr[i] = Math.max(nums[i] + arr[i - 2], arr[i - 1]);
		}
		return arr[nums.length -1];
	}

}
