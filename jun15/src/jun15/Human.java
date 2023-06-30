package jun15;

import java.util.Scanner;

import zoo.Animal;
import zoo.Cat;

public class Human {
	//필드
	//사람에게 필요한 정보 -> 필요한 정보만 남기고 필요없는 거 빼버림
	
	//생성자
	//메소드
	
	String name;
	int age;
/*	String sex;
	String ssn;
	String address;
	
	public void sleep() {
	}
	public void speak() {
	}
	public void work() {
	}
	public void eat() {
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
	    String inputName = sc.next();
	    name = inputName;
		System.out.print("나이를 입력하세요 : ");
	    int inputAge = sc.nextInt();
	    age = inputAge;
		System.out.print("성별을 입력하세요 : ");
	    String inputSex = sc.next();
	    sex = inputSex;
		System.out.print("주민번호를 입력하세요 : ");
	    String inputSsn = sc.next();
	    ssn = inputSsn;
		System.out.print("주소를 입력하세요 : ");
	    String inputAddress = sc.next();
	    address = inputAddress;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(ssn);
		System.out.println(address);
		}
*/	
	public void myInfo() {
		System.out.println("내 이름은 " + name + " 입니다.");
		System.out.println("내 나이는 " + age + "살 입니다.");
	}
	/*int[] i = new int[3];
	i[0] = 1;
	 */
	public static void main(String[] args) {
		
	Human h = new Human(); //생성자
	System.out.println("h : " + h); //jun15.Human@3d012ddd
	Human[] man = new Human[3];
	System.out.println("array : " + man); //Ljun15.Human;@626b2d4a
	man[0] = h; //
	man[1] = new Human();
	man[2] = new Human();
	man[1] = man[0]; //메모리에서 [1]이 소거됩니다. GC = 메모리 자동 관리
	System.out.println("array : " + man[0]); //jun15.Human@3d012ddd
	System.out.println("array : " + man[1]); //jun15.Human@3d012ddd
	System.out.println("array : " + man[2]); //jun15.Human@1c4af82c
	
	h.name = "홍길동";
	System.out.println(h.name);
	System.out.println(man[0].name);
	System.out.println(man[1].name);
	System.out.println(man[2].name);
	
	System.out.println(h == man[1]); //R type 에서는 객체 비교
	System.out.println(h == man[2]); //R type 에서는 객체 비교
	
	man[1] = new Human();
	System.out.println("array[1] : " + man[1]); //jun15.Human@1c4af82c
	
	Human h2 = man[0]; //h와 동일
	Object[] arr01 = new Object[3];
	arr01[0] = h;
	arr01[1] = 1000;
	arr01[2] = "이것도 됩니다";
	
	int number = (int) arr01[1];
	System.out.println(number);
	
	String str = (String) arr01[2];
	System.out.println(str);
	
	Human h3 = (Human) arr01[0];
	System.out.println(h3);
	
	//다른 패키지에 있는 클래스 호출
	//cat
	Cat tom = new Cat();
	tom.name = "톰";
	
	}

}

/*h.input();
	h.print();
	h.myInfo();
 */



