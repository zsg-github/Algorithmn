package com.zsg.huawei._3_3;

import java.util.Scanner;

/**
 * 
	Integer.valueOf(s, radix); radix：基数
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
      String str="";
      while((str=bf.readLine())!=null) {
          int n=Integer.parseInt(str);
          String name[]=bf.readLine().split(" ");
          int num=Integer.parseInt(bf.readLine());
          String s[]=bf.readLine().split(" ");
  总结输入时的语法：next()读取数据时需要sc.hasNext()判断。
              nextLine读取时需要sc.hasNextLine()判断,否则需要在读取前加个sc.nextLine;
 * 
 */
public class _79_整数与IP地址间的转换 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();  //
			//sc.nextLine();
			String l = sc.nextLine();
			long n = ipToLong(str);
			String s2= longToIp(Long.parseLong(l));
			System.out.println(n);
			System.out.println(s2);
		}
		sc.close();

	}
	static long ipToLong(String str) {
		String[] arr = str.split("\\.");
		for(int i = 0;i<arr.length;i++) {
			int num = Integer.parseInt(arr[i]);
			arr[i] = Integer.toBinaryString(num);
		}
		String binaryStr = "";
		for(int i = 0; i < arr.length;i++) {
			while(arr[i].length() < 8) arr[i] = "0" + arr[i];
			binaryStr = binaryStr + arr[i];
		}
		
		long count = Long.valueOf(binaryStr, 2);
		return count;
	}
	static String longToIp(Long num) {
		String str = Long.toBinaryString(num);
		while(str.length() < 32) str = "0" + str;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 32; i = i + 8) {
			String subIp = str.substring(i, i+8);
			sb.append(Long.parseLong(subIp,2));
			sb.append(".");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
		
	}

}
