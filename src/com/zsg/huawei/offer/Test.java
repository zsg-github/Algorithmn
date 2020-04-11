package com.zsg.huawei.offer;

public class Test {
	public static void main(String[] args) {
		int i = 1;
		i = i++;  //第一步：先把i=1压入栈，自增1 ，栈中的1不变，int i由常量1变成2，最后执行赋值操作，栈中的1又把int i=2给覆盖了，所以i =1;
		System.out.println(i);
		int j = i ++;  //第一步先把i= 1压入栈，自增一，此时int i由1变成2;然后进行赋值，把栈中的1赋值给int j,所以j = 1;
		System.out.println(i);
		System.out.println(j);
		int k = i +  ++i * i++; // 先把i = 2入栈，然后 i自增1，int i = 3; 接着执行 i*i = 3* 3= 9,放入栈 ，此时栈中有2 和 9执行加法操作
		//最后 i又 自增 1，int i= 4,把11 赋值给k;
		System.out.println(k); 
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
//			/**
//			 * next和nextLine一起使用容易造成nextLine读取空数据，
//			 * 以为next读取数据后光标不换行，下次如果使用nextline(),
//			 * 你换行输入第二行数据时，nextline就读取了空数据
//			 */
//			String str = sc.nextLine();
//			String str2 = sc.next();
//			System.out.println(str);
//			System.out.println(str2);
//		}
//		sc.close();
	}

}
