package ex4_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex2_BufferedOutput {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(FilePath.PATH + "/bufferedOutput.txt");
			bos = new BufferedOutputStream(fos);
			
			String str = "BufferedOutputStream의 예제입니다.";
			
			String str2 = "두번째 라인입니다.";
			
			bos.write(str.getBytes());
			bos.write(str2.getBytes());
			
		} catch (Exception e) {
			
		} finally {
			// BufferedStream은 바이트를 모아놓고 처리를 하여
			// 닫는 작업을 할때 flush가 되어 write함수가 끝난다.

			if (bos != null) {
				bos.close();
			}
			
			if (fos != null) {
				fos.close();
			} // fos.close()가 bos.close()보다 먼저 오면 bos.write가 참조 경로를 찾지 못한다.
			
		}
		
		
	}
}
