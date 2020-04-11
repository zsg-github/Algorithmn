package com.zsg.huawei._2_19;

import java.util.Scanner;
import java.util.Stack;

public class _30_矩形乘法计算量估值 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){ 
			int m = scanner.nextInt();
			InformationOfMatrix[] arr= new InformationOfMatrix[m];
			for(int i = 0; i < m; i++) {
				int row = scanner.nextInt();
				int col = scanner.nextInt();
				arr[i] = new InformationOfMatrix(row,col);	
			}
			String str = scanner.next();
			int count = getMultiCount(arr,str);
			System.out.println(count);
		}
		scanner.close();
	}
	
	private static int getMultiCount(InformationOfMatrix[] arr,String str) {
		int result = 0;
		int multiCount = 0;
		Stack<InformationOfMatrix> stack = new Stack<>();
		for(int i = 0;i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				//遇到(不做任何处理
			}else if(str.charAt(i) == ')') {      //遇到)开始计算(A(BC))：先让BC相乘，再让A和BC相乘的结果相乘
				if(stack.size() == 1) continue;   //处理错误测试集
				//计算栈弹出的两个矩阵的乘法次数，并把两个相乘的矩阵一个放入栈中
				InformationOfMatrix temp1 = stack.peek();  //temp1表示矩阵C
				stack.pop();
				InformationOfMatrix temp2 = stack.peek();  //temp1表示矩阵C
				multiCount = temp2.getMutipleTimes(temp1);
				result = result +multiCount;
				stack.pop();
				//计算两个弹出来的矩阵相乘次数后,将新的矩阵入栈
				stack.push(new InformationOfMatrix(temp2.row,temp1.col));
			}else { //入栈
				stack.push(arr[str.charAt(i)-'A']);	
			}

		}
		return result;
	}
	
}
/**
 *  用一个类来表示矩阵
 * @author zsg
 *
 */
class InformationOfMatrix{
    int row;
    int col;
    public InformationOfMatrix(int row, int col){
        this.row = row;
        this.col = col;
    }
    public int getMutipleTimes(InformationOfMatrix B) { return this.row * this.col * B.col; }
}
