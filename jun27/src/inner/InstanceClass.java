package inner;
// 인스턴스 멤버 클래스
/* 
 * static 키워드 없이 중첩 선언된 클래스
 * 인스턴스 멤버 클래스는 인스턴스 필드와 메소드만 선언 가능
 * -> 정적 필드와 정적 메소드는 선언 불가.
 * 
 * 
 * 
 */

class IA {
	class IB{//인스턴스 멤버 클래스
		public IB() {} //생성자 선언 가능		
		int number; //인스턴스 필드
		//static int num; //선언하지 마세요
		//static void method1() {} //선언하지 마세요
		void method2() {} //메소드
	}
	void methodA() {
		IB ib = new IB();
		ib.number = 0;
		ib.method2();
		System.out.println(ib.number);
	}
}
public class InstanceClass {
	public static void main(String[] args) {
		IA ia = new IA();
		IA.IB ib = ia.new IB(); //이럴일이 거의 없습니다.
		ib.number = 100; // IA 내부에서 만들어서 사용합니다.
		ib.method2();
	}
}
