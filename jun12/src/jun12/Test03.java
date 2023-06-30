package jun12;
//문제
public class Test03 {
	public static void main(String[] args) {

		for (int i = 1, j = 0; i <= 5; i++) {
			j += i;
			System.out.print(i);
			if (i == 5) {
				System.out.print(" == ");
				System.out.print(j);
			} else {
				System.out.print(" + ");
			}
		}
		//실행하지 말고 답부터 생각해보고 실행해주세요
	}

}
