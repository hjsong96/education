package jun05;
// 7일 수업내용 : 별찍기

public class For03 {

	public static void main(String[] args) {
		for (int i = 1; i < 26; i++) {
			if ((i % 3) == 0 && (i % 5) == 0) {
				System.out.println("Fizz Buzz");
			} else if ((i % 3) == 0) {
				System.out.println("Fizz");
			} else if ((i % 5) == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
