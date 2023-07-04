package jul04;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;

//Net
/*
 * 네트워크 : 컴퓨터 두 대 이상을 하나의 케이블로 연결함
 * java.net
 * 
 * 서버와 클라이언트
 * 컴퓨터간의 관계 / 하나의 서버에 여러 클라이언트가 연결된 형태
 * 서버 : 서비스를 제공합니다.
 * 클라이언트 : 서버가 제공하는 서비스를 제공받아요. 
 * 
 * P2P : 클라이언트가 서버 역할을 동시에 수행하는 것.
 * 
 * ip : 네트워크 상에서 고유한 자신의 주소
 * IPV4 : 173.100.116.50  / 192.168.0.1
 * IPV6 (128비트) FFED:0:0:0:0:BA98:3210:4562
 * 
 * port
 * ftp: 21  ssh: 22  http: 80  mariadb: 3306  oracle: 1502  mail: 25 
 */

public class Net01 {
	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;

		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName : " + ip.getHostName());
			System.out.println("getHostAddr : " + ip.getHostAddress());
			System.out.println("문자열로 보기 : " + ip.toString());

			byte[] ipAddr = ip.getAddress();
			System.out.println("getHostAddr : " + Arrays.toString(ipAddr));
			String result = "";
			for (int i = 0; i < ipAddr.length; i++) {
				result += ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i];
				result += ".";
			}
			System.out.println("getAddr() + 256 : " + result);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("==================================================");
		//내 아이피 찍기
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName : " + ip.getHostName());
			System.out.println("getHostAddr : " + ip.getHostAddress());
			System.out.println("문자열로 : " + ip.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
