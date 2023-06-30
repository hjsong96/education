package jun09;

import java.util.Arrays;

//자바의 랜덤(난수) = 로또... 45/6
//앞에거랑 뒤에꺼 비교 통과 / 다시 검사

public class Test02 {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		// 1. 랜덤 Math.random()
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ((int) ((Math.random() * 45) + 1));

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			// 0 ~ 44
		}

		// 1 ~ 25중 하나만 뽑기

		int[] lotto2 = new int[1];

		// 1. 랜덤 Math.random()
		for (int i = 0; i < 1; i++) {
			lotto2[i] = ((int) ((Math.random() * 25) + 1));
			// 0 ~ 44
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(lotto2));
	}

}
