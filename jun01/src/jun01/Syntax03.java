package jun01;
// main 메소드에 적어야 실행됩니다.

class Apple{
	public static void main(String[] args) {
		System.out.println("애플 클래스 속 메인 메소드");
	}
}

public class Syntax03 {
	public static void main(String[] args) {
		System.out.println("출력문");
	
		add(10,20); //메소드 호출
		
	}
	
	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}
