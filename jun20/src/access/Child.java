package access;

import inheritance.Parent;
// 상속으로 연결합니다.
// 부모의 코드 자식이 자신의 것처럼 활용

class Son extends Parent {
	void print() {
		number2 = 10;
	}
	
	
}




public class Child extends Parent {

	void print() {
		System.out.println(number1);
		System.out.println(number2);
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.number1 = 10;
		
	}

}
