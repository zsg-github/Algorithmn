package _1_字符串处理;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21_按字节截取字符串 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String message=null;
        while((message=br.readLine())!=null) {
        	String[] arr = message.split(" ");
        	String str = arr[0];
        	int len = Integer.parseInt(arr[1]);
        	int m = 0;
        	int i = 0;
        	//根据长度算取子字符串，英文字符占一个字节，汉字两个字节，若长度只剩下一个字节，而下一个是汉字，则截取长度减一
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
