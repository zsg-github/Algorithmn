package _5_递归回溯处理;

//思想：将能整除3或者5的各自分为一组，记为sum1和sum2，剩余的保存在数组nums里
//现有两组，剩余nums里的数要么在sum1里要么在sum2里，利用递归依次放在sum1和sum2中
//最终nums里的数字全部放进去，若sum1 == sum2，则返回true，否则，返回false
import java.util.Scanner;

public class _54_JAVA题目 {
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
		if(index == nums.length) { //因为nums.length大于里面的存的数，输入的数都不包含（3,5倍数）是必须index == nums.length。输入的值有（3,5倍数）的初始化的值都为零时，index == nums.length可以减去（3,5）的个数，所有没影响
			return sum1 == sum2;
		}else {
			return isExists(sum1 + nums[index],sum2,nums,index+1) || isExists(sum1, sum2 + nums[index],nums,index+1);
		}
	}
}
