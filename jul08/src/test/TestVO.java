package test;

import java.util.Objects;

public class TestVO {
	private int num;
	private String str;
	
	public TestVO(int num, String str) {
		this.num = num;
		this.str = str;
	}	
	public int getNum() {
		return num;
	}
	public String getStr() {
		return str;
	}
	@Override
	public int hashCode() {
		return Objects.hash(num, str);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestVO other = (TestVO) obj;
		return num == other.num && Objects.equals(str, other.str);
	}
	
	public static void main(String[] args) {
		TestVO testVO1 = new TestVO(1, "문자열");
		TestVO testVO2 = new TestVO(1, "문자열");
		System.out.println(testVO1.equals(testVO2));
		System.out.println(testVO1.hashCode() == testVO2.hashCode());
	}
}


