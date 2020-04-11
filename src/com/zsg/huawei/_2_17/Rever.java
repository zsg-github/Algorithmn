package com.zsg.huawei._2_17;

public class Rever {
	public static void main(String[] args) {
		String s = new String(reverseArray("qhbrivaighqmgafhthxicdiixpefhwwefdebwczswqqdjxulhuhceqrxechddtlbbltddhcexrqechuhluxjdqqwszcwenakceymkxfqpqxctbsousrwwhooxjtcqnvb"));
		System.out.println(s);
	}

	public static char[] reverseArray(String s) {
		char[] a = s.toCharArray();
		for (int i = 0; i<a.length/2; i++) {
			char temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		return a;
	}
	/**
	 * qhbrivaighqmgafhthxi c diixpefhwwefdeb wczswqqdjxulhuhceqrxechddtlbbltddhcexrqechuhluxjdqqwszcw enakceymkxfqpqx c tbsousrwwhooxjtcqnvb
	 * bvnqctjxoohwwrsuosbt c xqpqfxkmyeckane wczswqqdjxulhuhceqrxechddtlbbltddhcexrqechuhluxjdqqwszcw bedfewwhfepxiid c ixhthfagmqhgiavirbhq

	 */
}
