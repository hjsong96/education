package socket;
//소켓통신
/*
 * 소켓을 이용하는 통신 프로그램
 * 소켓 : 프로세스간 통신에 사용되는 양 끝단을 이야기합니다.
 * java.net 안에 있습니다. tcp/udp 를 사용하는 소켓프로그램이 대표적입니다.
 * TCP/IP
 * 소켓 : TCP/IP 기반 네트워크 통신에서 데이터 송수신의 마지막 접점을 말합니다.
 * 		  소켓 통신은 이러한 소켓을 통해 서버와 클라이언트 간 통신을 주고받는
 * 		  양방향 연결 지향성 통신을 말합니다.
 * 		  소켓통신은 보통 지속적으로 연결을 유지하면서 실시간으로 데이터를
 * 		  주고 받아야 하는 경우 사용됩니다.
 * 
 * 		  소켓은 서버/클라이언트 소켓으로 구분됩니다.
 * 		  소켓간 통신을 위해서는 네트워크 간 클라이언트와 서버에 해당하는
 * 		  컴퓨터를 식별하기 위한 IP주소와 해당 컴퓨터 내에서 현재 통신에
 *  	  사용되는 응용 프로그램을 식별하기 위한 포트번호가 사용됩니다.
 * 
 * 
 * UDP : 유튜브 : 연결이 확인되면 무조건 전송만 합니다.
 * TCP : 데이터를 전송하기 전에 먼저 상대편과 연결한 후 데이터를 전송합니다.
 * 		 전송되었는지 확인하고 실패 시 재전송을 하여 다시 확인합니다.
 * 
 */

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Socket01 {
	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());
	}
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5000);
			System.out.println(getTime() + "접속되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (true) {
			System.out.println(getTime() + "접속 대기중 ...");
			try {
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + " " + socket.getInetAddress() + "로부터 요청이 들어욤.");
				OutputStream outputStream = socket.getOutputStream();
				DataOutputStream dataout = new DataOutputStream(outputStream);
				
				//원격 소켓 보내기
				dataout.writeUTF(getTime() + "서버에서 온 메시지 입니다.");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				
				dataout.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
