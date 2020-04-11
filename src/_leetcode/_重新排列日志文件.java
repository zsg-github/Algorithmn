package _leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class _重新排列日志文件 {
	public static void main(String[] args) {
		String[] str1 = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
		String[] str2 = reorderLogFiles(str1);
		System.out.println(Arrays.toString(str2));
		
	}
	 public static String[] reorderLogFiles(String[] logs) {
		 TreeMap<String,String> map = new TreeMap<>();
		 ArrayList<String> list = new ArrayList<>();
		 for(String str : logs) {
			 if(str.charAt(str.length() -1) >= 'A'){
//				 String[] strArr= str.split(" ");
//				 StringBuilder sb = new StringBuilder();
//				 for(int i = 1; i < strArr.length; i++) {
//					 sb.append(strArr[i]);
//				 }
//				 sb.append(strArr[0]);
//				 map.put(sb.toString(), str);
				 //空格也比较
				 int indexFirstBlock = str.indexOf(" ");
				 String key = str.substring(indexFirstBlock + 1);
				 key = key + str.substring(0,indexFirstBlock);
				 map.put(key, str);
			 }else {
				 list.add(str);
			 }
			 
		 }
		 ArrayList<String> chList = new ArrayList<>();
		 for(String key : map.keySet()) {
			 chList.add(map.get(key));
		 }
		 System.out.println(chList.size());
		 chList.addAll(list);
		 String[] result = chList.toArray(new String[0]);
		 return result;
		 
	        
	    }
}
