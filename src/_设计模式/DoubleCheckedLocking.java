 package _设计模式;
/**
 * 
 * 单例模式：懒汉式的基础上：在多线程环境下，对外存在一个对象
 * 1.构造器私有化-->避免外部new构造器
 * 2.提供私有的静态属性-->存储对象的地址
 * 3.提供公共的静态方法-->获取属性
 *
 */

public class DoubleCheckedLocking {
	//1.提供私有的静态属性
	/**
	 * 这里由于synchronized锁的是Singleton.class对象，而不是Singleton对象，
	 * 所以synchronized只能保证Singleton.class对象的内存可见性，但并不能保证Singleton对象的内存可见性；
	 * 这里用volatile声明Singleton，可以保证Singleton对象的内存可见性
	 */
	private static volatile DoubleCheckedLocking instance;
	//2.构造器私有化
	private DoubleCheckedLocking() {};
	//3提供公共的静态方法
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
