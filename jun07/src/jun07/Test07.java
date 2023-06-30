package jun07;

public class Test07 {
	public static void main(String[] args) {
		//String 클래스는 같은 값이 있으면 동일한 값을 저장합니다.
		//String 특이하게 변경불가능한 값을 저장합니다. 
		String str = new String("admin");
		String str2 = new String("admin");
		str = "111111";
		str = "111112";
		str = "admin"; //?
		//참조타입에서는 값 비교가 아니라 객체비교
		System.out.println(str == str2); // true
		
		StringBuffer sb = new StringBuffer();
		
		
		
	}
}
