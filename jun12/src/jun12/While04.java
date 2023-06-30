package jun12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class While04 {
	public static void main(String[] args) {
		//성적 입력
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 인원의 점수를 입력 : ");
			int input = sc.nextInt();
			while (input > 100 || input < 0) {
				System.out.println("다시 입력해주세요.");
				input = sc.nextInt();
			}
			//배열에 점수 입력해주세요.
			score[i] = input; //배열에 저장하기
		}
		
		//출력
		System.out.println(Arrays.toString(score));
		sc.close();
	}

}
