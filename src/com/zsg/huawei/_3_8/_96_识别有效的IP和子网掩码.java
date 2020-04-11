package com.zsg.huawei._3_8;
/**
 * ��Ŀ˵������Ƿ�����������
 * ����ͳ�Ƶ�ֻ��"0.*.*.*"���
 */
import java.io.IOException;
import java.util.Scanner;

public class _96_ʶ����Ч��IP���������� {
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
			//�ж������Ƿ�Ϸ�
			//���Բ���ͳ�Ƶ�
			if(secIpisTrue(secondIp) && ipIsTrue(ip)) {  //�����ip����ȷ�����з���
				int ipFirstValue = Integer.parseInt(ipArr[0]);
				int ipSecondValue = Integer.parseInt(ipArr[1]);
				
					if(ipFirstValue <= 126) {
					//�Ƿ���˿��
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
			//����ͳ��0.*.*.*�����
			Boolean secondIpilleagl =  secondIp.matches("[0]{1}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}");
			Boolean ipilleagl =  ip.matches("[0]{1}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}");
			if(!secIpisTrue(secondIp) && ipIsTrue(ip) && 
					!secondIpilleagl){ //�������ip��ȷ ,���Բ���ͳ�Ƶ�
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
	//�ж������Ƿ���ȷ
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
	
	//ip�Ƿ�Ϸ�
	static boolean ipIsTrue(String ip) {
		if(! ip.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}")) return false;
		if(ip.matches("[0]{1}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}") 
				|| "255.255.255.255".equals(ip)) return  false;
		return true;
	}
}
