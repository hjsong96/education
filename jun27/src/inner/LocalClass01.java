package inner;
//로컬 클래스
/* 중첩 클래스는 메소드 내에서도 선언할 수 있습니다.
 * = 로컬 클래스
 * 로컬 클래스는 접근제어자 및 static 을 붙일 수 없습니다.
 * 로컬 클래스는 메소드 내부에서만 사용되므로 접근제어가 필요x
 * 로컬 클래스는 내부에는 인스턴스 필드와 메소드만 선언 가능하고
 * 정적 필드와 메소드는 선언할 수 없습니다.
 */

class LA {
	void method() {//메소드 속
		class LB {//로컬 메소드
			public LB() {
				System.out.println("LB가 만들어졌습니다.");
			} //생성자
			int num;
			void method2() {
			}
			//static int number; //선언하지 마세요
			//static void method2() {} //선언하지 마세요
		}//local class end
		LB lb = new LB();
		lb.num = 100;
		lb.method2();
	}
}


public class LocalClass01 {
	public static void main(String[] args) {
		LA la = new LA();
		la.method();
		
	}
	
}
