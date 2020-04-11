 package _���ģʽ;
/**
 * 
 * ����ģʽ������ʽ�Ļ����ϣ��ڶ��̻߳����£��������һ������
 * 1.������˽�л�-->�����ⲿnew������
 * 2.�ṩ˽�еľ�̬����-->�洢����ĵ�ַ
 * 3.�ṩ�����ľ�̬����-->��ȡ����
 *
 */

public class DoubleCheckedLocking {
	//1.�ṩ˽�еľ�̬����
	/**
	 * ��������synchronized������Singleton.class���󣬶�����Singleton����
	 * ����synchronizedֻ�ܱ�֤Singleton.class������ڴ�ɼ��ԣ��������ܱ�֤Singleton������ڴ�ɼ��ԣ�
	 * ������volatile����Singleton�����Ա�֤Singleton������ڴ�ɼ���
	 */
	private static volatile DoubleCheckedLocking instance;
	//2.������˽�л�
	private DoubleCheckedLocking() {};
	//3�ṩ�����ľ�̬����
	public static DoubleCheckedLocking getInstance() {
		if(null != instance) return instance;
		synchronized(DoubleCheckedLocking.class) {
			if(null == instance) {
				return new DoubleCheckedLocking();
			}
		}
		return instance;
	}
}
