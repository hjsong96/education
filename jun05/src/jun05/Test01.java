package jun05;
// 궁금한 것.
// 모르는 것.
//컴파일 <-> 스크립트
//소스코드.java -> 컴파일 -> .class
//클래스 : 클래스변수, 메소드, 생성자
//메소드 : 함수 function
//명령어 : 

//이름 만들기(apple, korea) = 영어대소문자, 숫자, _, $
//클래스 : AppleKorea 첫글자 대문자로 시작 후 새로운 단어 대문자 = 파스칼 기법
//메소드, 변수 : appleKorea 첫글자 소문자 이후 새로운 단어 나오면 대문자 = 카멜 기법
//상수 : APPLE_KOREA 대문자로표시하고 중간은 _ 로 표시 스네이크 기법

public class Test01 {
	public static void main(String[] args) {
		//우리반 인원수를 저장하고 싶어요.
		//어떤 데이터타입을 쓰면 좋을지 적어주세요.
		//변수명은 member
		//자바에는 P/R 
		byte member = 25; //-128 ~ 0 ~ 127
		//변수 활용
		member = 100;
		System.out.println(member);
		int num = 1000; // 데이터 스코프
		//예약어
		num = member; //대입하다 <-------------
		//num = num + 1;
		//num++; //변수++
		num += 1; //num = num + 1; num = ++num; num = num++;
		num -= 1; //num = num - 1; num = --num; num = num--;
		num %= 2; //모듈러 : 나머지 값
		//위 num에 저장될 값? 몇 개? 0, 1 총 2개
		System.out.println(num);
		
		//캐스트, 프로모션
		//int,    byte
		num = member; //작은 타입이 큰 타입에 자동대입(프로모션)
		member = (byte) num; //큰 타입이 작은 타입으로 들어갈 때는 반드시 타입 변경(캐스트)
	}
}
