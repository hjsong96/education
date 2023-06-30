package isHas;

import java.util.HashSet;
import java.util.Set;

/*
 *  is a // ~은 ~ 입니다.
 * 
 * 
 * 
 *  has a // ~은 ~를 가집니다.
 * 
 * 
 * 
 */
class Human {
	String name;
	int age;
	int sex;
}

class Student extends Human {
	int number;
	String major;
}
// 학생은 사람입니다. 


class Gun{
	String name;
	int shot;
}

class Police{
	Gun gun;
}
//경찰이 총을 가지고 있습니다. 


public class IsHas {
	public static void main(String[] args) {
		
		int a = 12, b = 5, sum = 2;
		b *= a /= 4; //b=15 a=3
		sum += ++a * b-- / 4;  // 4 * 15 / 4 = 15
		System.out.printf("%d", sum); //17
		
		System.out.println("");
		
		System.out.printf("%c", 'C');
		System.out.printf("%s", "문자열");
		System.out.printf("%d", 33);
		System.out.printf("%f", 3.14); //소수점 6자리
		System.out.printf("%.1f", 3.14); //소수점 한자리만 나오게...
		System.out.printf("%b", true);
		System.out.printf("%o", 8); //8진수
		System.out.printf("%x", 17); //16진수 
		System.out.printf("줄바꿈%n"); //줄바꿈 \n
		System.out.printf("%5d", 1); //5칸을 만들고 1을 출력 빈공간은 스페이스
		System.out.printf("%05d\n", 1); //5칸을 만들고 1을 출력하되 빈자리는 0
		System.out.println(""); //엔터
		
		System.out.printf("(%5d)", 55); //(___55)
		System.out.printf("(%-5d)", 55); //(55___)
		
		System.out.println("");
		
		System.out.printf("%-10s\n", "가나다라");
		System.out.printf("%10s\n", "가나다라");
		
		System.out.println(Math.sqrt(3));
		
		
	}

}
