package jun09;

import java.util.Arrays;

public class MultiArray02 {
	public static void main(String[] args) {
		// 1 ~ 25 5 x 5 정수타입

		int[][] arr01 = new int[5][5];

		int num = 1;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][j] = num++;
				System.out.print(arr01[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("==============");

		// 출력 1.5 자바에서 업데이트 된 내용
		for (int[] is : arr01) {// 내부요소 : 집합
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}

		System.out.println("==============");

		int[] t = { 10, 12, 13, 14, 15 };
		for (int i : t) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		System.out.println("==============");

		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}

		System.out.println("==============");

		
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(Arrays.toString(arr01[i]));

		}

	}
}
