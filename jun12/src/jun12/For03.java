package jun12;
//label : break 나 continue 가 실행할 반복문의 위치를 이름으로 지정
public class For03 {
	public static void main(String[] args) {
		
		A: for (int i = 0; i < 10; i++) {
			B: for (int j = 0; j < 10; j++) {
				if (j == 5) {
					break A; //가장 가까운 반복문을 탈출합니다.
				} 
				System.out.println(i + "" + j);
			}
		}
		

	}

}
