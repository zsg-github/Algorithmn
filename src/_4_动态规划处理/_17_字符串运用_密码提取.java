package _4_��̬�滮����;
/**
 �� 1 ��������״̬
dp[i][j] ��ʾ�Ӵ� s[i, j] �Ƿ�Ϊ�����Ӵ���

�� 2 ����˼��״̬ת�Ʒ���
��һ�������������ۣ�����ͷβ�ַ��Ƿ���ȣ�����������ķ����õ���

dp[i][j] = (s[i] == s[j]) and dp[i + 1][j - 1]
�������״̬ת�Ʒ��̣�

��1������̬�滮����ʵ��������һ�Ŷ�ά���i �� j �Ĺ�ϵ�� i <= j ����ˣ�ֻ��Ҫ�����ű���ϰ벿�֣�

��2������ dp[i + 1][j - 1] �͵ÿ��Ǳ߽������

�߽������ǣ����ʽ [i + 1, j - 1] ���������䣬�������ϸ�С�� 2���� j - 1 - (i + 1) + 1 < 2 ������� j - i < 3��

������ۺ���Ȼ�����Ӵ� s[i, j] �ĳ��ȵ��� 2 ���ߵ��� 3 ��ʱ������ʵֻ��Ҫ�ж�һ��ͷβ�����ַ��Ƿ���ȾͿ���ֱ���½����ˡ�

����Ӵ� s[i + 1, j - 1] ֻ�� 1 ���ַ�����ȥ����ͷ��ʣ���м䲿��ֻ�� 1 ���ַ�����Ȼ�ǻ��ģ�
����Ӵ� s[i + 1, j - 1] Ϊ�մ�����ô�Ӵ� s[i, j] һ���ǻ����Ӵ���
��ˣ��� s[i] == s[j] ������ j - i < 3 ��ǰ���£�ֱ�ӿ����½��ۣ�dp[i][j] = true�������ִ��״̬ת�� ��
 */
  
import java.util.Scanner;

public class _17_�ַ�������_������ȡ {
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
           String n = longestPalindrome(input);
            System.out.println(n.length());        
        }
        sc.close();
		
	}
    
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        //����dp[i][j]Ϊ�ַ�����i��ʼj��β���Ӵ��Ƿ�Ϊ�����Ӵ�
        boolean[][] dp = new boolean[len][len];

        // ��ʼ���߽�����
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        int maxLen = 1;
        int start = 0;

        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {

                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }

                // ֻҪ dp[i][j] == true �������ͱ�ʾ�Ӵ� s[i, j] �ǻ��ģ���ʱ��¼���ĳ��Ⱥ���ʼλ��
                if (dp[i][j]) {
                    int curLen = j - i + 1;
                    if (curLen > maxLen) {
                        maxLen = curLen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
