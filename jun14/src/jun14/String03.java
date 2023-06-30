package jun14;

import java.util.Scanner;

//클래스를 선언
class Apple{
	//필드 = 변수 = 인스턴스 변수 = 초기화 하지 않아도 쓸 수 있습니다.
	String color; //인스턴스 변수는 파란색, 변수 선언전부터 사용 가능
	int age;
	//생성자 = 인스턴스를 발생하기 위한 코드 = 메소드, 클래스 명과 이름 똑같아야 한다.
	public Apple() {
	}	
	//메소드
	//지역변수는 초기화 해야 합니다. = 값선언까지 완료
	//
	
	public void info() {
		System.out.println("색상 : " + color);
		System.out.println("나이 : " + age);
	}
}

public class String03 {
	public static void main(String[] args) {

		int i = 10; //선언 + 값대입 = 초기화, 지역변수는 갈색, 선언후부터 사용 가능
		System.out.println(i);
		
		//인스턴스 만들기
		//데이터타입 변수명 = 값;
		   int       num    = 100;
		Apple apple = new Apple();
		Apple apple2 = new Apple();
		String str = new String("Hi");
		Scanner sc = new Scanner(System.in);
		
		apple.color = "빨강";
		apple.age = 10;
		apple.info();
		
		System.out.println(apple2.color); //
		System.out.println(apple2.age); //
		
	}

}
