package jun13;

import java.util.Scanner;

//이상한 회사의 엘리베이터
public class Switch04 {
	public static void main(String[] args) {

		int input; 
		Scanner sc = new Scanner(System.in);
		System.out.println("직급을 선택하세요.");
		System.out.println("1.인턴 \t 2.대리 \t 3.과장 \t 4.부장 \t 5.사장");
		
		input = sc.nextInt();
		System.out.print("당신이 올라갈 수 있는 층은 ");
		
		switch (input) {
		case 1:
			System.out.println("1층 입니다.");
			break;
		case 2:
			System.out.println("2층 입니다.");
			break;
		case 3:
			System.out.println("3층 입니다.");
			break;
		case 4:
			System.out.println("4층 입니다.");
			break;
		default:
			System.out.println("전체 층입니다.");
			break;
		}
	}

}
