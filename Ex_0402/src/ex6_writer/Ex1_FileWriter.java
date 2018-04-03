package ex6_writer;

import java.io.FileWriter;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex1_FileWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(FilePath.PATH + "/fileWriter.txt");
			
			String str = "나는 fileWriter의 예제 입니다.";
			
			fw.write(str);
			fw.write("\r\n");
			fw.write("두번째 라인");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
		
	}
}
