package com.database.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

import com.database.DBConnection;
import com.database.dto.EmployeeDTO;

//데이터베이스에 접속해서 일을 하는 DAO
public class EmployeesDAO {
	//10명 뽑기
	public List<EmployeeDTO> selectList() {
		List<EmployeeDTO> list = new ArrayList<>();
		//DB 접속 정보 가져오기
		DBConnection db = new DBConnection();
		Connection conn = db.getConn();
		//SQL문 만들기
		String sql = "SELECT * FROM employees LIMIT 10";
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			stmt = conn.createStatement();
			//실행하기
			rs = stmt.executeQuery(sql);
			//while로 뽑기
			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmp_no(rs.getInt(1));
				dto.setBirth_date(rs.getString(2));
				dto.setFirst_name(rs.getString(3));
				dto.setLast_name(rs.getString(4));
				dto.setGender(rs.getString(5));
				dto.setHire_date(rs.getString(6));
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
