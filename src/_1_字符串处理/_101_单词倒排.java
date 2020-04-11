package _1_×Ö·û´®´¦Àí;

import java.util.Scanner;

public class _101_µ¥´Êµ¹ÅÅ {
	public static void main(String[] args) {
//		String s = "@gdsd dsf 56sf@!sdf)";
//		String[] str = s.trim().split("[^a-zA-Z]{1,}");
//		System.out.println(Arrays.toString(str));
		//[, gdsd, dsf, sf, sdf]
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String[] arr = str.split("[^a-zA-Z]");
			StringBuilder sb = new StringBuilder();
			for(int i = arr.length - 1; i >= 0; i--) {
				sb.append(arr[i] + " ");
			}
			String s = sb.toString().trim();
			System.out.println(s);
//		}
	}
		
}
}