package zoo;
//개, 고양이, 쥐, 말, 등등등

import java.util.Iterator;

class Ancestor {// 개, 고양이, 말, 쥐의 선조
	void sleep() {
		System.out.println("Zzzzzz");
	}
}

class Dog extends Ancestor {
	String name;
	int age;
}

class Mouse extends Ancestor {
	String name;
	int age;
}

class Horse extends Ancestor {
	String name;
	int age;
}

public class Animal {
	public static void main(String[] args) {
		// 각각 동물들을 인스턴스화 해주세요
		Ancestor[] ani = new Ancestor[4];
		ani[0] = new Cat();
		ani[1] = new Dog();
		ani[2] = new Mouse();
		ani[3] = new Horse();

		for (int i = 0; i < ani.length; i++) {
			ani[i].sleep();

		}

	}

}
