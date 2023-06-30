package jun08;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    String input;
	    
	    System.out.println("암호화 할 문장을 입력하세요.");
	    System.out.print("입력 : ");
	    
	    input = sc.nextLine();
	    input = input.toUpperCase();
		
	    char[] chInuput = input.toCharArray();
	    
	    System.out.println(Arrays.toString(chInuput));
		
	    for (int i = 0; i < chInuput.length; i++) {
	    	chInuput[i] = (char) (chInuput[i]+3);   
	    }
	    System.out.println(Arrays.toString(chInuput));
	}

}
