package jun07;

import java.util.Iterator;

//별찍기
//2023-06-07 응용SW 기초기술 활용
public class For01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {// i = 0
			for (int j = 0; j <= i; j++) {// j = 5
				System.out.print("*");
			}
			System.out.println("");// 엔터같은 효과
		}

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 0; i < 5; i++) {//외부측
			for (int j = 4; j > i; j--) {//스페이스바
				System.out.print("_");
			}
			for (int j = 0; j <= i; j++) {//내부측 *
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < 5; i++) {//외부측
			for (int j = 4; j > i; j--) {//스페이스바
				System.out.print("_");
			}
			for (int j = 0; j <= i*2; j++) {// 여기를 수정
				System.out.print("*");
			}
			System.out.println("");
		}
/*

____*      4  1
___***     3  3
__*****    2  5
_*******   1  7
*********  0  9

*/
		for (int i=1; i<10; i++) {
			System.out.print(i + " ");
			if (i % 3 == 0) {
				System.out.println("");
			} 
		}
/*

1 2 3
4 5 6
7 8 9

*/
		for (int i = 1 ; i <= 5; i++) {
			for (int j = 1; j <= (5-i); j++) {
				System.out.print("_");
			}
			for (int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

		
/*
___*
__***
_*****
__***
___*

*/
	}
}
