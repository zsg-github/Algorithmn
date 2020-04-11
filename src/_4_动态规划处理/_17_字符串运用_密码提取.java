package _4_动态规划处理;
/**
 第 1 步：定义状态
dp[i][j] 表示子串 s[i, j] 是否为回文子串。

第 2 步：思考状态转移方程
这一步在做分类讨论（根据头尾字符是否相等），根据上面的分析得到：

dp[i][j] = (s[i] == s[j]) and dp[i + 1][j - 1]
分析这个状态转移方程：

（1）“动态规划”事实上是在填一张二维表格，i 和 j 的关系是 i <= j ，因此，只需要填这张表的上半部分；

（2）看到 dp[i + 1][j - 1] 就得考虑边界情况。

边界条件是：表达式 [i + 1, j - 1] 不构成区间，即长度严格小于 2，即 j - 1 - (i + 1) + 1 < 2 ，整理得 j - i < 3。

这个结论很显然：当子串 s[i, j] 的长度等于 2 或者等于 3 的时候，我其实只需要判断一下头尾两个字符是否相等就可以直接下结论了。

如果子串 s[i + 1, j - 1] 只有 1 个字符，即去掉两头，剩下中间部分只有 1 个字符，当然是回文；
如果子串 s[i + 1, j - 1] 为空串，那么子串 s[i, j] 一定是回文子串。
因此，在 s[i] == s[j] 成立和 j - i < 3 的前提下，直接可以下结论，dp[i][j] = true，否则才执行状态转移 。
 */
  
import java.util.Scanner;

public class _17_字符串运用_密码提取 {
    
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
        //定义dp[i][j]为字符串以i开始j结尾的子串是否为回文子串
        boolean[][] dp = new boolean[len][len];

        // 初始化边界条件
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

                // 只要 dp[i][j] == true 成立，就表示子串 s[i, j] 是回文，此时记录回文长度和起始位置
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
