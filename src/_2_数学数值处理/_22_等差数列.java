package _2_数学数值处理;

import java.util.Scanner;
public class _22_等差数列 {
	public static void main(String args[]){
        Scanner in=new Scanner(System.in);
         while (in.hasNext()) {
             int N = in.nextInt();
             if(N < 0) {
            	 System.out.println(-1); 
             }else {
            	 int sum = 0;
            	 sum = N * 2 + (N*(N-1)*3)/2; 
            	 System.out.println(sum);
             } 
           }
         in.close();
         }
}
