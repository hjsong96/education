package iotest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample02 {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("c:\\temp\\test1.db");
		
		byte[] array = {10, 20, 30};
		os.write(array); //1 index 부터 3개값
		
		os.flush();
		os.close();
		
	}
}
