package iotest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample03 {
	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("c:\\temp\\write.txy");
		
		char[] arr = {'A', 'B'};
		writer.write(arr);
		writer.write("안녕하세요\n");;
		writer.write("고생이 많으십니다\n");
		writer.write("String도 됩니다.\n");
		writer.write("각각 엔터표시는?\n");
		writer.write("엔터가 없어졌어요\n");
		
		writer.flush();
		writer.close();

	}

}
