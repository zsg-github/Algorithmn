package _设计模式;

public class HangrySingleton {
	//私有静态属性
		private static HangrySingleton instance = new HangrySingleton();
		//私有构造方法
		private HangrySingleton() {};
		//公共静态方法
		public static HangrySingleton getInstance() {
			return instance;
		}

}
