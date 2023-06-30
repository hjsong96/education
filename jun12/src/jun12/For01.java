package jun12;
//반복문을 제어합니다. 
public class For01 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				//break; //가장 가까운 반복문을 탈출합니다. 
				continue; //이하 실행문을 무시하고 다시 반복.
			}
			System.out.println("continue아래 문장입니다.");
		}
	}
}
