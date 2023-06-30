package jun09;
//3 X 3 1 ~ 9까지 중복없이 나오기
public class MultiArray05 {
	public static void main(String[] args) {
		
		int[][] arr01 = new int[3][3];
		
		//입력
		
		int num = 1;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][j] = num++;
				System.out.print(arr01[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
