package _leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class _最常见的单词 {
	public static void main(String[] args) {
		String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] ban = {"hit"};
		System.out.println(mostCommonWord(str,ban));
	}
	 public static String mostCommonWord(String paragraph, 
			 String[] banned) {
		 	String paraLowCace = paragraph.toLowerCase();
		 	String[] arr = paraLowCace.split("[^a-z]\\s?");
		 	System.out.println(Arrays.toString(arr));
		 	HashMap<String,Integer> map = new HashMap<>();
		 	for(String str : arr) {
		 		map.put(str, map.getOrDefault(str, 0) + 1);	
		 	}
		 	List<Integer> valueList = new ArrayList<>(map.values());
		 	Collections.sort(valueList);
		 	for(int i = valueList.size() - 1; i >= 0; i--) {
		 		int maxCount = valueList.get(i);
		 		for(String s : map.keySet()) {
		 			if(map.get(s) == maxCount && isNotContains(s,banned))
		 				return s;
		 		}
		 		
		 	}
		 	return null;
	 }

	private static boolean isNotContains(String s,String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(s.equals(arr[i])) {
				return false;
			}
		}
		return true;
	}
}
