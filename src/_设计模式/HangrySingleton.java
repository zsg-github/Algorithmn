package _���ģʽ;

public class HangrySingleton {
	//˽�о�̬����
		private static HangrySingleton instance = new HangrySingleton();
		//˽�й��췽��
		private HangrySingleton() {};
		//������̬����
		public static HangrySingleton getInstance() {
			return instance;
		}

}
