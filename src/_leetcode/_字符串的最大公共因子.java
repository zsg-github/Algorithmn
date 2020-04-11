package _leetcode;

public class _�ַ�������󹫹����� {
	public String gcdOfStrings(String str1, String str2) {
        // ����str1��N��x��str2��M��x����ôstr1+str2�϶��ǵ���str2+str1�ġ�
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // շת�������gcd��
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }

}
