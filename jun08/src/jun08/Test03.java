package jun08;

import java.util.Arrays;

// 알파벳을 A - Z 까지 저장하는 배열을 만들어주세요.
// char 하나에 한 글자씩 / for문 이용
public class Test03 {
	public static void main(String[] args) {

/*		char[] Alphabet = new char[26];

		for (int i = 0; i < Alphabet.length; i++) {
			Alphabet[i] = (char) (65 + i);
			System.out.println(Alphabet[i]);
		}
*/
		char[] alpha = new char[26];
		
		for (int i = 0; i < 26; i++) {
			alpha[i] = (char) (i + 65); 
		}
		System.out.println(Arrays.toString(alpha));
		System.out.println(alpha[0+3]);
		
	}

}
