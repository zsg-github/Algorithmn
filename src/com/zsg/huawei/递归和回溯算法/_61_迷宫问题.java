package com.zsg.huawei.�ݹ�ͻ����㷨;
/**
 * ��Ϊ��Ŀ��˵��ֻ��һ��ͨ·�����һ�Ҫ������·������ô������������ȽϺ���
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *    ��  �������+ǰ���ڵ�
 *  ����������� �� ����ǰ����� ���� �����㷨��Ӧ��
 * @author zsg
 * ����һ��ʼδ����ʼ����ջ������stackһ��ʼ���ǿգ�û����whileѭ��
 */
public class _61_�Թ����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] map = new int[m][n];
			for(int i = 0;i < m;i++) {
				for(int j = 0;j < n; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			//��ת·��
			Stack<Node>  stack = getPath(map);
			Stack<Node>  stackPath = new Stack<Node>();
			while(!stack.isEmpty()) {
				stackPath.push(stack.peek());
				stack.pop();
			}
			while(!stackPath.isEmpty()) {
				Node node = stackPath.pop();
				System.out.println("("+node.x + "," + node.y + ")");
			}
		}
		sc.close();
	}
	
	public static Stack<Node> getPath(int[][] map) {
		//��ͼ��С
		int m = map.length;
		int n = map[0].length;
		//��������ķ���
		int[][] direct = {{1,0},{0,1}};
		//����һ��ջ���������ߵ�·��
		Stack<Node> stack = new Stack<>();
		//����һ����mapһ���Ķ�ά���󣬱�����ߵĵ�
		int[][] visited = new int[m][n];
		//������ʼ��
		Node start = new Node(0,0);
		//�����յ�
		Node end = new Node(m-1,n-1);
		//����ʼ����Ϊ���ߵĵ�
		stack.push(start);
		visited[start.x][start.y] = 1;
		while(!stack .isEmpty()) { //���ջ���˻�û�ҵ��յ㣬˵��������ͨ·
			boolean flag = false; //����Ƿ�����һ�������
			Node peek = stack.peek();
			//���ջ��Ԫ�ص����յ�Ԫ�أ����ҵ�ͨ·������ѭ��
			if(peek.x == end.x && peek.y == end.y) {
				break;
			}else {
				//ѭ����������
				for(int i = 0;i < 2;i++) {
					Node newSide = new Node(peek.x + direct[i][0] ,peek.y + direct[i][1]);
					//�ж��Աߵĵ��Ƿ����
					if(newSide.x < m && newSide.y < n && map[newSide.x][newSide.y] == 0 && visited[newSide.x][newSide.y] == 0) {
						//�����ϵ���ջ
						stack.push(newSide);
						visited[newSide.x][newSide.y] = 1;
						//�ҵ�һ�����Գ����ĵ�
						flag = true;
						//������������������·����Ѱ��
						break;	
					}
				}
				//����ҵ����ߵķ���Ͳ���ִ������ĳ�ջ�������������һֱ��
				if(flag) {
					continue;
				}
				stack.pop();//����������򶼲���ͨ�������ջ������
			}	
		}
		return stack;
		
	}

}

class Node {
	int x;
	int y;
	Node(int x,int y){
		this.x = x;
		this.y = y;
	}
}
