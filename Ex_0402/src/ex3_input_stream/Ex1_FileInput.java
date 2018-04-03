
package ex3_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = FilePath.PATH + "/test.txt";
		
		File f = new File(path);
		
		if (f.exists()) {
			try {
				
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				// 스트림은 더이상 읽을것이 없다면 -1을 반환하게 되어있다.
				// 즉, 접근한 파일의 모든 내용을 읽어오기 위해 반복문을 수행하고
				// 그 반복의 끝(EOF)인 -1을 만날때까지 반복하면 된다.
				while ((code = fis.read()) != -1) {
					if (code != 35) { // #은 읽지 않는다는 조건
						System.out.print((char)code + " ");
					}
				} // while
				
				// ...Stream클래스들은 byte기반
				// 1바이트씩만 읽을 수 있다
				// 그러므로 한글자당 2bytes인 한글은 깨져나온다 
				
				if (fis != null) { // null이 아니면 사용한적이 있다는 뜻
					fis.close(); // 스트림은 사용후 반듯이 닫아 줘야한다.
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
