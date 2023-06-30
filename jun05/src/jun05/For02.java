package jun05;

//이렇게 출력하려면 어떻게 하면 될까요?
//옆으로
//2 4 6 8 10

//

public class For02 {
	public static void main(String[] args) {
		for (int i = 2; i < 11; i++) {
			if ((i % 2) == 0) {
				System.out.print(i);
			} else {
				System.out.print(" ");
			}
		}
	}
}
