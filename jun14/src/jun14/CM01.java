package jun14;

import java.security.PublicKey;

//사람을 만들어 보겠습니다.

class Human {
	// 필드
	String name;
	byte age;
	String address;
	String ssn;
	
	// 메소드 : 되돌려주는 타입, void는 되돌려 주는 값이 없을 때
	public double what() {
		return 3;
	}
	public boolean eat() {
		return true;
	}
	public int sleep() {
		return 1;
	}
	public void work() {
		System.out.println(name + " Zzzzzz");
		String ng = "홍길동";
		name = ng;
		System.out.println(name);
	}
}

public class CM01 {
	public static void main(String[] args) {
		
		Human human = new Human();
		//human.work();
		System.out.println(human.name);
		//System.out.println(human.sleep());
		human.work();
		
		Apple a1 = new Apple();
		System.out.println(a1.age);
		
	}
}

/*int num1 = 10; //지역변수
		System.out.println(num1);
		human.eat(); //인스턴스.메소드명();
		human.toString(); //Objec
		
		int number = human.sleep();
		System.out.println(number);
 */
/*int[] arr = new int[5];
		System.out.println(arr.length);
		String name = "가나다라";
		System.out.println(name.length());*/