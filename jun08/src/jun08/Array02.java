package jun08;

import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Iterator;

/* 배열(Array)
 * 일단, 무조건 하나만 기억해주세요.
 * 배열은 객체입니다. 그리고 객체는 기본적으로 속성과 메소드를
 * 가지고 있습니다.
 * 이 중 배열만 유일하게 속성만 가지고 있습니다.
 * 
 * 배열은 동일한 타입의 데이터를 하나의 묶음으로 관리하기 위해
 * 사용되는 데이터 구조입니다.
 * 
 * 예를 들어 int 타입의 변수가 100 가 필요하다고 한다면?
 * 우리는 100개의 다른 이름, 다른 변수를 만들어야 합니다.
 * 시간도 많이 걸리고, 관리하기 어려워집니다.
 * 
 * 이를 보완하기 위해서 사용하는 것이 배열입니다.
 * 
 * 배열은 객체라고 했기 때문에 객체의 속성과 메소드를 사용해서
 * 배열을 관리합니다.
 * 배열은 유일하게 속성만 가지고 있습니다.
 * 배열의 속성 중 배열의 길이를 나타내는 length 가 있습니다.
 * 객체의 속성과 메소드 등을 호출할 때는 .(점) 을 사용합니다.
 * 
 */
public class Array02 {
	public static void main(String[] args) {
		// 10 9 8 7 6 5 4 3 2 1 = 10

		int[] arr01 = new int[10];
		for (int i = 9; i >= 0; i--) {
			arr01[i] = 10 - i;
		}
		System.out.println(Arrays.toString(arr01));

		// 생성 + 값입력
		int[] arr02 = new int[] { 10, 9, 8, 7, 5 };
		int[] arr03 = { 5, 4, 3, 2, 1 };
		
		/*
		 * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. 
		 * (단 점들의 배열은 모두 정렬되어있다고 가정한다.) 
		 * 예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
		 */
		
		int[] map = { 1, 3, 4, 8, 13, 17, 20 };
		int fir = 1; //시작 숫자
		int sec = 3; //끝 숫자
		int temp = map[1] - map[0]; //두 수의 차이

		//                            길이 - 1 -----> 마지막까지x
		for (int i = 0; i < map.length - 1; i++) {
			//System.out.print(map[i] + ", " + map[i + 1] + " : ");
			//System.out.println(map[i + 1] - map[i]);
			//                        i + 1까지 가게 하려고....
			if(map[i + 1] - map[i] < temp) {
				temp = map[i + 1] - map[i];
				fir = map[i];
				sec = map[i+1];
			}
		}
		System.out.println("두 거리의 차가 가장 작은 숫자는");
		System.out.println(fir + ", " + sec);
		//알고리즘, 자료구조

	}
}
