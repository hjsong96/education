package updown;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

//1~100 숫자 랜덤설정
//값입력
//비교(while)
//boolean
//count
//

public class Up_Down {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("랜덤 숫자 1~ 100 입력 : ");

		int count = 1;
		int match = (int) (Math.random() * 100 + 1);
		boolean b = false;

		while (b == false) {
			int input = sc.nextInt();
			if (input < match) {
				System.out.println("UP");
				count++;
			} else if (input > match) {
				System.out.println("DOWN");
				count++;
			} else {
				System.out.println("정답입니다. 총" + count + "회 만에 나왔어요");
				b = true;
			}
		}
	}
}
