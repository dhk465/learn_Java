package ex5_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import ex2_io.FilePath;

public class Ex2_FileReader {
	public static void main(String[] args) throws IOException {
		
		// ���ϳ� �빮�� ���� �ҹ��� ���� ����Ѵ�
		// �빮��: 4
		// �ҹ���: 12
		
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
		
		System.out.println("�빮��: " + upper);
		System.out.println("�ҹ���: " + lower);
		
	}
}
