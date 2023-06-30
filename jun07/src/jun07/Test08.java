package jun07;

import java.util.Iterator;

public class Test08 {
	public static void main(String[] args) {
		// 1 ~ 10 까지 출력
		int sum = 0;
		// 여기서 10까지 짝수만 다 더하면?
		for (int i = 0; i < 11; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	// 탈출
}
