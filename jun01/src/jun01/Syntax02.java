package jun01;

public class Syntax02 {//클래스
	
	int num() {//메소드
		return 1;
	}
	
	void add() {//메소드 
		
	}
	
	public static void sum() {//메소드
		
		}
	
	
	public static void print() {//메소드
		System.out.println("프린트 메소드 입니다.");
	}
	
	public static void main(String[] args) {//메소드
		// 명령어 : 메소드 속에 들어가 있어야 합니다. 
		// 선언, 대입, 초기화, 명령
		int number = 10; number = 100;
		System.out.println(number); // 변수 출력
		print(); // static
		
		Syntax02 s2 = new Syntax02(); //인스턴스를 만들고
		s2.num(); // non static 인스턴트명.num() 호출합니다.
	}
}
