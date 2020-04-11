package com.zsg.huawei._3_8;
/**
 * 题目说的掩码非法即错误掩码
 * 不予统计的只是"0.*.*.*"情况
 */
import java.io.IOException;
import java.util.Scanner;

public class _96_识别有效的IP和子网掩码 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		int errorIp = 0;
		int privIp = 0;
		while(!sc.hasNext("exit")) {
			String str = sc.next();
			String[] arr = str.split("\\~");
			String ip = arr[0];
			String secondIp = arr[1];
			String[] ipArr = ip.split("\\.");
			//判断掩码是否合法
			//忽略不予统计的
			if(secIpisTrue(secondIp) && ipIsTrue(ip)) {  //掩码和ip都正确，进行分类
				int ipFirstValue = Integer.parseInt(ipArr[0]);
				int ipSecondValue = Integer.parseInt(ipArr[1]);
				
					if(ipFirstValue <= 126) {
					//是否是丝网
					if(ipFirstValue ==10) {
						privIp ++;
					}
					A++;	
				}
				else if(ipFirstValue <= 191) {
					if(ipFirstValue == 172 && ipSecondValue >= 16 && ipSecondValue < 32){
						privIp ++;
					}
					if(ipFirstValue >= 128)
					B++;
					
				}
				else if(ipFirstValue <= 223) {
					if(ipFirstValue == 192 && ipSecondValue == 168 ) {
						privIp ++;
					}
					C++;
					
					
				}
				else if(ipFirstValue <= 239) D++;
				else if(ipFirstValue <= 255) E++;
				
			} 
			//不予统计0.*.*.*的情况
			Boolean secondIpilleagl =  secondIp.matches("[0]{1}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}");
			Boolean ipilleagl =  ip.matches("[0]{1}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}");
			if(!secIpisTrue(secondIp) && ipIsTrue(ip) && 
					!secondIpilleagl){ //掩码错误，ip正确 ,忽略不予统计的
				errorIp ++;
			}
			if(secIpisTrue(secondIp) && !ipIsTrue(ip) &&
					!ipilleagl) {
				errorIp ++;
			}
			if(!secIpisTrue(secondIp) && !ipIsTrue(ip) &&
					!ipilleagl &&secondIpilleagl) {
				errorIp++;
			}
			
		}
		System.out.println(A +" " + B +" " +C +" " +D +" " +E +" " +errorIp +" "  +privIp);
		sc.close();
	}
	//判断掩码是否正确
	static boolean secIpisTrue(String str) {
		if(str.matches("[0]{1}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}") 
				|| "255.255.255.255".equals(str)) return  false;
		String[] arrs = str.split("\\.");
		for(int i = 0;i<arrs.length;i++) {
			int num = Integer.parseInt(arrs[i]);
			arrs[i] = Integer.toBinaryString(num);
		}
		String binaryStr = "";
		for(int i = 0; i < arrs.length;i++) {
			while(arrs[i].length() < 8) arrs[i] = "0" + arrs[i];
			binaryStr = binaryStr + arrs[i];
		}
		if(binaryStr.matches("^[1]{1,}[0]{1,}")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//ip是否合法
	static boolean ipIsTrue(String ip) {
		if(! ip.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}")) return false;
		if(ip.matches("[0]{1}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}") 
				|| "255.255.255.255".equals(ip)) return  false;
		return true;
	}
}
