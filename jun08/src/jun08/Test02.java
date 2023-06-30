package jun08;

import java.util.Iterator;

//2 ~ 9단까지 for 문으로 출력하기
public class Test02 {
	public static void main(String[] args) {
		//2단 옆에 3단, 4단 찍기 = 필요한 것 \t = tab

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println("");
		}
	}
}
