package _1_×Ö·û´®´¦Àí;
import java.util.Scanner;

public class _64_×Ö·û´®ÅÅÐò {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			StringBuilder s = new StringBuilder();
			for(int i = 0; i < 26;i++) {
				for(int j = 0; j < ch.length;j++) {
					if(ch[j] - 'a' == i || ch[j] - 'A' == i) {
						s.append(ch[j]);
					}
				}
			}
			for(int i = 0;i < str.length();i++) {
				char  c = str.charAt(i);
				if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
					s.insert(i, c);
				}
			}
			System.out.println(s.toString());
			
		}
		sc.close();
	}
}
