package test;

public class TestDTO {
	private int num;
	private String str;
	
	public TestDTO(int num, String str) {
		this.num = num;
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	public static void main(String[] args) {
		TestDTO testDTO1 = new TestDTO(1, "문자열");
		TestDTO testDTO2 = new TestDTO(1, "문자열");
		System.out.println(testDTO1.equals(testDTO2));
		System.out.println(testDTO1.hashCode() == testDTO2.hashCode());
	}
}
