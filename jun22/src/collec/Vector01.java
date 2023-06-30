package collec;

import java.util.Arrays;
import java.util.Vector;

//DTO 파일 전송 객체(Data Transfer Object)

class BoardDTO{
	int bNo;
	String bTitle;
	String bWriter;
	int bRead;
	String bDate;
	
	public BoardDTO(int bNo, String bTitle, String bWriter, int bRead, String bDate) {

	this.bNo = bNo;
	this.bTitle = bTitle;
	this.bWriter = bWriter;
	this.bRead = bRead;
	this.bDate = bDate;
	
	}
	
}

public class Vector01 {
	public static void main(String[] args) {

		Vector<BoardDTO> board = new Vector<>();
		board.add(new BoardDTO(10, "열번째 글", "홍길동", 80, "2023-06-22"));
		board.add(new BoardDTO(9, "아홉번째 글", "아길동", 34, "2023-06-22"));
		board.add(new BoardDTO(8, "여덟번째 글", "여길동", 59, "2023-06-22"));
		board.add(new BoardDTO(7, "일곱번째 글", "칠길동", 6, "2023-06-21"));
		board.add(new BoardDTO(6, "여섯번째 글", "홍길동", 99, "2023-06-21"));
		board.add(new BoardDTO(5, "다섯번째 글", "다길동", 70, "2023-06-20"));
		board.add(new BoardDTO(4, "네번째 글", "네길동", 50, "2023-06-20"));
		board.add(new BoardDTO(3, "세번째 글", "세길동", 59, "2023-06-20"));
		board.add(new BoardDTO(2, "두번째 글", "두길동", 861, "2023-06-19"));
		board.add(new BoardDTO(1, "하나번째 글", "하길동", 12, "2023-06-19"));
		
		System.out.println("=============================================================");
		System.out.println("번호 \t  제목  \t\t 글쓴이  \t\t 조회수  \t 날짜");
		System.out.println("-------------------------------------------------------------");
		
		
		
		for (int i = 0; i < board.size(); i++) {
			BoardDTO ele = board.get(i);
			System.out.printf("%d  \t  %s  \t  %s  \t  %d  \t  %s\n" , 
					ele.bNo, ele.bTitle, ele.bWriter, ele.bRead, ele.bDate);
			System.out.println("");
		}
	}

}
