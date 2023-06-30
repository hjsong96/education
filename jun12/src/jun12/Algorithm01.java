package jun12;
//알고리즘 : 수학과 컴퓨터 과학, 언어학 또는 엮인 분야에서
//           어떠한 문제를 해결하기 위해 정해진 일련의 절차
//           문제 풀이에 필요한 계산 절차 또는 처리 과정의 순서.
//           산법, 셈법, 계산절차.
public class Algorithm01 {
	public static void main(String[] args) {

		int num01 = 10;
		int num02 = 20;
		//num01에 있는 10을 num02로,
		//num02에 있는 20을 num01로 옮기고 싶다면?

		int temp;
		temp = num01; //num01 값 10이 temp 에 10으로 저장
		num01 = num02; //num02 20 값 20이 num01 에 저장
		num02 = temp; //temp 10의 값이 num02 에 저장
		
		System.out.println(num01); //20,
		System.out.println(num02); //10이라고 출력되어야 합니다. 
		//2323-06-12 프로그래밍 언어활용
		
		
		
	}

}
