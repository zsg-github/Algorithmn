package com.zsg.huawei._2_19;

import java.util.Scanner;
import java.util.Stack;

public class _30_���γ˷���������ֵ {
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
				//����(�����κδ���
			}else if(str.charAt(i) == ')') {      //����)��ʼ����(A(BC))������BC��ˣ�����A��BC��˵Ľ�����
				if(stack.size() == 1) continue;   //���������Լ�
				//����ջ��������������ĳ˷�����������������˵ľ���һ������ջ��
				InformationOfMatrix temp1 = stack.peek();  //temp1��ʾ����C
				stack.pop();
				InformationOfMatrix temp2 = stack.peek();  //temp1��ʾ����C
				multiCount = temp2.getMutipleTimes(temp1);
				result = result +multiCount;
				stack.pop();
				//���������������ľ�����˴�����,���µľ�����ջ
				stack.push(new InformationOfMatrix(temp2.row,temp1.col));
			}else { //��ջ
				stack.push(arr[str.charAt(i)-'A']);	
			}

		}
		return result;
	}
	
}
/**
 *  ��һ��������ʾ����
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
