package jun05;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요. 입력 : ");
		// 스캐너
		// 데이터타입 변수명 = 값;

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // nextInt() 정수 형태로 가져올꺼야

		System.out.println("당신이 입력한 숫자는 " + input);

		if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}

}
