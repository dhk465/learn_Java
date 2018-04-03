package ex5_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex2_FileReader {
	public static void main(String[] args) throws IOException {
		
		// 파일내 대문자 수와 소문자 수를 출력한다
		// 대문자: 4
		// 소문자: 12
		
		FileReader fr = null;
//		String str = "";
		int upper = 0;
		int lower = 0;
		
		try {
			
			
			fr = new FileReader(FilePath.PATH + "/test.txt");
			int code = -1;
			
			while ((code = fr.read()) != -1) {
				if (code >= 'A' && code <= 'Z')
					upper++;
				if (code >= 'a' && code <= 'z')
					lower++;
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				fr.close();
			}
		} // try-catch-finally
		
/*		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upper++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lower++;
			}
		} */
		
		System.out.println("대문자: " + upper);
		System.out.println("소문자: " + lower);
		
	}
}
