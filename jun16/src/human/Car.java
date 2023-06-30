package human;

class Cat {
	String name;
	int age;
	// 자바가 보고 있다가 기본 생성자를 주입합니다.
	
	/*
	 * this.변수
	 * this(); // 내 생성자()
	 * super.변수 // 부모의 변수
	 * super() // 부모의 생성자()
	 */
	
	public Cat(String name) {
		System.out.println(name + "(이)가 태어났습니다.");
		System.out.println("Mew~~~~");
		this.name = name;
	}
	
	public Cat(String name, int age) {
		this.name = name;
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	
	public void print() {
		System.out.println(this.name);
	}
	
}

class Mini {
	// 자바가 보고 있다가 기본 생성자를 주입합니다.
	public Mini(int age) {
		System.out.println("객체가 생성됩니다. 초기는 " + age + "살 입니다.");
	}
}

public class Car {
	String name;
	// 필드
	// 생성자 : 클래스명과 동일, 대문자로 시작, 리턴 타입 X
	public Car() {// 기본 생성자 : 없는 경우 자바가 만들어서 넣어줍니다.
		System.out.println("인스턴스를 만듭니다.");
	}

	// 메소드
	public void car() {
		System.out.println("car 메소드 입니다.");
	}

	public static void main(String[] args) {

		Cat c = new Cat("나비", -1);
		System.out.println(c.age); //5000
		System.out.println(c.name);
		c.print();
		
		
		Mini m = new Mini(1);
		Human h = new Human("홍길동"); //기본 생성자로 만들어진 인스턴스 = 기본 객체
		h.age = 30;
		h.name = "홍길동";
		Human h2 = new Human(0);
		Human h3 = new Human(150, "홍길동");
		
	}

}
