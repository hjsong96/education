package com.database;

import java.sql.ResultSet;
import java.util.List;

import com.database.DAO.EmployeesDAO;
import com.database.dto.EmployeeDTO;

public class Employees {
	public static void main(String[] args) {

		EmployeesDAO dao = new EmployeesDAO();
		List<EmployeeDTO> list = dao.selectList();
		
		System.out.println("번호\t 생년월일\t     이름 \t 성       성별   \t 입사일");
		System.out.println("==========================================================");
		for (EmployeeDTO e : list) {
			System.out.printf("%3d  ", e.getEmp_no());
			System.out.printf("%10s   ", e.getBirth_date());
			System.out.printf("%-10s ", e.getFirst_name());
			System.out.printf("%-10s ", e.getLast_name());
			System.out.printf("%2s   "  , e.getGender());
			System.out.printf("%10s  ", e.getHire_date());
			System.out.println("");
		}
		
	}

}
