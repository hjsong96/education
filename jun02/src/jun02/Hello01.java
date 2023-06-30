package jun02;

public class Hello01 {//Hello01 클래스
	//메인메소드는 반드시 이 모양이어야 합니다. 
	public static void main(String[] args) {//main 메소드
		int number; //변수 선언
		number = 100; //변수에 값 대입
		
		//1 + 2 == 3
		
		int num = 101; //변수 선언 + 값 대입 == 변수 초기화
		//리터럴 = 고정된 값
		
		//3.14
		double num1 = 1.000009; // <----------
		
		int num2 = 10;
		//대입기호기준으로 양 변의 테이터 타입이 동일해야 대입
		
		int num3= num;
		
		num3 = (int) 10.33333; //형변환 = 데이터타입 변환
		//cast = 값의 절삭
		System.out.println(num3);
		
		int iNumber = 14;
		double dNumber = iNumber; //자동 대입 = 프로모션
		//왼쪽변이 더 큰타입이라 int가 자동 대입됩니다. 
		
		System.out.println(dNumber); //14.0
		
		//상속
		
	}

}
//변수 : 변하는 수 <-> 상수 : 변하지 않는 수(불변) ex)파이
//프로그램이 진행할 때 중간의 값을 저장해두기 위한 공간
//데이터타입 변수이름; = 변수선언