package jul08;

import java.util.ArrayList;
import java.util.Arrays;

//랜덤값 1 ~ 5 
//중복값 제거
//전이랑 후 같으면 다시 돌게 for문

public class Random {
	public static void main(String[] args) {
		
		int[] arr01 = new int[5];
		
		for (int i = 0; i < arr01.length; i++) {
			int random = (int) ((Math.random() * 5) + 1);
			arr01[i] = random;
			for (int j = 0; j < i; j++) {
				if (arr01[i] == arr01[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr01));
		
		for (int i : arr01) {
			System.out.print(i+"조 ");
		}
	
	
	
	}

}
