package jun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Arraylist 로 활용해보기
//입력값 받기
//홀수일 경우 절반보다 작거나 크거나
//짝수일 경우 반 날리기

public class Finger {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력해 주세요 (개수무관) : ");
		String input = sc.nextLine();
		String[] str = input.split(" ");  
		
		ArrayList<String> arr01 = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			arr01.add(str[i]);
		}
		System.out.println(arr01);
		
		int NewLength;
		if (arr01.size() % 2 == 0) {
			NewLength = arr01.size() / 2;
		} else {
			if (Math.random() > 0.5) {
				NewLength = (arr01.size() / 2) - 1;
			} else {
				NewLength = (arr01.size() / 2) + 1;
			}
		}
		
		//remove 
		
		int[] arr02 = new int[NewLength];

		for (int i = 0; i < NewLength; i++) {
			arr02[i] = arr01[];
			for (int j = 0; j < i; j++) {
				if (arr02[i] == arr02[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr02));
		
	}

}
