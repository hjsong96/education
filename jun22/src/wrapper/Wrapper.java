package wrapper;

import java.util.ArrayList;
import java.util.List;

//랩퍼 클래스
/*
 * 컬랙션 타입은 참조값만 담을 수 있습니다.
 * 	= 기본 자료형의 값은 담을 수 없습니다.
 * 
 * 기본 자료형의 값을 컬랙션에 담기 위해서는 랩퍼 클래스를 사용합니다.
 * 모든 기본 자료형에 대해서 그에 대응하는 랩퍼 클래스가 있습니다.
 * 기본 자료형의 값을 멤버 변수의 값으로 저장하고
 * 이 값 주위로 값을 가공하는 메소드들이 감싸고 있다고 해서
 * 랩퍼(감싸다) 클래스라고 합니다. 
 * 
 * 기본 자료형            랩퍼 클래스
 * char-------------------Character
 * boolean----------------Boolean
 * byte-------------------Byte
 * short------------------Short
 * int--------------------Integer
 * long-------------------Long
 * float------------------Float
 * double-----------------Double
 * 
 */

public class Wrapper {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = 100; //오토 박싱
		
		if (i1.equals(i2)) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
		
		int num = i2; //오토 언박싱
		System.out.println(num);
		
		Object obj = 10;
		System.out.println(obj);
		
		int num2 = (int)obj + 1;
		System.out.println(num2);
		
		int num3 = ((Integer)obj).intValue() + 1;
		System.out.println(num3);
		
		
		
		
		
	}
}
