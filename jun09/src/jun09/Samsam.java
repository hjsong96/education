package jun09;

import java.util.Arrays;

//3x3 배열에 1~9숫자 입력하기
public class Samsam {
	public static void main(String[] args) {
		int[][] sam = new int[3][3];

		/*
		 * 1 2 3 00 01 02 4 5 6 10 11 12 7 8 9 20 21 22
		 * 
		 */

		// 입력
		for (int i = 0; i < sam.length; i++) {// 3
			for (int j = 0; j < sam.length; j++) {// 3
				sam[i][j] = (int) (Math.random() * 9 + 1);
				if (sam[i][j + 1] == sam[i][j]) {
					sam[i][j] = (int) (Math.random() * 9 + 1);
				} 
			}
		}
		for (int i = 0; i < sam.length; i++) {// 3
			for (int j = 0; j < sam[i].length; j++) {// 3
				sam[i][j] = (int) (Math.random() * 9 + 1);
				if (sam[i][j + 1] == sam[i][j + 2]) {
					sam[i][j] = (int) (Math.random() * 9 + 1);
				}
			}
		}

		// 출력
		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}

	}

}
