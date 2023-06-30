package oop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//입력값 배열로 받기
//랜덤으로 반 삭제
//출력하기

public class Finger {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 숫자를 입력해주세요 : ");   
		String input = sc.nextLine();       //입력값 배열로 받기

		String[] temp = input.split(" ");   //공백 기준으로 나눠서 temp 배열에 넣기
		
		int[] arr01 = new int[temp.length];  //temp.length 만큼 int arr01 배열에 넣어주기
		for (int i = 0; i < arr01.length; i++) { // String 값으로 받은 temp[] 값 int 로 변경해주기
			arr01[i] = Integer.parseInt(temp[i]); // ※ string -> int로 변경 Integer.parseInt
		}
		
		System.out.println(Arrays.toString(arr01));
		
		int NewLength;
		if (arr01.length % 2 == 0) { //짝수일 경우 절반 날리기
			NewLength = arr01.length / 2;
		} else {
			if (Math.random() > 0.5) { //홀수일 경우 절반 혹은 절반보다 더 날리기
				NewLength = (arr01.length / 2);
			} else {
				NewLength = (arr01.length / 2) + 1;
			}
		}

		int[] arr02 = new int[NewLength];

		for (int i = 0; i < NewLength; i++) {
			arr02[i] = arr01[ (int) (Math.random() * arr01.length) ];  //arr01[]을 랜덤으로 arr02에 넣어주기
			for (int j = 0; j < i; j++) {  //중복값 제거
				if (arr02[i] == arr02[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr02)); //배열출력
	}
}
