package _5_�ݹ���ݴ���;

//˼�룺��������3����5�ĸ��Է�Ϊһ�飬��Ϊsum1��sum2��ʣ��ı���������nums��
//�������飬ʣ��nums�����Ҫô��sum1��Ҫô��sum2����õݹ����η���sum1��sum2��
//����nums�������ȫ���Ž�ȥ����sum1 == sum2���򷵻�true�����򣬷���false
import java.util.Scanner;

public class _54_JAVA��Ŀ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] nums = new int[n];
			int index = 0;
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0;i < n;i++) {
				int temp = sc.nextInt();
				if(temp % 5 == 0) sum1 = sum1 +temp;
				else if(temp % 3 == 0) sum2 = sum2 + temp;
				else nums[index++] = temp;
			}
			System.out.println(isExists(sum1,sum2,nums,0));
		}
		sc.close();
	}
	public static Boolean isExists(int sum1,int sum2,int[] nums,int index) {
		if(index == nums.length) { //��Ϊnums.length��������Ĵ�����������������������3,5�������Ǳ���index == nums.length�������ֵ�У�3,5�������ĳ�ʼ����ֵ��Ϊ��ʱ��index == nums.length���Լ�ȥ��3,5���ĸ���������ûӰ��
			return sum1 == sum2;
		}else {
			return isExists(sum1 + nums[index],sum2,nums,index+1) || isExists(sum1, sum2 + nums[index],nums,index+1);
		}
	}
}
