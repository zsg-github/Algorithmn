package com.zsg.huawei._3_9;

public class Polym {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.seeDoor();
	}

}
class Animal {
    public void shout() {
        System.out.println("����һ����");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("��������");
    }
    public void seeDoor() {
        System.out.println("������....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("����������");
    }
}