package _1_�ַ�������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21_���ֽڽ�ȡ�ַ��� {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String message=null;
        while((message=br.readLine())!=null) {
        	String[] arr = message.split(" ");
        	String str = arr[0];
        	int len = Integer.parseInt(arr[1]);
        	int m = 0;
        	int i = 0;
        	//���ݳ�����ȡ���ַ�����Ӣ���ַ�ռһ���ֽڣ����������ֽڣ�������ֻʣ��һ���ֽڣ�����һ���Ǻ��֣����ȡ���ȼ�һ
        	for(; m < len; i++) {
        		if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >='A' && str.charAt(i) <='Z')){
        			m ++;
        		}else {
        			if(m + 2 > len) break;
        			m += 2;
        		}
        	}
        	String subStr = str.substring(0,i);
        	System.out.println(subStr);
        			
        }	
        
	}
}
