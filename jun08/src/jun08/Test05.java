package jun08;

import java.util.Arrays;

//String 자르기
public class Test05 {
	public static void main(String[] args) {

		String word ="Hello";
		//            01234
		System.out.println(word.length()); //5
		
		System.out.println( word.charAt(4) );; //
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print( (char) (word.charAt(i)+3) );
		}
		
		System.out.println("================");
		System.out.println( word.substring(2)); //llo
		System.out.println( word.substring(2,4)); //He
		
		String name = "가나다라마법사";
		String shortName = name.substring(4,7);
		System.out.println(shortName);
		System.out.println(name.length());
	}

}
