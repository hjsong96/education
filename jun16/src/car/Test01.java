package car;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {

		int[][] arr = new int[][] { { 45, 50, 75 }, { 89 } };
		/*
		 * System.out.println(arr[0].length); System.out.println(arr[1].length);
		 * System.out.println(arr[0][0]); System.out.println(arr[0][1]);
		 * System.out.println(arr[1][0]);
		 */

		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}
}
