package jun13;

import java.util.Arrays;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {

		// 프로그램을 실행하면 6자리 랜덤한 숫자 뽑기
		// 예 964563, 101854, 619691
		// 1부터 9까지 6자리

		/*
		 * int num[] = new int[6]; for (int i = 0; i < num.length; i++) { num[i] = (int)
		 * (Math.random() * 9) + 1; System.out.print(num[i]);
		 */

		// 프로그램을 실행하면 영문자대문자 + 숫자포함한 25개 key 만들기
		// 예 TC458 - 14568 - EFCVE - 15ERC - EGNCE
		// 예 EC462 - 10122 - QNRFV - 99EWW - ZNMTV
		// 예 EB050 - 69105 - PMLEP - 00MWI - LKJHF
		// 패턴 EENNN - NNNNN - EEEEE - NNEEE - EEEEE

		int[] pattern = new int[] { 0, 0, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, 2, 1, 1, 0, 0, 0, 2, 0, 0, 0, 0,
				0 };

		for (int i = 0; i < pattern.length; i++) {
			if (pattern[i] == 0) {//패턴이 영문자
				System.out.print((char) ((Math.random() * 26) + 65));
				                                        //0~25  A~Z
			} else if (pattern[i] == 1) {//패턴이 숫자
				System.out.print((int) (Math.random() * 10));
				                                      //0 ~ 9
			} else {//2일때 - 표시하기
				System.out.print("-");
			}
		}

	}

}
