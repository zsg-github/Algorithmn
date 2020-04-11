package _���ģʽ;
/**
 * �ⲿ��û��static���ԣ����������ʽһ���������ض���
 * ֻ�е���getInstance(),�Ż���ؾ�̬�ڲ��࣬
 * instance��static finalȷ���ڴ���ֻ��һ��ʵ����ȷ���̰߳�ȫ
 * @author Lenovo
 *
 */

public class StaticInnerSingleton {
	//˽�о�̬�ڲ���
	private static class InnerClassInstance {
		private static final StaticInnerSingleton instance = 
				new StaticInnerSingleton();
	}
	//˽�й�����
	private StaticInnerSingleton() {};
	//������̬����
	public static StaticInnerSingleton getInstance() {
		return InnerClassInstance.instance;
	}

}
