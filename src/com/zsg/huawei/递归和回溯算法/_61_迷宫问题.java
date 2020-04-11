package com.zsg.huawei.递归和回溯算法;
/**
 * 因为题目上说了只有一条通路，而且还要输出这个路径，那么深度优先搜索比较合适
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *    与  广度优先+前驱节点
 *  深度优先搜索 和 树的前序遍历 都是 回溯算法的应用
 * @author zsg
 * 错误：一开始未把起始点入栈，导致stack一开始就是空，没进入while循环
 */
public class _61_迷宫问题 {
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
			//反转路径
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
		//地图大小
		int m = map.length;
		int n = map[0].length;
		//定义出发的方向
		int[][] direct = {{1,0},{0,1}};
		//定义一个栈，保存行走的路径
		Stack<Node> stack = new Stack<>();
		//定义一个与map一样的二维矩阵，标记已走的点
		int[][] visited = new int[m][n];
		//定义起始点
		Node start = new Node(0,0);
		//定义终点
		Node end = new Node(m-1,n-1);
		//将起始点标记为已走的点
		stack.push(start);
		visited[start.x][start.y] = 1;
		while(!stack .isEmpty()) { //如果栈空了还没找到终点，说明不存在通路
			boolean flag = false; //标记是否有下一个点可走
			Node peek = stack.peek();
			//如果栈顶元素等于终点元素，则找到通路，跳出循环
			if(peek.x == end.x && peek.y == end.y) {
				break;
			}else {
				//循环两个方向，
				for(int i = 0;i < 2;i++) {
					Node newSide = new Node(peek.x + direct[i][0] ,peek.y + direct[i][1]);
					//判断旁边的点是否可走
					if(newSide.x < m && newSide.y < n && map[newSide.x][newSide.y] == 0 && visited[newSide.x][newSide.y] == 0) {
						//将符合点入栈
						stack.push(newSide);
						visited[newSide.x][newSide.y] = 1;
						//找到一个可以出发的点
						flag = true;
						//结束这个点的其他方向路径的寻找
						break;	
					}
				}
				//如果找到可走的方向就不用执行下面的出栈，沿着这个方向一直走
				if(flag) {
					continue;
				}
				stack.pop();//如果两个方向都不能通过，则出栈，回溯
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
