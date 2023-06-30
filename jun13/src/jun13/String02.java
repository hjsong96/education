package jun13;

public class String02 {
	public static void main(String[] args) {

		// 이메일 판별하기
		// poseidon@kakao.com
		
		
		String email = "poseidon@kakao.com";
		// System.out.println(email.indexOf('@')); //8
		
		// email.contains("@"
		if (email.indexOf('@') == -1) {
			System.out.println("email 형식이 아닙니다.");
		} else {
			//System.out.println("올바른 email 입니다.");
			String id = email.substring(0, email.indexOf('@'));
			String server = email.substring(email.indexOf('@')+1, email.length());
			System.out.println("id는 " + id + ", " + "server는 " + server);
			if (server.endsWith(".com") || server.endsWith(".net")) {
				System.out.println("올바른 서버입니다.");
			}

			//join("연결자", 값1, 값2, 값3....)
			String msg = String.join("", id, "님 반갑습니다.");
			System.out.println(msg);
			System.out.println(id + "님 반갑습니다.");
			
		} 
		
		//endWith() 이걸로 끝나?
		System.out.println(email.endsWith(".com"));
		System.out.println(email.endsWith(".net"));
		//.com
		//.net
		//.co.kr
		//.org
		
	}

}
