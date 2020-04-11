package _2_数学数值处理;

import java.util.Scanner;
/**
 * 假设有两个数x和y，存在一个最大公约数z=(x,y)，即x和y都有公因数z， 
那么x一定能被z整除，y也一定能被z整除，所以x和y的线性组合mx±ny也一定能被z整除。（m和n可取任意整数）

对于辗转相除法来说，思路就是： 
若x>y，设x/y=n余c， 
则x能表示成x=ny+c的形式， 
将ny移到左边就是x-ny=c，由于一般形式的mx±ny能被z整除， 
所以等号左边的x-ny（作为mx±ny的一个特例）就能被z整除， 
即x除y的余数c也能被z整除。
 */
public class _20_求最小公倍数 {
	//最小公倍数 = 两数之积除以最大公约数
	//求最大公约数
	public static int getResult(int m ,int n){
        if(m<n){
            int temp=m;
            m=n;
            n=temp;
        }
        int k;
        while(n!=0){
            k=m%n;
            m=n;
            n=k;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(m*n/getResult(m, n));
        }
        scanner.close();
    }

}
