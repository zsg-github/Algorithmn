package com.zsg.huawei._3_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _10ª÷∏¥≈‰÷√Œƒº˛ {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("reset", "reset what");
		map.put("reset-board", "board fault");
		map.put("board-add", "where to add");
		map.put("board-delet", "no board at all");
		map.put("reboot-backplane", "impossible");
		map.put("backplane-abort", "install first");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String com =  getCommand(str,map);
			System.out.println(com);
		}
		sc.close();
	}
	
	static String getCommand(String str,Map<String,String> map) {
		String[] arr = str.split(" ");
		if(arr.length == 1) {
			for(String com : map.keySet()) {
				if(!com.contains("-")) {
					if(com.matches(str+"[a-z]*")) {
						return map.get(com);
					}	
				}
			}
			return "unkown command";
			
		}else if(arr.length == 2) {
			int count = 0;
			String command = null;
			for(String com : map.keySet()) {
				if(!com.contains("-")) continue;
				if(com.matches(arr[0]+"[a-z]*\\-"+arr[1]+"[a-z]*")) {
					count ++;
					command = com;
				}
			}
			if(count == 1) {
				return map.get(command);
			}
			return "unkown command";
			
		}else {
			return "unkown command";
		}
	}

}
