package jun02;
//여러분은 과수원을 경영하고 있습니다.
/* 키우는 과일은 사과, 배, 오렌지 입니다.
 * 각각 하루 생산량은 5, 7, 5 개 입니다.
 * 위 값을 기준으로 하루에 총 생산되는 과일의 수를
 * 출력시키고, 하루를 기준으로 시간당 몇 개의 과일이
 * 생산되는지를 출력해주세요.
 * 
 * 예 ) 총 생산 갯수 : 17
 * 		시간당 생산 갯수 : 0.0014598
 * 
 * 최대한 많은 변수를 만들어서 해주세요.
 * 반드시 한 번의 리터럴과 캐스팅을 활용해주세요.
 * 평균 변수는 모두 float 타입으로 선언해주세요.
 */


public class DataType03 {

	public static void main(String[] args) {
		int apple = 5;
		int pear = 7;
		int orange = 5;
		int total;
		float avg;
		
		total = apple + pear + orange;
		avg = (float) (total / 24.0); // int / double = double로 표시
		//계산에서 서로 다른 타입이 계산된다면
		//최고 큰 타입으로 변환이 일어납니다.
		
		System.out.println("총 생산 갯수 : " + total);
		System.out.println("시간당 생산 갯수 : " + avg);
		// + 기호
		// 숫자 + 숫자 = 계산됩니다.
		// 문자 + 숫자 = 연결됩니다. 
		
		
	}

}
