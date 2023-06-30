package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class Excel02 {
	public static String filePath = "c:\\temp";
	public static String fileNm = "Excel05.xls";

	public static void main(String[] args) throws IOException {
		// 빈 Workbook 생성
		//XSSFWorkbook workbook = new XSSFWorkbook();
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 빈 Sheet 를 생성
		HSSFSheet sheet = workbook.createSheet("직원데이터");

		// Sheet 를 채우기 위한 데이터들을 Map 에 저장
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("4", new Object[] { "3", "마카롱", "010-8700-4519"});
		data.put("1", new Object[] { "ID", "Name", "전화번호"});
		data.put("2", new Object[] { "1", "쿠키", "010-4521-5698"});
		data.put("5", new Object[] { "4", "소금빵", "010-5000-5907"});
		data.put("3", new Object[] { "2", "식빵", "010-8966-5658"});
		
		//data 에서 keySet 을 가져옵니다. 이 set 값들을 조회해서 sheet 에 입력
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String) {
					cell.setCellValue((String)obj);
				} else if (obj instanceof Integer) {
					cell.setCellValue((Integer)obj);
				}
			}
		}
		
		try {
			FileOutputStream out =
					new FileOutputStream(new File(filePath, fileNm));
			workbook.write(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}