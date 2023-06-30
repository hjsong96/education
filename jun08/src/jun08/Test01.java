package jun08;

//구구단 2단을 출력하는 프로그램, for 문을 사용
public class Test01 {
	public static void main(String[] args) {
		// 반복되는 것을 찾으시면 쉽게 풀립니다.
		// i가 들어가면 좋을 위치를 찾아보세요.
		//%d = 정수      \n = 줄바꿈
		//%c = 문자,     %f = 실수
		//%b = 불리언    %o = 8진수
		//%s = 문자열    %x = 16진수
		String name = "홍길동";
		System.out.printf("제 이름은 %s 입니다.\n", name);
		double pi = 3.14;
		System.out.printf("파이는 %f 입니다.\n", pi);
		System.out.printf("파이는 %.2f 입니다.\n", pi);
		int money = 5000;
		System.out.printf("제 용돈은 %d원 입니다.\n", money);
		System.out.printf("제 용돈은 %,d원 입니다.\n", money);
		System.out.printf("제 용돈은 %10d원 입니다.\n", money);
		
		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("제 이름은 %10s입니다.\n", name);
		System.out.printf("제 이름은 %10s입니다.\n", "가나다라마");
		
		char ch = 65;
		System.out.printf("제 이름은 %c입니다.\n", ch);
		
		System.out.printf("제 이름은 %10d원 입니다.\n", 1000);//오른쪽 
		System.out.printf("제 이름은 %-10d원 입니다.\n", 1000);//왼쪽
		System.out.printf("제 이름은 %010d원 입니다.\n", 1000);//0000 
		
		for (int i = 1; i <= 9; i++) {
			//System.out.println("2 x " + i + " = " + (2 * i));
			System.out.printf("2 x %d = %d\n", i, (2*i));
		}
	}
}
