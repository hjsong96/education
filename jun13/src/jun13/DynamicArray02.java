package jun13;

import java.util.Arrays;

public class DynamicArray02 {
	public static void main(String[] args) {

		char[][] stars = new char[10][];
		//내부 크기를 랜덤하게 잡아주세요. 1 ~ 10까지
		
		
		for (int i = 0; i < stars.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			stars[i] = new char[random];  
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';
			}
		}
		for (char[] cs : stars) {
			System.out.println(Arrays.toString(cs));
		}
	
		//배열복사
		//깊은 복사 얕은 복사
		
		int[] arr03 = new int[] {50, 40, 30, 20, 10};
		int[] arr04 = arr03;
		int[] arr05 = new int[3]; 
		System.arraycopy(arr04, 0, arr05, 0, 3);;
		//                                  값3개  
		arr03[0] = 88;
		arr05[0] = 33;
		
		System.out.println(Arrays.toString(arr03)); //[33, 40, 30, 20, 10]
		System.out.println(Arrays.toString(arr04)); //[33, 40, 30, 20, 10]
		System.out.println(Arrays.toString(arr05)); //[33, 40, 30, 20, 10]
		
		
	}

}
