package car;

import java.util.Arrays;
import java.util.Scanner;

//문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 
//그 반복 횟수를 표시하여 문자열을 압축하기.
//입력 예시: aaabbcccccca
//출력 예시: a3b2c6a1

/*
입력
배열 만들기
반복문으로 배열에 입력값 넣어주기 
string -> char 바꿔서 배열 저장
다음 문자가 전 문자랑 같은지 배열 비교 
반복문 while을 통해 a와 같아???
같으면 횟수 카운트 + 해당 문자 출력
반복문 while을 통해 b와 같아???
같으면 횟수 카운트 + 해당 문자 출력
반복문 while을 통해 c와 같아???
같으면 횟수 카운트 + 해당 문자 출력
만약 배열 같아 count++
 */

public class Test03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int countA = 0;

		System.out.println("abc를 랜덤으로 입력해주세요.");
		String input = sc.next();
		char arr01[] = new char[input.length()];
		char temp = (char) (arr01[1] - arr01[0]);

		for (int i = 0; i < input.length(); i++) {
			arr01[i] = input.charAt(i);
		}
		
		for (int j = 0; j < input.length()-1; j++) {
			while (arr01[j] == arr01[j+1]) {
				countA++;
				break;
			}
			System.out.print('a' + countA);
		}	
			
			
			
			

		System.out.println(Arrays.toString(arr01));

	}

}
