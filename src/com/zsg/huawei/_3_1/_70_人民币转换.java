package com.zsg.huawei._3_1;

import java.util.Scanner;
/**
 * int��unsigned��long��unsigned long ��double�����������ֻ�ܱ�ʾΪ10�ڣ�
 * �����Ǳ�ʾʮ���Ƶ�λ��������10���������Ա�������9λ��������shortֻ���ܱ�ʾ5λ��
 * @author zsg
 *
 */

public class _70_�����ת�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] arr = str.split("\\.");
			char[] ch = arr[0].toCharArray();
			String[] val = {"��","Ҽ","��","��","��","��","½","��","��","��"};
			String[] de  =  {"Ԫ","ʰ","��","Ǫ","��","��"};
			String[] re = {"��", "��"};
			double  num = Double.parseDouble(arr[0]);
			//StringBuilder RMB = new StringBuilder();
			String rmb = "";
			//һ��ʼ��һ������ÿһλ����ɴ�д�����������������6001���������"½Ǫ����Ҽ"��
			//������ͳһ�����ַ�������"����"�滻��"��"����
			for(int i = 0; i < ch.length; i++) {
				if( i ==0) {
					int index = (int)num % 10;
					rmb =val[index] + de[0] + rmb;
					num = num / 10;	
				}
				else if( i < 4) {
					int index =(int) num % 10;
					if(index == 0) {
						rmb =val[index]  + rmb;	

					}else {
						rmb =val[index] + de[i] + rmb;	
					}
					num = num / 10;	
				}else if( i ==4){
				    int index = (int) num % 10;
				    rmb = val[index] + "��" + rmb;
				    num = num / 10; 
				}else if(i < 8) {
					 int index = (int) num % 10;
					 if(index == 0) {
						 rmb = val[index]  + rmb;
					 }else {
						 rmb = val[index] + de[i - 4] + rmb; 
					 }
					 num = num / 10;
				}else if( i == 8) {
					int index = (int) num % 10;
				    rmb = val[index] + "��" + rmb;
				    num = num / 10;
				}else {
					int index = (int) num % 10;
					 rmb = val[index] + de[i - 8] + rmb;
					 num = num / 10;
				}
				
			}
			rmb = rmb.replace("����", "��");
			
			//���ﴦ����λ ����λ����λΪ��������101120 �ҷ����"Ҽʰ����ҼǪҼ�۷�ʰ��Ԫ" 
			//����Ҫ��"����" "��Ԫ"�滻��"��""Ԫ"��ok
			//����С��һԪ ����ֵ
			if("0".equals(arr[0])) {
				rmb = rmb.replace("��Ԫ", "");
				
			}else {
				rmb = rmb.replace("��Ԫ", "Ԫ");
			}
			rmb = rmb.replace("����", "��");
			rmb = rmb.replace("����", "��");
			String rem ="";
			//����С����������
			if("00".equals(arr[1])) {
				rem = rem + "��";
			}else {
				int m = Integer.parseInt(arr[1]);
				for(int i = 0; i<arr[1].length();i++) {
					int index = m % 10;
					m = m / 10;
					if(index ==0) continue;
					rem =val[index] + re[i] + rem;
				}
			}
			//�����ʼλ��ǧ��λΪ������
			if(arr[0].length() > 1) {
				String sub = rmb.substring(0,2);
				if("Ҽʰ".equals(sub)) {
					rmb = "ʰ" + rmb.substring(2);
				}	
			}

			rmb = "�����" +rmb + rem;
			System.out.println(rmb);
	}
	}	

}
