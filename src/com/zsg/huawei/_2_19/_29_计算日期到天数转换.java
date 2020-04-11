package com.zsg.huawei._2_19;


import java.util.Scanner;

/**
 * 输入日期，判断这是今年的第几周，第几天
 * 或者相反
 * @author zsg
 *
 */

public class _29_计算日期到天数转换 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int date = sc.nextInt();
			int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			//判断闰年还是平年
			boolean flag = false;
			if(year % 4 ==0) {
				flag = true;
			}
			if(flag) { //闰年
				months[2]  = months[2] +1;
				int result = getDates(year,month,date,months);
				System.out.println(result);
				
			}else {
				int result = getDates(year,month,date,months);
				System.out.println(result);
			}
			
		}
		sc.close();
	}

	private static int getDates(int year, int month, int date, int[] months) {
		if((year <= 0 || month <=0 || month >12 || date <= 0 || date > months[month])){
			return -1;
		}else {
			int dateSum =0;
			for(int  i = 1; i < month;i++) {
				dateSum = dateSum + months[i];
			}
			dateSum = dateSum + date;
			return dateSum;
		}
	}

	
	

}
