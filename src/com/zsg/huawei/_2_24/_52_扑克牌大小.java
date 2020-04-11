package com.zsg.huawei._2_24;
import java.util.Scanner;

public class _52_扑克牌大小 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			slove(str);
		}
		sc.close();
	}

	private static void slove(String str) {
		String[] s = str.split("\\-");
		String[] s1 = s[0].split(" ");
		String[] s2 = s[1].split(" ");
		if(s1.length != s2.length){
            System.out.println("ERROR");
            return;
        }
		String[] ss = {"3","4","5","6","7","8","9","10","J","Q","K","A","2","joker","JOKER"};
		//if(s[0] == "joker JOKER" || s[1] == "joker JOKER") {
		if("joker JOKER".equals(s[0]) || "joker JOKER".equals(s[1])) {
			System.out.println("joker JOKER");
		}else if(s1.length==s2.length) {
				System.out.println(s1[0]);
			 	if(getIndex(ss,s1[0])>getIndex(ss,s2[0])) {
			 		System.out.println(s[0]);
			 	}else {
			 		System.out.println(s[1]);
			 	}
		}else if(s1.length==4) {   //四张一样的
				System.out.println(s[0]);
		}else if(s2.length==4) {
				System.out.println(s[1]);
			}
		}
	
	
	private static int getIndex(String[] s, String s1) {
		for(int i=0;i<s.length; i++) {
			if(s1.equals(s[i])) {     //不可以用等于号
				return i;
			}
		}
		return 0;
	}
	
}
