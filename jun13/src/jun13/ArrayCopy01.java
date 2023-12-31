package jun13;

import java.util.Arrays;

//배열복사
//깊은복사
//얕은복사
public class ArrayCopy01 {
	public static void main(String[] args) {

		int[] arr01 = { 50, 100, 150 };
		int[] arr02 = new int[3];

		System.arraycopy(arr01, 0, arr02, 0, 3);
		/* src : 원본대상
		 * srcPos : 원본의 어느 위치부터 읽어올 것인지
		 * dest : 값을 담을 배열
		 * destPos : 어느 위치에 저장할 것인지
		 * length : 어느 길이만큼 읽어올 것인지 = 배열의 길이
		 */
		
		arr01[0] = 9;

		System.out.println(Arrays.toString(arr01)); // [9, 100, 150]
		System.out.println(Arrays.toString(arr02)); // [50, 100, 150]

		int[] arr03 = new int[5]; //[0, 0, 50, 100, 150] 가 되게 해주세요.
		
		System.arraycopy(arr02, 0, arr03, 2, 3);
		System.out.println(Arrays.toString(arr03));
		
		
		int[] arr04 = { 10, 20, 30, 40, 50};
		int[] arr05 = new int[5];
		//arr05의 값을 { 0, 20, 30, 40, 0};이 되게 arrayCoppy 써주세요.
		
		System.arraycopy(arr04, 1, arr05, 1, 3);
		System.out.println(Arrays.toString(arr05));
		
	}

}
