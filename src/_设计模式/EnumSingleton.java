package _设计模式;
/**
 * 枚举方法可避免反射和反序列化
 *缺点：不能延时加载
 *通过类名.枚举元素获取
 * @author Lenovo
 *
 */

public enum EnumSingleton {
	//这个枚举元素，本身就是单例对象
	INSTANCE;
}
