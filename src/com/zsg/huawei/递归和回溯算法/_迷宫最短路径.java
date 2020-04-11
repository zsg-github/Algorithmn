package com.zsg.huawei.递归和回溯算法;

import java.util.Scanner;
import java.util.Stack;

public class _迷宫最短路径 {
	// 设置全局变量
	private static  int rows;
	private static  int cols;
	private static int[][] map;
	private static Stack<Point> path = new Stack<>();
	private static Stack<Point> bestPath = new Stack<>();
	private static int count =0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			rows = sc.nextInt();
			cols = sc.nextInt();
			map = new int[rows][cols];
			for(int i = 0;i < rows;i++) {
				for(int j = 0;j < cols; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			/**
			 * 全局变量为了多次测试需初始化
			 */
			path.clear();
            bestPath.clear();
            count = 0;
			mapTrack(0,0);
			for(Point p : bestPath) {
				System.out.println("("+p.x + "," + p.y + ")");
			}
			System.out.println(count);
		}
		sc.close();
	}
	
	static void mapTrack(int i,int j) {
		Point p = new Point(i,j);
		path.push(p);
		map[i][j] = 1;
		//找到出口
		if(i == rows - 1 && j == cols -1) {
			count ++;
			if(count == 1) {
				//bestPath = path; 引用传递，若path改变则best也改变
				bestPath.clear();
				for(Point pt : path) {
					bestPath.push(pt);
				}
			}else {
				if(path.size() < bestPath.size()) {
					bestPath.clear();  //清空栈
					for(Point pt : path) {
						bestPath.push(pt);
					}
				}
			}
			
		}
		//向右 
//		if(j + 1 <= cols -1  && map[i][j +1] == 0) {
//			mapTrack(i,j + 1);
//		}
//		//向下
//		if(i + 1 <= rows -1 && map[i +1][j] ==0) {
//			mapTrack(i+ 1,j);
//		}
		//向下
//		if(i -1 >= 0  && map[i - 1][j] == 0) {
//			mapTrack(i-1,j);
//		}
//		//向左
//		if(j - 1 >= 0 && map[i][j - 1] ==0) {
//			mapTrack(i,j - 1);
//		}
		//美团算法题的走法三种
		//向右
		if(j + 1 <= cols -1  && map[i][j + 1] == 0) {
			mapTrack(i,j + 1);
		}
		//向上右方
		if(i - 1 >=0 && j + 1 <= cols -1 && map[i-1][j+1] ==0) {
			mapTrack(i - 1,j + 1);
		}
		//向下右方
		if(i + 1 <= rows -1 && j + 1 <= cols -1 && map[i + 1][j+1] ==0) {
			mapTrack(i + 1,j + 1);
		}
		//返回上一步
		map[i][j] = 0;
		path.pop();
	}
	

}
class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
