package com.zsg.huawei._3_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class _92_≥…º®≈≈–Ú {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int typeSort = sc.nextInt();
				String[] names= new String[n];
				Integer[] scores = new Integer[n];
				TreeSet<Integer> set = new TreeSet<>();
				for(int i = 0; i < n; i++) {
					String name = sc.next();
					int score = sc.nextInt();
					names[i] = name;
					scores[i] = score;
					set.add(score);
				}
				
				Integer[] scoreSort = set.toArray(new Integer[0]);
				List<Integer> list = Arrays.asList(scoreSort);
				if(typeSort == 0) Collections.reverse(list);
				for(int i = 0; i < list.size(); i++) {
					int currentScore = list.get(i);
					for(int j = 0; j < n; j++) {
						if(scores[j] == currentScore) {
							System.out.println(names[j] +" "+scores[j]);
						}
					}
				}
			}
			sc.close();
		}
}
