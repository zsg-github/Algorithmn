package com.zsg.huawei.每周一道算法题;

import java.util.HashMap;
import java.util.Map;
/**
 * Map.Entry里有相应的getKey和getValue方法，即JavaBean
 * @author Lenovo
 *
 */
public class _Entry {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("zhs", 1);
		map.put("zsg", 2);
		map.put("sjj", 3);
		for(String str : map.keySet()) {
			System.out.println(str+" " + map.get(str));
		}
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			m.setValue(1);
			System.out.println(m.getKey() + m.getKey());
		}
	}

}
