package com.zsg.huawei._2_19;

import java.util.Arrays;
import java.util.Scanner;

public class _28_НјЖ¬ХыАн {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.next();
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String sortResult = new String(arr);
			System.out.println(sortResult);
		}
		scanner.close();
	}

}
