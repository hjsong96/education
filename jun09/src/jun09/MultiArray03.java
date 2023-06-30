package jun09;

import java.util.Iterator;

//홀수를 입력 받았을 때 N으로 N자 만들기
public class MultiArray03 {
	public static void main(String[] args) {

		int[][] arr01 = new int[7][7];

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][0] = 1;
				arr01[j][6] = 1;
				if (i == j) {
					arr01[i][j] = 1;
				}
				System.out.print(arr01[i][j]);
			}
			System.out.println("");
		}

		/*
		 * 앞자리 1로 다 바꿔주기 뒷자리 1로 다 바꿔주기
		 * 
		 * [1,0,0,0,0,0,1] 00 06 [1,0,0,0,0,0,1] 10 16 [1,0,0,0,0,0,1] 20 26
		 * [1,0,0,0,0,0,1] 30 36 [1,0,0,0,0,0,1] 40 46 [1,0,0,0,0,0,1] 50 56
		 * [1,0,0,0,0,0,1] 60 76
		 * 
		 */

	}

}
