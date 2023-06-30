package jun13;

import java.time.LocalDate;
import java.time.LocalDateTime;

//아스키 코드 시계
public class Clock {
	public static void main(String[] args) {
		// 1 1
		// 3 11
		// 10 1010
		// 11 1011
		// 12 1100

		System.out.println(Integer.toBinaryString(60));
		// 1 1 1 1 0 0
		// 32 16 8 4 2 1
		System.out.println(32 + 16 + 8 + 4);

		// Date
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth()); // 영어식
		System.out.println(ld.getMonthValue()); // 숫자
		System.out.println(ld.getDayOfMonth());

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getHour());// 시
		System.out.println(ldt.getMinute());// 분
		System.out.println(ldt.getSecond());// 초

		System.out.println(Integer.toBinaryString(ldt.getHour()));
		System.out.println(Integer.toBinaryString(ldt.getMinute()));
		System.out.println(Integer.toBinaryString(ldt.getSecond()));

		int[] h = new int[8];
		int[] m = new int[8];
		int[] s = new int[8];
		
		int hour = ldt.getHour();
		int min = ldt.getMinute();
		int sec = ldt.getSecond();

		for (int i = 0; i < h.length; i++) {
			h[i++] = hour % 2;
			hour = hour / 2;
		}

		for (int i = 0; i < 8; i++) {
			m[i++] = min % 2;
			min = min / 2;
		}

		for (int i = 0; i < 8; i++) {
			s[i++] = sec % 2;
			sec = sec / 2;
		}

		for (int i = 7; i >=0; i--) {
			System.out.print(h[i]);
		}
		System.out.println("");
		
		for (int i = 7; i >=0; i--) {
			System.out.print(m[i]);
		}
		System.out.println("");

		for (int i = 7; i >=0; i--) {
			System.out.print(s[i]);
		}

	}

}
