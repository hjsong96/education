package com.poseidon.board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poseidon.dto.BoardDTO;

@WebServlet("/board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Board() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//리스트 타입에 DTO 타입을 넣어서 10개 보내보겠습니다.
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		for (int i = 1; i < 11; i++) {
			BoardDTO dto = new BoardDTO();
			dto.setBno(i);
			dto.setBtitle(i + "번째 글입니다.");
			dto.setBwrite("홍길동");
			dto.setBdate("2023-07-03");
			dto.setBlike((int) (Math.random() * 100 + i));
			boardList.add(dto);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("board.jsp");
		request.setAttribute("Sdata", "전달합니다.");
		request.setAttribute("list", boardList);
		rd.forward(request, response);
		
	}

}
