package enum01;
//Enum
/*
 * 열거타입 : 필드에 저장할 수 있는 값들을 나열/정의 합니다.
 * 			  열거한 타입만 쓸 수 있습니다.
 * 			  같은 값을 가질 수 없습니다.
 * 			  enum 은 클래스 이름과 중복될 수 없습니다.
 * 
 * 
 * 
 * 
 */

enum Gender{
	M, F
}

class Human{
	String name;
	int age;
	Gender gender;
}

public class Enum01 {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.name = "철수";
		h1.age = 10;
		h1.gender = Gender.M;
		
		System.out.println(h1.gender);
		
	}
	
	
	
	
	
}
