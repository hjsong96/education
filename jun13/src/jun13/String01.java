package jun13;

import java.util.Arrays;
import java.util.Iterator;

//String 사용법
/*
 * 문자열, "값", 값 불변, 주소, 참조타입
 * 
 */

public class String01 {
	public static void main(String[] args) {

		int num = 10;
		int num2 = 10;

		String str = new String("Hi");
		String str2 = new String("Hi");

		if (str.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}

		// 문자열 = 문자 + 문자 + 문자 + 문자....
		char[] ch = { '가', '&', 'A', '1' };
		String str3 = new String(ch); // 생성자는 메소드
		System.out.println(ch);

		byte[] by = new byte[] { 65, 66, 67, 68, 69, 70 };
		String str4 = new String(by);
		System.out.println(str4);

		String str5 = new String(by, 0, 2); // src, 시작위치, length
		System.out.println(str5);

		str2 = "안녕하세요.";
		System.out.println(str2.length());
		char ch2 = str2.charAt(3);
		System.out.println(ch2);

		for (int i = 0; i < str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
		
		str2 = "가나다라마바사";
		System.out.println(str2.length());
		//맨 마지막 글자 "사"를 뽑아주세요
		System.out.println(str2.charAt(6));
		System.out.println(str2.charAt(str2.length() - 1));
		
		String str6 = "jdlksfjlweifjlsdkfjksfjskdlfjvmcleruirtoregjklfslkdfjlweirjedsfkl";
		//여기에서 e가 몇 개 있는지 갯수를 출력해주세요.
		
		int count = 0;
		for (int i = 0; i < str6.length(); i++) {
			if (str6.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);
		
		String str7 = str2.concat("님"); // "가나다라마바사" + 님
		System.out.println(str7);
		//해당 글자를 포함하고 있는지 물어보기
		System.out.println(str2.contains("님"));
		System.out.println(str7.contains("님"));
		System.out.println(str7.contains("가"));
		System.out.println(str7.contains("가나다"));
		
		//indexOf : 어디에서 시작하는지 위치. 
		System.out.println(str7.indexOf("나")); //1
		System.out.println(str7.indexOf("님")); //7
		System.out.println(str7.indexOf("라마바")); //3
		System.out.println(str7.indexOf("타파하")); //-1
		
		//replaceAll 치환하다, 바꾸다 "p" 를 "피" 로 바꿀래 
		String apple = "apple";
		apple = apple.replaceAll("p", "피");
		System.out.println(apple);
		
		//str2 = "가나다라마바사";
		//substring string을 잘라내 내가 원하는 부분까지 가져오는 것
		String result = str2.substring(3); //"라마바사" 시작위치부터 끝까지
		System.out.println(result);
		
		result = str2.substring(1, 5); //시작index, 끝index
		System.out.println(result);
		
		result = str2.substring(3, 4); //라
		System.out.println(result); //시작위치 <= a < 끝위치
		
		//equalsIgnoreCase()
		apple = "apple";
		System.out.println(apple.equalsIgnoreCase("apple"));
		System.out.println(apple.equalsIgnoreCase("APPLE"));
		System.out.println(apple.equals("apple"));
		System.out.println(apple.equals("APPLE"));
		
		//getByte()
		byte[] appleByte = apple.getBytes();
		System.out.println(Arrays.toString(appleByte));
		
	}

}
