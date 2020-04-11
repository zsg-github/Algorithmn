package com.zsg.huawei.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _×Ö·ûÈ«ÅÅÁÐ {
	 public static void main(String[] args) {
	        System.out.println(Permutation("abc").toString());
	    }

	    public static ArrayList<String> Permutation(String str) {
	    	ArrayList<String> res = new ArrayList<>();
	        if (str != null && str.length() > 0) {
	            PermutationHelper(str.toCharArray(), 0, res);
	            Collections.sort(res);
	        }
	        return res;
	    }

	    public static void PermutationHelper(char[] cs, int i, List<String> list) {
	        if (i == cs.length - 1) {
	            String val = String.valueOf(cs);
	            //×Ö·û´®ÖÐÓÐÖØ¸´×Ö·û
	            if (!list.contains(val)) 
	                list.add(val);
	        } else {
	            for (int j = i; j < cs.length; j++) {
	                swap(cs, i, j);
	                PermutationHelper(cs, i+1, list);
	                swap(cs, i, j);
	            }
	        }
	    }

	    public static void swap(char[] cs, int i, int j) {
	        char temp = cs[i];
	        cs[i] = cs[j];
	        cs[j] = temp;
	    }

}
