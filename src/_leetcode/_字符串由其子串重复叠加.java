package _leetcode;

import java.util.Scanner;
/**
 * �����ַ�����n���Ӵ�����,��ƴ�Ӻ���Ӵ�Ϊ2n��,��ͷȥβ��Ϊ2n-2��,
 * �����ʱ���ַ������ٰ���һ��ԭ�ַ���,��˵�����ٰ���n���Ӵ�,��2n-2>=n,n>=2.
 * ��˵�����ַ����������Խṹ,�����������Ӵ�����.���һ����������,��������n���Ӵ�,
 * ��˵��2n-2<n,n<2,��nΪ1,Ҳ���ǲ����������Խṹ.
 * @author Lenovo
 *
 */

public class _�ַ��������Ӵ��ظ����� {
	
	public boolean repeatedSubstringPattern(String s) {
		String str = s + s;
	return str.substring(1, str.length() - 1).contains(s);
	}
	
//	 public boolean repeatedSubstringPattern(String s) {
//		 /**
//		  * ()\\1+:��ʾ����С���ŵ����ݣ�Ȼ���ظ�һ������
//		  */
//		 return s.matches("([a-z]+)\\1+");
//
//	    }

}
