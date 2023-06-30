package jun07;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요.");
		//100 ~ 90 A
		// 89 ~ 80 B
		// 79 ~ 70 C
		// 0 ~ 69 F
	     
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	     
		
		if (input >= 90) {
			System.out.println("A 입니다.");
		} else if (input > 79) {
			System.out.println("B 입니다.");
		} else if (input > 69) {
			System.out.println("C 입니다.");
		} else {
			System.out.println("F 입니다.");
		}
	}
}
