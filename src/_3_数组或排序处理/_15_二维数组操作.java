package _3_数组或排序处理;

import java.util.Arrays;
import java.util.Scanner;

public class _15_二维数组操作 {
	public static void main(String[] args) {
		/**
		 * next():只读取输入直到空格。它不能读两个由空格或符号隔开的单词。此外，next()在读取输入后将光标放在同一行中。
		 * (next()只读空格之前的数据,并且光标指向本行)
		 * nextLine():读取输入，包括单词之间的空格和除回车以外的所有符号(即。它读到行尾)。
		 * 读取输入后，nextLine()将光标定位在下一行。
		 */
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		while(scanner.hasNext()) {
			for(int i = 0; i < 10; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			solve(arr);
		}
		//scanner.close();
	}
	
	public static void solve(int[] arr) {
		int[] result = new int[5];
		
		//初始化表格是否成功，若成功则返回0， 否则返回-1
		if(arr[0] > 0 && arr[0] <= 10 && arr[1] > 0 && arr[1] < 10) {
			result[0] = 0;
		}else {
			result[0] = -1;
		}
		//输出交换单元格是否成功
		if(result[0] == 0 && (arr[2] >= 0 && arr[2] < arr[0] && arr[3] >= 0 && arr[3] < arr[1]) 
				&& (arr[4] >= 0 && arr[4] < arr[0] && arr[5] >= 0 && arr[5] < arr[1]) ) {
			result[1] = 0;
		}else {
			result[1] = -1;
		}
		//输出插入行是否成功
		if(result[0] == 0 && arr[6] >= 0 && arr[6] < arr[0]) {
			result[2] = 0;
		}else {
			result[2] = -1;
		}
		
		//输出插入列是否成功
		if(result[0] == 0 && arr[7] >= 0 && arr[7] < arr[1]) {
			result[3] = 0;
		}else {
			result[3] = -1;
		}
		
		//输出要查询的运动轨迹的单元查询是否成功
		if(result[0] == 0 && (arr[8] >= 0 && arr[8] < arr[0] && arr[9] >= 0 && arr[9] < arr[1])){
			result[4] = 0;
		}else {
			result[4] = -1;
		}
		//StringBuilder string = new StringBuilder();
		for(int i : result) {
			System.out.println(i);	
		}
		//return string.toString();	
	}
			

}
