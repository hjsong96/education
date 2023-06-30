package jun09;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		int[][] arr01 = new int[3][3];

		int r1, r2;
		for (int i = 1; i < 10; i++) {
			r1 = (int) ((Math.random() * 3));
			r2 = (int) ((Math.random() * 3));
			if (arr01[r1][r2] == 0) {
				arr01[r1][r2] = i;
				System.out.println(r1 + "열 " + r2 + "행에 " + "입력");
			} else {
				i--;
				System.out.println("중복이므로 다시 뽑기");
			}
		}

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				System.out.print(arr01[i][j] + " ");
			}
			System.out.println("");
		}

	}
}