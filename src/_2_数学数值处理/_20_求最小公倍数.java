package _2_��ѧ��ֵ����;

import java.util.Scanner;
/**
 * ������������x��y������һ�����Լ��z=(x,y)����x��y���й�����z�� 
��ôxһ���ܱ�z������yҲһ���ܱ�z����������x��y���������mx��nyҲһ���ܱ�z��������m��n��ȡ����������

����շת�������˵��˼·���ǣ� 
��x>y����x/y=n��c�� 
��x�ܱ�ʾ��x=ny+c����ʽ�� 
��ny�Ƶ���߾���x-ny=c������һ����ʽ��mx��ny�ܱ�z������ 
���ԵȺ���ߵ�x-ny����Ϊmx��ny��һ�����������ܱ�z������ 
��x��y������cҲ�ܱ�z������
 */
public class _20_����С������ {
	//��С������ = ����֮���������Լ��
	//�����Լ��
	public static int getResult(int m ,int n){
        if(m<n){
            int temp=m;
            m=n;
            n=temp;
        }
        int k;
        while(n!=0){
            k=m%n;
            m=n;
            n=k;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(m*n/getResult(m, n));
        }
        scanner.close();
    }

}
