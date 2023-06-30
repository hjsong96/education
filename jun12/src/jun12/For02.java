package jun12;

//구구단 2단
public class For02 {
	public static void main(String[] args) {
		// (2 * i)가 10보다 작을 경우 출력하세요.
		for (int i = 1; i < 10; i++) {
			if (i * 2 >= 10) {
				break;
			}
			System.out.printf("%d * %d = %d\n", 2, i, (2 * i));
		}
		//책 156페이지에 나옵니다.
	}

}
