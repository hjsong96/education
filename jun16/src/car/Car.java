package car;

public class Car {

	//필드 = 인스턴스 변수, 클래스 변수
	
	static String company = "현대자동차"; //클래스 변수 = 클래스명.변수명
	String model; //인스턴스 변수 (객체를 따라가는 값) = 인스턴스변수명.변수명
	String color; //
	int maxSpeed;
	
	Car() {
		System.out.println("자동차를 만듭니다.");
	}
	Car(String model) {
		this();
		this.model = model;
	}
	Car(String model, String color) {
		//this.model = model;
		this(model);
		this.color = color;
	}
	Car(String model, String color, int maxSpeed) {
		//this.model = model;
		//this.color = color;
		this(model, color);
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {//Car.main()
		//static 붙은 변수 호출하기
		//클래스명.static 붙은 변수명;
		
		Car.company = "현대자동차 입니다.";
		
		
		
		Car car1 = new Car();
		System.out.println(Car.company);
		
		Car.company = "기아 입니다.";

		Car car2 = new Car("자가용");
		System.out.println(car2.company);
		System.out.println(car2.model);
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);

	}

}
