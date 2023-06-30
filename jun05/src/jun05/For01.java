package jun05;

//자바의 반복문 : for 문
/*
 * 프로그래밍에서 필요에 따라 특정 명령을 반복적으로
 * 실행해야 할 때가 있습니다.
 * 이 때 사용되는 구문이 반복문 입니다.
 * 자바에서는 3개의 반복문이 있습니다.
 * for, while, do-while
 * 
 * 문법
 * for(변수 초기화; 변수 조건문; 변수 증감식) {
 *     변수 조건문이 참일때 실행할 반복문;
 * }
 */
public class For01 {
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("발사");

	}
}
