package jun14;

import java.util.Arrays;
import java.util.Spliterator;

public class Test02 {
	public static void main(String[] args) {

		//String클래스 속 split() 메소드 입니다.
		//지정된 형태를 찾아 잘라줍니다.
		String tel = "010-2799-2216";
		//tel.split("자를 기호"); ---> String 배열형태로 나옵니다.
		String[] telSplit = tel.split("-"); // - 를 자를 기호로 사용
		
		System.out.println(Arrays.toString(telSplit));
		//결과 [010, 2799, 2216]
		
		String pet = "R2D2가,배고프다고,합니다."; //잘라주세요
		//우리가 스물다섯명이니 5팀 5명씩
		//6명씩 4팀(한팀 7명)
		
		String[] petSplit = pet.split(",");
		System.out.println(Arrays.toString(petSplit));
		
		String test = "가 나다 라마 바 사아자 차카 타파 하";
		String[] splitTest = test.split(" ");
		System.out.println(Arrays.toString(splitTest));
		System.out.println(splitTest[4]);
		
	}
}

/*
 * 지금까지 했던 것...
 * 데이터 타입
 * 이름 만들기
 * 변수, 상수, 클래스, 메소드
 * if, switch
 * for, while, do~while
 * break, continue
 * 랜덤
 * 배열, 1, 2차 동적가변배열, 배열복사, 깊은복사, 얕은복사
 * 
 * main 메소드 속에서만 작업했어요. -> 다른메소드, 다른 클래스, 다른 패키지
 * 
 * 1. 메인 메소드(파라미터) 사용해보기
 * 2. 객체지향
 * 3. 클래스 형태, 메소드 형태, 파라미터, 리턴타입
 * 
 */


