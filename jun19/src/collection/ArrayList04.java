package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList04 {
	public static void main(String[] args) {
		/*ArrayList<Integer> arr01 = new ArrayList<Integer>();
		arr01.add(45);
		arr01.add(40);
		arr01.add(6);
		//indexOf((Integer) 45) 값 45가 있어?
		//indexOf(value) : 해당 값이 있는 index 반환
		System.out.println(arr01.indexOf((Integer) 45));
		System.out.println(arr01.indexOf(40));
		System.out.println(arr01.indexOf(5));
		
		//contains(value) : 해당 값이 있으면 참, 없으면 거짓 
		System.out.println(arr01.contains(45));
		System.out.println(arr01.contains(40));
		System.out.println(arr01.contains(10));
		*/
		
		//arr01 을 만들어주세요. (arraylist 이용)
		//6칸 1 ~ 45를 넣어주세요
		//중복이 있다면 제거해주세요. 참일때는 저장x 거짓일때는 저장0
		
		ArrayList<Integer> arr01 = new ArrayList<Integer>();
		
	      while(arr01.size() < 6) {
	          int num = (int)(Math.random() * 45) + 1;
	          if(!arr01.contains(num)) {
	             arr01.add(num);
	          }
	       }
	       
	       Collections.sort(arr01);
	       System.out.println(arr01);

	}
		
	}


