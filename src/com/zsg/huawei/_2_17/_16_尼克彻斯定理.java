package com.zsg.huawei._2_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16_��˳�˹���� {
	/**
	 * ����˼·������m������������д��m����������֮�ͣ�m����������m�Ľ��i������m������ƽ��ֵ�����м�ֵ
	 * ������м�ֵ�������ҳ���m����������
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            int n = Integer.parseInt(line);
	            getSequeOddNum(n);   
	        }
	}
	
	 public static void getSequeOddNum(int m){   
		 StringBuilder str = new StringBuilder();
	     int aver = m*m;
	     if(aver % 2 ==0) { //�м�ֵaverΪż��
	    	 int min = aver + 1 - m;
	    	 for(int i = 0; i < m-1; i++) {
		    		str.append(min).append("+");
		    		min += 2; 
	    	 }
	    	 str.append(min);
	     }else {
	    	 int min = aver - (m/2)*2;
	    	 for(int i = 0; i < m-1; i++) {
		    		str.append(min).append("+");
		    		min += 2; 
	    	 }
	    	 str.append(min); 
	     }
	     System.out.println(str.toString());
	 }
}
