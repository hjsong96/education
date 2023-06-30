package jun13;

import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {

		String eight = "";
		int count = 0;

		for (int i = 1; i <= 10000; i++) {
			eight += i + "";
		}
		System.out.println(eight);
		System.out.println(eight.length());
		
		char[] arr01 = new char[eight.length()];
		
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = eight.charAt(i);
			if (arr01[i] == '8') {
				count++;
			} 
		}
		System.out.println(count);
		
	}

}