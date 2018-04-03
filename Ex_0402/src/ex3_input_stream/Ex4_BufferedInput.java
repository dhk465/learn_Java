package ex3_input_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex4_BufferedInput {
	public static void main(String[] args) throws IOException {
		
		// Buffered스트림을 통해 파일을 읽거나 쓸때 버퍼링 작업을 수행
		// 입출력할 자료를 버퍼 메모리 공간에 모아두었다가 한번에 출력
		// 이 공간을 활용하면 입출력 속도 향상에 도움
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		byte[] result = new byte[100];
		
		try {
			
			String path = FilePath.PATH + "/test.txt";
			
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			
			bis.read(result);
			
			System.out.println(new String (result));
			
		} catch (Exception e) {
			
		} finally {
			
			// try에 넣어두면 Exception 발생시 close()되지 않을 수 있어
			// finally에 넣어둔다.
			fis.close();
			bis.close();
			
		}
		
	} // main
}
