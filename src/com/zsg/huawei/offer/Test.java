package com.zsg.huawei.offer;

public class Test {
	public static void main(String[] args) {
		int i = 1;
		i = i++;  //��һ�����Ȱ�i=1ѹ��ջ������1 ��ջ�е�1���䣬int i�ɳ���1���2�����ִ�и�ֵ������ջ�е�1�ְ�int i=2�������ˣ�����i =1;
		System.out.println(i);
		int j = i ++;  //��һ���Ȱ�i= 1ѹ��ջ������һ����ʱint i��1���2;Ȼ����и�ֵ����ջ�е�1��ֵ��int j,����j = 1;
		System.out.println(i);
		System.out.println(j);
		int k = i +  ++i * i++; // �Ȱ�i = 2��ջ��Ȼ�� i����1��int i = 3; ����ִ�� i*i = 3* 3= 9,����ջ ����ʱջ����2 �� 9ִ�мӷ�����
		//��� i�� ���� 1��int i= 4,��11 ��ֵ��k;
		System.out.println(k); 
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
//			/**
//			 * next��nextLineһ��ʹ���������nextLine��ȡ�����ݣ�
//			 * ��Ϊnext��ȡ���ݺ��겻���У��´����ʹ��nextline(),
//			 * �㻻������ڶ�������ʱ��nextline�Ͷ�ȡ�˿�����
//			 */
//			String str = sc.nextLine();
//			String str2 = sc.next();
//			System.out.println(str);
//			System.out.println(str2);
//		}
//		sc.close();
	}

}
