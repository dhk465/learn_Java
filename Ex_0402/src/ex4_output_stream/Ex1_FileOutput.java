package ex4_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex1_FileOutput {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(FilePath.PATH + "/fileoutput.txt");
			
			String str = "FileOutputStream의 예제입니다.";
			
			//str을 byte배열로 변환하여 fos를 통해 txt파일로 생성
			fos.write(str.getBytes());
		
		} catch (Exception e) {
			
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
		
	}
}
