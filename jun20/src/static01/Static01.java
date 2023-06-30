package static01;
//static

/*
 * static 은 정적이라는 의미를 가지고 있습니다.
 * 자바에서는 정적 개념과 동적 개념이 있습니다.
 * 쉽게 표현하면 정적은 클래스가 로드되는 시점입니다.
 * 동적은 로드된 클래스가 실행된 이후를 말합니다.
 * 
 * 이 중 객체는 동적 데이터라고 해서 프로그램이 실행된 이후에
 * 발생되는 대표적인 형태입니다.
 * 
 * 클래스를 정의할 때 static 키워드를 사용한 프로퍼티와
 * 메소드는 해당 클래스의 인스턴스를 생성하지 않아도
 * 접근할 수 있게 됩니다.
 * 이러한 프로퍼티와 메소드를 정적 멤버(static member) 라고 합니다. 
 * 
 */

class Apple {
	static int count; //상수
	static final Double PI = 3.14; //상수
	
	
	void print() {
		
	}
	
}

public class Static01 {
	public static void main(String[] args) {

		Apple.count = 10;
		System.out.println(Apple.count);
		
		Apple a1 = new Apple();
		a1.count = 15;
		
		Apple a2 = new Apple();
		a2.count = 100;

		Apple a3 = new Apple();
		a2.count = 150;
		
		System.out.println(a1.count);

		
	}
}
