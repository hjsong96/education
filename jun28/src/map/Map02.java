package map;

import java.util.LinkedHashMap;

//쓰래드, net, gui

public class Map02 {
	public static void main(String[] args) {

		LinkedHashMap<String, String> map02 = new LinkedHashMap<String, String>();
		map02.put("5", "사과");
		map02.put("6", "배");
		map02.put("1", "포도");
		map02.put("9", "망고");
		map02.put("가", "두리안");
		map02.put("a", "두리안");
		
		System.out.println(map02);
		System.out.println(map02.keySet());
		
		
	}

}
