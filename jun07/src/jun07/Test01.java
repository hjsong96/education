package jun07;

import java.util.Scanner;//api

public class Test01 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
	     int input = sc.nextInt();//입력대기
	     System.out.println(Integer.toBinaryString(input));
	     
	     sc.close();//객체 닫기
	}

}
