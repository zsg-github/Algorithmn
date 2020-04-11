package _设计模式;
/**
 * 外部类没有static属性，不会像饿汉式一样立即加载对象
 * 只有调用getInstance(),才会加载静态内部类，
 * instance是static final确保内存中只有一个实例，确保线程安全
 * @author Lenovo
 *
 */

public class StaticInnerSingleton {
	//私有静态内部类
	private static class InnerClassInstance {
		private static final StaticInnerSingleton instance = 
				new StaticInnerSingleton();
	}
	//私有构造器
	private StaticInnerSingleton() {};
	//公共静态方法
	public static StaticInnerSingleton getInstance() {
		return InnerClassInstance.instance;
	}

}
