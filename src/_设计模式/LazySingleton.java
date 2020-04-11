package _���ģʽ;

public class LazySingleton {
	//˽�о�̬����
	private static LazySingleton instance = null;
	//˽�й��췽��
	private LazySingleton() {};
	//������̬����
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
