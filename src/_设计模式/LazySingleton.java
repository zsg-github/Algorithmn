package _设计模式;

public class LazySingleton {
	//私有静态属性
	private static LazySingleton instance = null;
	//私有构造方法
	private LazySingleton() {};
	//公共静态方法
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
